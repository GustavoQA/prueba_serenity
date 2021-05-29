package main.stepsdefinitions;

import core.user_interface.PaginaInicio;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Y;
import main.api.tasks.BajarScrollTask;
import main.api.tasks.CredencialesTask;
import main.api.tasks.BuscarViaje;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actions.Scroll;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;



public class IndexSteps {

    @Managed(driver = "chrome")
    private WebDriver navegador;
    private Actor actor = Actor.named("Gustavo");
    private final PaginaInicio paginaInicio = new PaginaInicio();


    @Dado("^que un nuevo cliente accede al carrito de compras$")
    public void queUnNuevoClienteAccedeAlCarritoDeCompras() {
        actor.can(BrowseTheWeb.with(navegador));
        actor.wasAbleTo(Open.browserOn(paginaInicio));
    }


    @Cuando("^el inicia sesion con email (.*) con password (.*)$")
    public void elIniciaSesionConEmailPassword( String email ,String contrasena) {
        actor.wasAbleTo(                             //wasAbleTo (fue capaz de)
                CredencialesTask.conDescripcion(email,contrasena)
                //AgregarProducto.cantidad(cantidad)

        );

    }

    @Y("^el da clic en rendicion de viaje lo cual busca por (.*)$")
    public void elDaClicEnRendicionDeViajeLoCualBuscaPorDestino(String destino) {
     actor.wasAbleTo(
             BuscarViaje.conProvincia(destino)
     );

    }

    //metodo en la cual abre el navegador y abre la pagina de inicio
    @Dado("^que ingreso al portal de RPP noticias$")
    public void queIngresoAlPortalDeRPPNoticias() {
        actor.can(BrowseTheWeb.with(navegador));
        actor.wasAbleTo(Open.browserOn(paginaInicio));
    }

    @Cuando("^yo bajo el scroll$")
    public void yoBajoElScroll() {
        actor.wasAbleTo(BajarScrollTask.conObjeto());

    }


//    @Y("^el da clic en boton detalle$")
//    public void elDaClicEnBotonDetalle() {
//    }
//
//    @Entonces("^el valida el (.*) del efectivo entregado$")
//    public void elValidaElMontoDelEfectivoEntregado() {
//    }
}
