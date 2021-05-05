package main.api.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;



import static core.user_interface.OpcionesPage.*;
import static core.user_interface.PaginaInicio.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class BuscarViaje implements Task {

    private String destino;

    public BuscarViaje(String destino) {
        this.destino = destino;
    }



    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(CLICK_RENDICION_VIAJE),
               Enter.theValue(destino).into(INPUT_INGRESAR_DESTINO)// ESCRIBIR EL DESTINO EL EL BUSCADOR



        );

    }

    public static BuscarViaje conProvincia(String destino) {

        return instrumented(BuscarViaje.class,destino);


    }

}
