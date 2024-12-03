package com.nttdata.testing.tasks;

import io.restassured.http.ContentType;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.rest.interactions.Delete;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class DeleteAirlines implements Task {
    private final String _id;

    public DeleteAirlines(String _id) {
        this._id = _id;
    }

    public static Performable fromPage(String _id) {
        return instrumented(DeleteAirlines.class, _id);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Delete.from("/passenger/:id").with(requestSpecification -> requestSpecification.contentType(ContentType.JSON).
                body("{\"_id\":\"" + _id + "\"")
                .log().all()));
    }
}
