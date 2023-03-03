package booking.ui;

import booking.util.UtilDate;
import io.appium.java_client.AppiumBy;
import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PageDateSelector {

    private static int days = 14;

    public PageDateSelector(int days) {
        this.days = days;
    }

    public static Target StartDate = Target.the("Dia de inicio de reserva")
            .located(AppiumBy.accessibilityId(UtilDate.getDateWithFormat(UtilDate.getDateTimeInstance().toDate())));

    public static Target endDate = Target.the("Dia final de la reversa")
            .located(AppiumBy.accessibilityId(UtilDate.getDateWithFormat(UtilDate.getDateTimeInstance().plusDays(days).toDate())));

    public static Target buttonSelectDates = Target.the("Boton seleccionar fecha")
            .located(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.Button"));

}
