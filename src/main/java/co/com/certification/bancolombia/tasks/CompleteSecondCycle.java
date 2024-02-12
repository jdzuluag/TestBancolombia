package co.com.certification.bancolombia.tasks;

import co.com.certification.bancolombia.interactions.WaitHook;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.certification.bancolombia.userinterfaces.Cycles.*;

public class CompleteSecondCycle implements Task {
    private String multiples, multiples2, multiples3, multiples4, multiples5, multiples6, multiples7, operation, letter, count;

    public CompleteSecondCycle(String multiples, String multiples2, String multiples3, String multiples4, String multiples5, String multiples6, String multiples7, String operation, String letter, String count) {
        this.multiples = multiples;
        this.multiples2 = multiples2;
        this.multiples3 = multiples3;
        this.multiples4 = multiples4;
        this.multiples5 = multiples5;
        this.multiples6 = multiples6;
        this.multiples7 = multiples7;
        this.operation = operation;
        this.letter = letter;
        this.count = count;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SELECT_NUMBER.of(multiples)),
                Click.on(SELECT_NUMBER.of(multiples2)),
                Click.on(SELECT_NUMBER.of(multiples3)),
                Click.on(SELECT_NUMBER.of(multiples4)),
                Click.on(SELECT_NUMBER.of(multiples5)),
                Click.on(SELECT_NUMBER.of(multiples6)),
                Click.on(SELECT_NUMBER.of(multiples7)),
                Click.on(SELECT_OPERATION.of(operation)),
                Enter.theValue(letter).into(INSERT_TEXT),
                Enter.theValue(count).into(INPUT_COUNT),
                WaitHook.theSeconds(500),
                Click.on(BTN_SEND),
                WaitHook.theSeconds(500)
        );
    }
    public static CompleteSecondCycle completeSecondCycle(String multiples, String multiples2, String multiples3, String multiples4, String multiples5, String multiples6, String multiples7, String operation, String letter, String count){
        return Tasks.instrumented(CompleteSecondCycle.class, multiples, multiples2, multiples3, multiples4, multiples5, multiples6, multiples7, operation, letter, count);
    }
}
