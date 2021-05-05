package core.user_interface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;


public class OpcionesPage extends PageObject {

    public static final Target CLICK_RENDICION_VIAJE = Target.the("Clic boton rendicion ").locatedBy("//a[contains(text(),'Rendición de Viaje')]");
   public static final Target INPUT_INGRESAR_DESTINO = Target.the("Input donde se ingresa el destino ").locatedBy("//input[@type='search']");



}
