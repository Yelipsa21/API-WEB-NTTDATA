package com.nttdata.testing.Tasks;

import com.nttdata.testing.Pages.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class AniadirCarrito implements Task {

    private final String productname;

    public AniadirCarrito(String productname) {
        this.productname = productname;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(HomePage.SEL_PRODUCTO),
                Click.on(HomePage.BTN_ADD_CARRITO),
                Click.on(HomePage.BTN_ACEPTAR)
        );
    }

    public static Performable withData(String productname) {
        return new AniadirCarrito(productname);
    }
}