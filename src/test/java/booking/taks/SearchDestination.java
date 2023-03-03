package booking.taks;

import booking.ui.PageDestination;
import booking.ui.PageLogin;
import booking.ui.PageSearch;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.SendKeys;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class SearchDestination implements Task {

    private String destino;

    public SearchDestination(String destino){
        this.destino = destino;
    }


    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(PageLogin.buttonDismisLoginForm),
                Click.on(PageSearch.inputDestination),
                SendKeys.of(destino ).into(PageDestination.inputDestination),
                WaitUntil.the(PageDestination.listSearchResult,isVisible()).forNoMoreThan(3).seconds(),
                Click.on(PageDestination.listSearchResult)
        );
    }

    public SearchDestination by(String destino){
        return instrumented(SearchDestination.class,destino);
    }
}
