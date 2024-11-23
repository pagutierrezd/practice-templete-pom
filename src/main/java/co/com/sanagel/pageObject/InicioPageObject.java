package co.com.sanagel.pageObject;

import org.openqa.selenium.By;

public class InicioPageObject {

    private static By btnAmor = By.xpath("//header[@class='desktop-header']//a[text()='Amor']");

    private static By btnCuenta = By.xpath("//header[@class='desktop-header']//a[@href='https://sanangel.com.co/mi-cuenta/']");

    public static By getBtnAmor() {
        return btnAmor;
    }

    public static By getBtnCuenta(){
        return btnCuenta;
    }

    private InicioPageObject() {
    }

}