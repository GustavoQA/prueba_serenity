package main.api.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.actions.ScrollTo;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static core.user_interface.PaginaInicio.BOTON;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class BajarScrollTask implements Task {


    @Override
    public <T extends Actor> void performAs(T actor) {

      actor.attemptsTo(
              Scroll.to(BOTON)
      );

    }

    public static BajarScrollTask conObjeto() {

        return instrumented(BajarScrollTask.class);
    }
}

