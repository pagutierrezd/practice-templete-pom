package co.com.sanagel.pageObject;

import org.openqa.selenium.By;

public class FacturacionPageObject {

    private static By txtNombre = By.xpath("//input[@id='billing_first_name']");

    private static By txtApellido = By.xpath("//input[@id='billing_last_name']");

    private static By txtCedula = By.xpath("//input[@id='billing_document_id']");

    private static By txtTelefono = By.xpath("//input[@id='billing_phone']");

    private static By txtEmail = By.xpath("//input[@id='billing_email']");

    private static By txtNombreCompletoQuienRecibe = By.xpath("//input[@name='order_nombre_completo']");

    private static By optCiudad = By.xpath("//select[@id='order_ciudad']");

    public static By getBtnCiudad(String textoCiudad) {
        return By.xpath("//option[@value='" + textoCiudad + "']");
    }

    private static By txtDireccionQuienRecibo = By.xpath("//input[@name='order_additional_address']");

    private static By txtInfoAdicionalQuienRecibe = By.xpath("//input[@name='order_additional_address_2']");

    private static By txtTelefonoQuienRecibe = By.xpath("//input[@name='order_additional_phone']");

    private static By txtMensajeQuienRecibe = By.xpath("//textarea[@id='order_comments']");

    private static By txtFirmaQuienRecibe = By.xpath("//input[@id='order_additional_card_signature']");

    private static By lblFacturacion = By.xpath("//div[@class='ts-product-name']");

    public static By getTxtNombre() {
        return txtNombre;
    }

    public static By getTxtApellido() {
        return txtApellido;
    }

    public static By getTxtCedula() {
        return txtCedula;
    }

    public static By getTxtTelefono() {
        return txtTelefono;
    }

    public static By getTxtEmail() {
        return txtEmail;
    }

    public static By getTxtNombreCompletoQuienRecibe() {
        return txtNombreCompletoQuienRecibe;
    }

    public static By getOptCiudad() {
        return optCiudad;
    }

    public static By getTxtDireccionQuienRecibo() {
        return txtDireccionQuienRecibo;
    }

    public static By getTxtInfoAdicionalQuienRecibe() {
        return txtInfoAdicionalQuienRecibe;
    }

    public static By getTxtTelefonoQuienRecibe() {
        return txtTelefonoQuienRecibe;
    }

    public static By getTxtMensajeQuienRecibe() {
        return txtMensajeQuienRecibe;
    }

    public static By getTxtFirmaQuienRecibe() {
        return txtFirmaQuienRecibe;
    }

    public static By getLblFacturacion() {
        return lblFacturacion;
    }

    private FacturacionPageObject() {
    }
}
