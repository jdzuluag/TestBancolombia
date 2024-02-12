package co.com.certification.bancolombia.interactions;

import net.serenitybdd.core.time.InternalSystemClock;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class WaitHook implements Interaction {
    private int timeWait;

    public WaitHook(int timeWait) {
        this.timeWait = timeWait;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        new InternalSystemClock().pauseFor(timeWait);
    }

    public static WaitHook theSeconds(int timeWait){
        return Tasks.instrumented(WaitHook.class, timeWait);
    }
}
