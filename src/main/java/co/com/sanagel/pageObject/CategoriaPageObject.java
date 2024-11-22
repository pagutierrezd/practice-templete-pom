package co.com.sanagel.pageObject;

import org.openqa.selenium.By;

public class CategoriaPageObject {

    public static By getBtnProducto(String textoProducto){
        return By.xpath("//h2[text()='"+textoProducto+"']");
    }

    private CategoriaPageObject() {

    }
}
