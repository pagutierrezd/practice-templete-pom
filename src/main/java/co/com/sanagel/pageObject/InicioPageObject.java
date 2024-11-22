package co.com.sanagel.pageObject;

import org.openqa.selenium.By;

public class InicioPageObject {

    private static By btnAmor = By.xpath("//header[@class='desktop-header']//a[text()='Amor']");

    public static By getBtnAmor() {
        return btnAmor;
    }

    private InicioPageObject() {
    }

}