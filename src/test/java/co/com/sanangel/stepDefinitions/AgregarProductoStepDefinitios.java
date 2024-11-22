package co.com.sanangel.stepDefinitions;

import co.com.sanagel.driver.SeleniumWebDriver;
import co.com.sanagel.steps.FacturacionSteps;
import co.com.sanagel.steps.CatalogoSteps;
import co.com.sanagel.steps.ValidacionSteps;
import io.cucumber.java.es.*;
import net.thucydides.core.annotations.Steps;

import static co.com.sanagel.driver.SeleniumWebDriver.driver;

public class AgregarProductoStepDefinitios {

    @Steps
    CatalogoSteps seleccionCatalogoSteps = new CatalogoSteps();
    @Steps
    FacturacionSteps facturacionSteps = new FacturacionSteps();
    @Steps
    ValidacionSteps validacionSteps = new ValidacionSteps();

    @Dado("Estoy en el menu de categorias de productos de SanAngel")
    public void estoyEnElMenuDeCategoriasDeProductosDeSanAngel() {

        SeleniumWebDriver.chromeDrive("https://sanangel.com.co/");
    }

    @Cuando("Aparecen la ventana de la categoria")
    public void aparecenLaVentanaDeLaCategoria() {

        seleccionCatalogoSteps.seleccionCatalogo();
    }

    @Cuando("Selecciono un producto para agregar al carrito")
    public void seleccionoUnProductoParaAgregarAlCarrito() {

        seleccionCatalogoSteps.comprarProducto();
    }

    @Entonces("Visualizare la ventana ade facturación")
    public void visualizareLaVentanaAdeFacturación() {

        facturacionSteps.Facturacion();
        validacionSteps.validacion();

        driver.close();
    }
}
