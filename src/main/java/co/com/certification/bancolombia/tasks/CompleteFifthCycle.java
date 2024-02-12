package co.com.certification.bancolombia.tasks;

import co.com.certification.bancolombia.interactions.WaitHook;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.certification.bancolombia.userinterfaces.Cycles.*;

public class CompleteFifthCycle implements Task {

    private String multiples, multiples2, operation, letter, count;

    public CompleteFifthCycle(String multiples, String multiples2, String operation, String letter, String count) {
        this.multiples = multiples;
        this.multiples2 = multiples2;
        this.operation = operation;
        this.letter = letter;
        this.count = count;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SELECT_NUMBER.of(multiples)),
                Click.on(SELECT_NUMBER.of(multiples2)),
                Click.on(SELECT_OPERATION.of(operation)),
                Enter.theValue(letter).into(INSERT_TEXT),
                Enter.theValue(count).into(INPUT_COUNT),
                WaitHook.theSeconds(500),
                Click.on(BTN_SEND),
                WaitHook.theSeconds(500)
        );
    }

    public static CompleteFifthCycle completeFifthCycle(String multiples, String multiples2, String operation, String letter, String count){
        return Tasks.instrumented(CompleteFifthCycle.class, multiples, multiples2, operation, letter, count);
    }
}
