package main.stepsdefinitions;

import core.Helpers.GeneralParams;
import core.actions.ClickButtonAction;
import core.questions.QuestionValidate;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class MinutesBalance {
    Actor usuario;

    @Managed
    WebDriver navegador;


    @Before
    public void ingresar() {
        usuario = Actor.named("usuario");
        usuario.can(BrowseTheWeb.with(navegador)); //Abrir navegador
    }

    @Given("^Que ingresa a la pagina resumen de cuenta$")
    public void ingresoEnPagina() {
        usuario.should(new QuestionValidate(
                "¿Qué deseas hacer hoy?").Execute(new GeneralParams(
                "Pagina principal",
                "//p[contains(text(),'¿Qué deseas hacer hoy?')]")));
    }

    @When("^hace click sobre un plan Prepago$")
    public void seleccionaUnaCuentaPrepago() {
        usuario.attemptsTo(new ClickButtonAction().Execute(new GeneralParams(
                "Usuario ubica el menu para seleccionar un plan",
                "Campo seleccionar plan",
                "//div[@class='container_line']")));

        usuario.attemptsTo(new ClickButtonAction().Execute(new GeneralParams(
                "Usuario ubica una cuenta prepago",
                "cuenta prepago",
                "//section[@id='block-accounts']//li[4]//a[1]")));

    }

    @And("^selecciona la opcion del menu Mis Saldos$")
    public void seleccionaOpcionMenuMisSaldos() throws InterruptedException {
        Thread.sleep(2502);
        usuario.attemptsTo(new ClickButtonAction().Execute(new GeneralParams(
                "Usuario ubica el menu Mis Saldos",
                "Menu Mis saldos",
                "//nav[@class='block block--menu block--selfcaremenu block--selfcaremenuprepago']//a[@class='mis saldos-icon is-active'][contains(text(),'Mis Saldos')]")));
    }

    @Then("^visualiza la información del saldo de minutos$")
    public void validarInformacion() throws InterruptedException {
        Thread.sleep(2502);
        usuario.should(new QuestionValidate(
                "Saldo de Minutos").Execute(new GeneralParams(
                "Card Saldo de Minutos",
                "/html[1]/body[1]/div[2]/div[1]/section[1]/div[1]/div[2]/div[2]/div[1]/section[5]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")));
    }
}
