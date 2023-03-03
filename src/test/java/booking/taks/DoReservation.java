package booking.taks;

import booking.ui.PageChooseYourStay;
import booking.ui.PageHotel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

public class DoReservation implements Task {

    PageChooseYourStay pageChooseYourStay;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(pageChooseYourStay.buttonReserveOptions)
        );
    }
}
