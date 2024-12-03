package com.nttdata.testing.Tasks;

import com.nttdata.testing.Pages.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class SeleccionarProducto implements Task {

    private final String productname;


    public SeleccionarProducto(String productname) {
        this.productname = productname;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(HomePage.BTN_SIGN_UP),
                Click.on(HomePage.SEL_PRODUCTO)
        );
    }

    public static Performable withData(String productname) {
        return new SeleccionarProducto(productname);
    }
}