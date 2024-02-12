package co.com.certification.bancolombia.tasks;

import co.com.certification.bancolombia.interactions.WaitHook;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;

import static co.com.certification.bancolombia.userinterfaces.Cycles.*;


public class CompleteFirstCycle implements Task {
    private String multiples, operation, letter, count;

    public CompleteFirstCycle(String multiples, String operation,  String letter,String count) {
        this.multiples = multiples;
        this.letter = letter;
        this.operation = operation;
        this.count = count;
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(SELECT_NUMBER.of(multiples)),
                Click.on(SELECT_OPERATION.of(operation)),
                Enter.theValue(letter).into(INSERT_TEXT),
                Enter.theValue(count).into(INPUT_COUNT),
                WaitHook.theSeconds(500),
                Click.on(BTN_SEND),
                WaitHook.theSeconds(500)
        );
    }

    public static CompleteFirstCycle firstCycle(String multiples, String operation, String letter, String count){
        return Tasks.instrumented(CompleteFirstCycle.class, multiples, operation, letter, count);
    }
}
