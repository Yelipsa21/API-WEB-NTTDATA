package com.nttdata.testing.Tasks;

import com.nttdata.testing.Pages.HomePage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.Task;

public class LoginUsuario implements Task {

    private final String username;
    private final String password;

    public LoginUsuario(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public <T extends Actor > void performAs(T actor) {
        actor.attemptsTo(
                Click.on(HomePage.BTN_SIGN_UP),
                Click.on(HomePage.BTN_LOGIN),
                Enter.theValue(username).into(HomePage.INP_USERNAME),
                Enter.theValue(password).into(HomePage.INP_PASSWORD),
                Click.on(HomePage.BTN_INGRESAR)
        );
    }

    public static Performable withData(String username, String password) {
        return new RegistrarUsuario(username, password);
    }
}
