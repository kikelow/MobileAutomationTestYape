package booking.taks;

import booking.ui.PageHotel;
import booking.ui.PageResults;
import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class SelectResult implements Task {

    PageResults pageResults;
    PageHotel pageHotel;

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(WaitUntil.the(
                ExpectedConditions
                        .presenceOfElementLocated(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]"))),
                Click.on(pageResults.buttonFilter));

        actor.attemptsTo(
                Click.on(pageResults.optionFilterFiveStart),
                Click.on(pageResults.buttonShowResult),
                Click.on(pageResults.optionHotel),
                Click.on(pageHotel.buttonSelectRoom)
        );

    }

}
