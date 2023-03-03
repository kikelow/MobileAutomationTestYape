package booking.stepdefinitions;

import booking.taks.*;
import io.cucumber.java.Before;
import io.cucumber.java.es.Cuando;
import io.cucumber.java.es.Dado;
import io.cucumber.java.es.Entonces;
import io.cucumber.java.es.Y;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class AccommodationStepDefinitions {

    @Managed(driver = "Appium")
    public WebDriver hisMobileDevice;

    @Before
    public void setTheStage() {
        OnStage.setTheStage(new OnlineCast());
    }

    @Dado("que deseo reservar alojamiento a traves del servicio de la app booking")
    public void queDeseoReservarAlojamientoATravesDelServicioDeLaAppBooking() {
        OnStage.theActor("Harinson");
    }

    @Y("deseo ir a la cuidad de {string}")
    public void deseoIrALaCuidadDeCiudad(String ciudadDestino) {
        theActorInTheSpotlight().attemptsTo(
                new SearchDestination(ciudadDestino)
        );
    }

    @Y("deseo viajar {int} dias a partir de hoy")
    public void deseoViajarEntreLasFechasFecha_idaYFecha_regreso(int diasViaje) throws InterruptedException {
        theActorInTheSpotlight().attemptsTo(
                SelectDates.toReservation(diasViaje)
        );
    }

    @Y("deseo apartar {int} habitacion \\(es)")
    public void deseoApartarHabitacion(int cantHabitacion) throws InterruptedException {
        theActorInTheSpotlight().attemptsTo(new SelectOption());
        theActorInTheSpotlight().attemptsTo(SelectRoomQuantity.withQuantity(cantHabitacion));
        Thread.sleep(3000);
    }

    @Y("deseo viajar con {int} adulto y {int} menor de {string} anios")
    public void deseoViajarConAdultoYMenorDeAnios(int cantAdults, int cantMenores, String edadMenor) {
        theActorInTheSpotlight().attemptsTo(SelectAdultsQuantity.of(cantAdults));
        theActorInTheSpotlight().attemptsTo(SelectChildren.withAge(edadMenor, cantMenores));
    }

    @Cuando("realice la busqueda del alojamiento")
    public void realiceLaBusquedaDelAlojamiento() {
        theActorInTheSpotlight().attemptsTo(new DoSearch());
    }

    @Y("escoja la habitacion")
    public void escojaLaHabitacion() {
        theActorInTheSpotlight().attemptsTo(new SelectResult());
    }

    @Y("realice la realice la reservasion")
    public void realiceLaRealiceLaReservasion() {
        theActorInTheSpotlight().attemptsTo(new DoReservation());
    }

    @Y("realice el pago")
    public void realiceElPago() {
        throw new io.cucumber.java.PendingException();
    }

    @Entonces("habre reservado el alojamiento")
    public void habreReservadoElAlojamiento() {
        throw new io.cucumber.java.PendingException();
    }


}
