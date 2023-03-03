package booking.ui;

import io.appium.java_client.AppiumBy;
import net.serenitybdd.screenplay.targets.Target;

public class PageSearch {

    public static Target welcomeCard = Target.the("card de bienvenida").located(AppiumBy.xpath(""));
    public static Target inputDestination = Target.the("Input destino")
            .located(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.FrameLayout[1]/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView[2]/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout[1]/android.widget.TextView"));
    public static Target inputTravelDates = Target.the("Input fechas de viaje")
            .located(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.FrameLayout[1]/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView[2]/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.TextView"));
    public static Target inputPeopleQuantity = Target.the("input personas a viajar")
            .located(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.FrameLayout[1]/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView[2]/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.LinearLayout/android.widget.LinearLayout[3]/android.widget.TextView"));
    public static Target buttonSearch = Target.the("Boton buscar")
            .located(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.FrameLayout[1]/android.widget.LinearLayout/androidx.recyclerview.widget.RecyclerView[2]/android.widget.FrameLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.Button"));

}
