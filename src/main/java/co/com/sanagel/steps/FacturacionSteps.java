package co.com.sanagel.steps;

import co.com.sanagel.utils.DatosExcel;
import net.thucydides.core.annotations.Step;
import co.com.sanagel.pageObject.FacturacionPageObject;
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

public class FacturacionSteps {
    @Step
    public void Facturacion() {

        ArrayList<Map<String, String>> dataExcel;
        try {
            dataExcel = DatosExcel.leerDatosDeHojaDeExcel("parametros/Datos.xlsx", "Facturacion");

            escrituraTexto(FacturacionPageObject.getTxtNombre(), dataExcel.get(0).get("Nombre"));
            escrituraTexto(FacturacionPageObject.getTxtApellido(), dataExcel.get(0).get("Apellidos"));
            escrituraTexto(FacturacionPageObject.getTxtCedula(), dataExcel.get(0).get("Cedula"));
            escrituraTexto(FacturacionPageObject.getTxtTelefono(), dataExcel.get(0).get("Celular"));
            escrituraTexto(FacturacionPageObject.getTxtEmail(), dataExcel.get(0).get("Correo"));
            escrituraTexto(FacturacionPageObject.getTxtNombreCompletoQuienRecibe(), dataExcel.get(0).get("NombreQuienRecibe"));
            seleccionClick(FacturacionPageObject.getOptCiudad());
            seleccionClick(FacturacionPageObject.getBtnCiudad(dataExcel.get(0).get("CiudadQuienRecibe")));
            escrituraTexto(FacturacionPageObject.getTxtDireccionQuienRecibo(), dataExcel.get(0).get("DireccionQuienRecibe"));
            escrituraTexto(FacturacionPageObject.getTxtInfoAdicionalQuienRecibe(), dataExcel.get(0).get("DatosAdicionalesQuienRecibe"));
            escrituraTexto(FacturacionPageObject.getTxtTelefonoQuienRecibe(), dataExcel.get(0).get("CelularQuienRecibe"));
            escrituraTexto(FacturacionPageObject.getTxtMensajeQuienRecibe(), dataExcel.get(0).get("ObservacionQuienRecibe"));
            escrituraTexto(FacturacionPageObject.getTxtFirmaQuienRecibe(), dataExcel.get(0).get("FirmaQuienRecibe"));
        }catch (IOException e){
            e.printStackTrace();
        }
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