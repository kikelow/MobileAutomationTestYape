package booking.taks;

import booking.ui.PageRoomsAndGuests;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static net.serenitybdd.screenplay.Tasks.instrumented;

public class SelectRoomQuantity implements Task {

    private int roomsQuentity;

    PageRoomsAndGuests pageRoomsAndGuests;

    public SelectRoomQuantity(int roomsQuentity){
        this.roomsQuentity=roomsQuentity;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        if (!(Integer.parseInt(pageRoomsAndGuests.labelQuantityRooms.getText()) == roomsQuentity)) {
            while (Integer.parseInt(pageRoomsAndGuests.labelQuantityRooms.getText())<roomsQuentity)
            actor.attemptsTo(
                    Click.on(pageRoomsAndGuests.buttonPlusRooms)
            );
        }
    }

    public static SelectRoomQuantity withQuantity(int roomsQuentity){
        return instrumented(SelectRoomQuantity.class,roomsQuentity);
    }


}
