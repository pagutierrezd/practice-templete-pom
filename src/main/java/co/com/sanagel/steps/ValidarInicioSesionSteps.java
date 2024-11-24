package co.com.sanagel.steps;

import co.com.sanagel.pageObject.CuentaPageObject;
import net.thucydides.core.annotations.Step;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import static co.com.sanagel.driver.SeleniumWebDriver.driver;

public class ValidarInicioSesionSteps {

    @Step
    public void validacion() {

        WebElement tableElement = driver.findElement(CuentaPageObject.getLblValidarInicioSesion());
        String textoEnTabla = tableElement.getText();
        Assert.assertEquals("paangudi3", textoEnTabla);
    }
}
