package com.nttdata.testing.stepDefinition;

import com.nttdata.testing.Pages.HomePage;
import com.nttdata.testing.Tasks.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class RegistrarUsuarioStepDefinition {
    @Given("el {actor} esta en la pagina de inicio")
    public void elUsuarioEstaEnLaPaginaDeInicio(Actor actor) {
        actor.attemptsTo(NavigateTo.theHomePage());
    }

    @And("selecciona el boton de registro")
    public void seleccionaElBotonDeRegistro() {
        theActorInTheSpotlight().attemptsTo(Click.on(HomePage.BTN_SIGN_UP));
    }

    @And("ingresa un nombre de usuario {string} y contrasenia {string}")
    public void ingresaUnNombreDeUsuarioYContrasenia(String username, String password) {
        theActorInTheSpotlight().attemptsTo(Enter.theValue(username).into(HomePage.INP_USERNAME));
        theActorInTheSpotlight().attemptsTo(Enter.theValue(password).into(HomePage.INP_PASSWORD));
    }

    @When("selecciona el boton registrar")
    public void seleccionaElBotonRegistrar() {
        theActorInTheSpotlight().attemptsTo(Click.on(HomePage.BTN_REGISTRAR));
    }

    @Then("se realiza el registro de manera exitosa")
    public void seRealizaElRegistroDeManeraExitosa() {
        System.out.println("exitoso");
    }

    @When("se registra con un nombre de usuario {string} y contrasenia {string}")
    public void seRegistraConUnNombreDeUsuarioYContrasenia(String usuario, String password) {
        theActorInTheSpotlight().attemptsTo(RegistrarUsuario.withData(usuario, password));
    }


    @And("selecciona el boton de Sing Up")
    public void seleccionaElBotonDeLogin() {
        theActorInTheSpotlight().attemptsTo(Click.on(HomePage.BTN_LOGIN));
    }

    @And("ingresa el nombre de usuario {string} y contrasenia {string}")
    public void ingresaElNombreDeUsuarioYContrasenia(String username, String password) {
        theActorInTheSpotlight().attemptsTo(Enter.theValue(username).into(HomePage.INP_USERNAME));
        theActorInTheSpotlight().attemptsTo(Enter.theValue(password).into(HomePage.INP_PASSWORD));
        theActorInTheSpotlight().attemptsTo(LoginUsuario.withData(username, password));
    }

    @When("selecciona el boton Sing Up")
    public void seleccionaElBotonIngresar() {
        theActorInTheSpotlight().attemptsTo(Click.on(HomePage.BTN_INGRESAR));
    }
    //Sign up successful.

    //Seleccionar producto
    @When("selecciona el producto {string} de la web")
    public void seleccionaElProductoDeLaWeb(String productname) {
        theActorInTheSpotlight().attemptsTo(Click.on(HomePage.SEL_PRODUCTO));
        theActorInTheSpotlight().attemptsTo(SeleccionarProducto.withData(productname));
    }
    @Then("se muestra producto de manera exitosa")
    public void seMuestraProductoDeManeraExitosa() {
        System.out.println("exitoso");
    }

    //Aniadir producto
    @Given("el {actor} esta en la pagina del producto")
    public void elUsuarioEstaEnLaPaginaDelProducto(Actor actor) {
        actor.attemptsTo(NavigateTo.theHomePage());
    }

    @And("selecciona el boton de Add Carrito {string}")
    public void seleccionaElBotonDeAddCarrito(String productname) {
        theActorInTheSpotlight().attemptsTo(Click.on(HomePage.BTN_ADD_CARRITO));
        theActorInTheSpotlight().attemptsTo(AniadirCarrito.withData(productname));
    }

    @When("selecciona el boton Aceptar de ventana emergente")
    public void seleccionaElBotonAceptarDeVentanaEmergente() {
        theActorInTheSpotlight().attemptsTo(Click.on(HomePage.BTN_ACEPTAR));
    }

}
