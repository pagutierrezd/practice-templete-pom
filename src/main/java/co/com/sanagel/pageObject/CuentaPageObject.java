package co.com.sanagel.pageObject;

import org.openqa.selenium.By;

public class CuentaPageObject {

    private static By txtEmail = By.xpath("//input[@id='username']");

    private static By txtClave = By.xpath("//input[@id='password']");

    private static By btnIniciarSesion = By.xpath("//button[@name='login']");

    public static By getTxtEmail() {
        return txtEmail;
    }

    public static By getTxtClave(){
        return txtClave;
    }

    public static By getBtnIniciarSesion() {
        return btnIniciarSesion;
    }

    private CuentaPageObject() {

    }
}
