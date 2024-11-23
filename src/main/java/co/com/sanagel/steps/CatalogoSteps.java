package co.com.sanagel.steps;

import co.com.sanagel.pageObject.*;
import co.com.sanagel.utils.DatosExcel;
import net.thucydides.core.annotations.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Map;

import static co.com.sanagel.driver.SeleniumWebDriver.driver;

public class CatalogoSteps {

    @Step
    public void seleccionCatalogo() {
        seleccionClick(InicioPageObject.getBtnAmor());
    }

    public void comprarProducto() {
        seleccionClick(InicioPageObject.getBtnAmor());

        ArrayList<Map<String, String>> dataExcel;
        try {
            dataExcel = DatosExcel.leerDatosDeHojaDeExcel("parametros/Datos.xlsx", "Facturacion");

            esperarElementoVisible(CategoriaPageObject.getBtnProducto(dataExcel.get(0).get("Producto")), Duration.ofSeconds(15));
            clickJavaScript(CategoriaPageObject.getBtnProducto(dataExcel.get(0).get("Producto")));

        } catch (IOException e) {
            e.printStackTrace();
        }

        seleccionClick(ProductoPageObject.getBtnFecha());
        esperarElementoVisible(ProductoPageObject.getBtnHorario(), Duration.ofSeconds(15));
        seleccionClick(ProductoPageObject.getBtnHorario());
        clickJavaScript(ProductoPageObject.getBtnAgregarCarrito());
    }

    public void seleccionClick(By elemento) {
        driver.findElement(elemento).click();
    }

    public void esperarElementoVisible(By elemento, Duration tiempoEsperaSegundos) {
        WebDriverWait wait = new WebDriverWait(driver, tiempoEsperaSegundos);
        wait.until(ExpectedConditions.visibilityOfElementLocated(elemento));

    }

    public void clickJavaScript(By elemento) {
        WebElement element = driver.findElement(elemento);
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].click();", element);
    }

    public void escrituraTexto(By elemento, String texto) {
        driver.findElement(elemento).sendKeys(texto);
    }
}