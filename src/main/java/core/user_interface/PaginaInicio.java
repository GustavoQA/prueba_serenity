package core.user_interface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;


@DefaultUrl("https://rpp.pe/?ref=rpp") // indicar la web
public class PaginaInicio extends PageObject {

public static final Target INPUT_INGRESAR_EMAIL = Target.the("Input donde se ingresa el correo ").locatedBy("//input[@id='username']");
public static final Target INPUT_INGRESAR_CONTRASENA = Target.the("Input donde se ingresa la clave").locatedBy("//input[@id='password']");
public static final Target CLICK_BOTON_ACEPTAR = Target.the("click en el boton aceptar ").locatedBy("//button[@name='login']");
public static final Target BOTON = Target.the("bajar el scroll").locatedBy("//span[@class='nuautor_spatitu']");




//public static final Target SELECT_TIPO_CATEGORIA = Target.the("Select tipo categoria ").locatedBy("//input[@class=\"gNO89b\"]");
//public static final Target BUTTON_BUSCAR_ARTICULO = Target.the("Boton buscar articulo").locatedBy("//input[@class=\"gNO89b\"]");
//public static final Target LINK_OBJETO_ENCONTRADO = Target.the("Link objeto encontrado").locatedBy("//a[@class='hide-focus-ring __web-inspector-hide-shortcut__']");
//public static final Target CLIC_CERRAR_VENTANA = Target.the("Clic cerrar ventana").locatedBy("//img[@class =\"_24EHh\"]");
//a[start-with(@title,'textobuscado')]




}
