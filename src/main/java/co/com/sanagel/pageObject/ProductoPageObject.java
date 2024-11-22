package co.com.sanagel.pageObject;

import org.openqa.selenium.By;

public class ProductoPageObject {

    public static By btnFecha = By.xpath("//span[text()='Hoy']");

    public static By btnHorario = By.xpath("(//a[@class='hour-dropdow-item '])[1]");

    public static By btnAgregarCarrito = By.xpath("//button[@class='single_add_to_cart_button button alt']");

    public static By getBtnFecha() {
        return btnFecha;
    }

    public static By getBtnHorario() {
        return btnHorario;
    }

    public static By getBtnAgregarCarrito() {
        return btnAgregarCarrito;
    }

    private ProductoPageObject() {

    }
}
