package main.api.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static core.user_interface.PaginaInicio.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.thucydides.core.webdriver.ThucydidesWebDriverSupport.getDriver;

public class CredencialesTask implements Task {

    private String correo; // variable para la clase BuscarProducto
    private String contrasena;
    public CredencialesTask(String correo, String contrasena) {  // contructor de la clase BuscarProducto
        this.correo = correo;
        this.contrasena=contrasena;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
//       if(Visibility.of(CLIC_CERRAR_VENTANA).viewedBy(actor).asBoolean())
//            actor.attemptsTo(Click.on(CLIC_CERRAR_VENTANA));

        actor.attemptsTo(
                Enter.theValue(correo).into(INPUT_INGRESAR_EMAIL),// escribir en el campo busqueda
                Enter.theValue(contrasena).into(INPUT_INGRESAR_CONTRASENA),// escribir la contraseña
                Click.on(CLICK_BOTON_ACEPTAR)
                //             SelectFromOptions.byVisibleText(tipoCategoria).from(SELECT_TIPO_CATEGORIA),//seleccionar item
                //Hit.the(Keys.ENTER).into(BUTTON_BU    SCAR_ARTICULO),
                //Click.on(LINK_OBJETO_ENCONTRADO)// click seleccionar producto   CLICK_BOTON_ACEPTAR
        );

        for (String winHandle : getDriver().getWindowHandles() ){
                getDriver().switchTo().window(winHandle);

        }

    }

    public static CredencialesTask conDescripcion(String correo, String contrasena) {

        return instrumented(CredencialesTask.class,correo,contrasena); //instanciamiento de la clase BuscarProducto
    }


}
