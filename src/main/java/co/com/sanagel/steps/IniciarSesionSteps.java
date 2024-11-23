package co.com.sanagel.steps;

import co.com.sanagel.pageObject.*;
import co.com.sanagel.utils.DatosExcel;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Map;

import static co.com.sanagel.driver.SeleniumWebDriver.driver;

public class IniciarSesionSteps {

    public void iniciarSesion() {

        ArrayList<Map<String, String>> dataExcel;

        try {
            dataExcel = DatosExcel.leerDatosDeHojaDeExcel("parametros/Datos.xlsx", "InicioSesion");

            seleccionClick(InicioPageObject.getBtnCuenta());
            escrituraTexto(CuentaPageObject.getTxtEmail(), dataExcel.get(0).get("Correo"));
            escrituraTexto(CuentaPageObject.getTxtClave(), dataExcel.get(0).get("Clave"));
            esperarElementoVisible(CuentaPageObject.getBtnIniciarSesion(), Duration.ofSeconds(15));
            seleccionClick(CuentaPageObject.getBtnIniciarSesion());
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public void escrituraTexto(By elemento, String texto) {
        driver.findElement(elemento).sendKeys(texto);
    }

    public void seleccionClick(By elemento) {
        driver.findElement(elemento).click();
    }

    public void esperarElementoVisible(By elemento, Duration tiempoEsperaSegundos) {
        WebDriverWait wait = new WebDriverWait(driver, tiempoEsperaSegundos);
        wait.until(ExpectedConditions.visibilityOfElementLocated(elemento));

    }
}
