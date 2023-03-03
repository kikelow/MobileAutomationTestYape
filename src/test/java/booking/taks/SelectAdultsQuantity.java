package booking.taks;

import booking.ui.PageRoomsAndGuests;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SelectAdultsQuantity implements Task {

    private int adultsQuentity;

    PageRoomsAndGuests pageRoomsAndGuests;

    public SelectAdultsQuantity(int adultsQuentity) {
        this.adultsQuentity = adultsQuentity;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        if ((Integer.parseInt(pageRoomsAndGuests.labelQuantityAdults.getText()) < adultsQuentity)) {
            while (Integer.parseInt(pageRoomsAndGuests.labelQuantityRooms.getText())<adultsQuentity)
                actor.attemptsTo(
                        Click.on(pageRoomsAndGuests.buttonPlusAdults)
                );
        }
    }

    public static SelectAdultsQuantity of(int adultsQuentity) {
        return instrumented(SelectAdultsQuantity.class, adultsQuentity);
    }
}
