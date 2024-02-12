package co.com.certification.bancolombia.questions;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

import static co.com.certification.bancolombia.userinterfaces.Cycles.*;

public class ValidateMessage implements Question {
    @Override
    public Object answeredBy(Actor actor) {
        return MSG_FINISH.resolveFor(actor).isVisible();
    }
    public static ValidateMessage validateMessage(){
        return new ValidateMessage();
    }
}
