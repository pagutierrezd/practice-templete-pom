package co.com.sanangel.stepDefinitions;

import co.com.sanagel.steps.IniciarSesionSteps;
import io.cucumber.java.es.*;

import static co.com.sanagel.driver.SeleniumWebDriver.driver;

public class inicioSesionStepDefinitions {

    IniciarSesionSteps iniciarSesionSteps = new IniciarSesionSteps();

    @Cuando("Ingrese mis credenciales")
    public void ingreseMisCredenciales() {

        iniciarSesionSteps.iniciarSesion();

    }

    @Entonces("Iniciare sesion")
    public void iniciareSesion() {

        driver.close();
    }
}
