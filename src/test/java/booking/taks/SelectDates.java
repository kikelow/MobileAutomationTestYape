package booking.taks;

import booking.ui.PageDateSelector;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SelectDates implements Task {

    private int days;

    public SelectDates(int days){
        this.days = days;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(PageDateSelector.StartDate),
                Click.on(PageDateSelector.endDate),
                Click.on(PageDateSelector.buttonSelectDates)
        );
    }

    public static SelectDates toReservation(int days){
        return  instrumented(SelectDates.class,days);
    }
}
