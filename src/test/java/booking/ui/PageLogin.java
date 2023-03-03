package booking.ui;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;

public class PageLogin {

    public static Target buttonDismisLoginForm = Target.the("boton dismiss")
            .located(AppiumBy.xpath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]"));
}
