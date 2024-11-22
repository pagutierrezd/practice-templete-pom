package co.com.sanagel.steps;

import co.com.sanagel.pageObject.FacturacionPageObject;
import co.com.sanagel.utils.DatosExcel;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Map;

import static co.com.sanagel.driver.SeleniumWebDriver.driver;

public class ValidacionSteps {

    @Step
    public void validacion(){

        ArrayList<Map<String, String>> dataExcel;
        try {
            dataExcel = DatosExcel.leerDatosDeHojaDeExcel("parametros/Datos.xlsx", "Facturacion");

            WebElement tableElement = driver.findElement(FacturacionPageObject.getLblFacturacion());
            String textoEnTabla = tableElement.getText();
            Assert.assertEquals(dataExcel.get(0).get("ValidacionProducto"), textoEnTabla);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
