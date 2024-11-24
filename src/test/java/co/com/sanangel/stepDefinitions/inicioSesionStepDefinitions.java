package co.com.sanangel.stepDefinitions;

import co.com.sanagel.steps.IniciarSesionSteps;
import co.com.sanagel.steps.ValidarInicioSesionSteps;
import io.cucumber.java.es.*;
import net.thucydides.core.annotations.Steps;

import static co.com.sanagel.driver.SeleniumWebDriver.driver;

public class inicioSesionStepDefinitions {

    @Steps
    IniciarSesionSteps iniciarSesion = new IniciarSesionSteps();

    @Steps
    ValidarInicioSesionSteps validar = new ValidarInicioSesionSteps();

    @Cuando("Ingrese mis credenciales")
    public void ingreseMisCredenciales() {

        iniciarSesion.iniciarSesion();

    }

    @Entonces("Iniciare sesion")
    public void iniciareSesion() {

        validar.validacion();
        driver.close();
    }
}
