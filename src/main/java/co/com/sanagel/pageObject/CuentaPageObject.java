package co.com.sanagel.pageObject;

import org.openqa.selenium.By;

public class CuentaPageObject {

    private static By txtEmail = By.xpath("//input[@id='username']");

    private static By txtClave = By.xpath("//input[@id='password']");

    private static By btnIniciarSesion = By.xpath("//button[@name='login']");

    private static By lblValidarInicioSesion = By.xpath("//*[@id='post-197']//strong[1]");

    public static By getTxtEmail() {
        return txtEmail;
    }

    public static By getTxtClave(){
        return txtClave;
    }

    public static By getBtnIniciarSesion() {
        return btnIniciarSesion;
    }

    public static By getLblValidarInicioSesion() {
        return lblValidarInicioSesion;
    }

    private CuentaPageObject() {

    }
}
