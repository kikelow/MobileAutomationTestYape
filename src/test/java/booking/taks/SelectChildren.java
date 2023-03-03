package booking.taks;

import booking.ui.PageRoomsAndGuests;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SelectChildren implements Task {

    private String ageChildren;
    private int quantityChildren;

    PageRoomsAndGuests pageRoomsAndGuests;

    public SelectChildren(String ageChildren, int quantityChildren) {
        this.ageChildren = ageChildren;
        this.quantityChildren = quantityChildren;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(pageRoomsAndGuests.buttonPlusChildren));
        while (!pageRoomsAndGuests.actualSelectedNumberPickerAgeOfChild.getText().equals(ageChildren.concat(" years old"))) {
            actor.attemptsTo(
                    Click.on(pageRoomsAndGuests.buttonDownNumberPickerAgeOfChild)
                    );
        }
        actor.attemptsTo(
                Click.on(pageRoomsAndGuests.buttonOkNumberPickerAgeOfChild),
                Click.on(pageRoomsAndGuests.buttonApply)
        );
    }

    public static SelectChildren withAge(String ageChildren, int quantityChildren) {
        return instrumented(SelectChildren.class, ageChildren, quantityChildren);
    }
}
