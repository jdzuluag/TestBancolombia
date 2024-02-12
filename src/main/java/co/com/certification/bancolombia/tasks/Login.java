package co.com.certification.bancolombia.tasks;

import co.com.certification.bancolombia.interactions.WaitHook;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.certification.bancolombia.userinterfaces.Login.*;

public class Login implements Task {
    private String user, password;

    public Login(String user, String password) {
        this.user = user;
        this.password = password;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Enter.theValue(user).into(INPUT_USER),
                Enter.theValue(password).into(INPUT_PASSWORD),
                Click.on(BUTTON_SEND),
                WaitHook.theSeconds(1000)
        );
    }
    public static Login login(String user, String password){
        return Tasks.instrumented(Login.class, user, password);
    }
}
