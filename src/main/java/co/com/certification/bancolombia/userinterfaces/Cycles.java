package co.com.certification.bancolombia.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Cycles {
    public static final Target SELECT_NUMBER = Target.the("the user select a good answer")
            .locatedBy("//input[@value='{0}']");
    public static final Target SELECT_OPERATION = Target.the("The user enters the value of the operation")
            .locatedBy("//input[@value='{0}']");
    public static final Target INSERT_TEXT =Target.the("the user enters all the information")
            .located(By.xpath("//*[@class='border-2 border-black rounded-sm p-2 resize-y']"));
    public static final Target INPUT_COUNT = Target.the("the user enters the count")
            .located(By.xpath("//*[@class='border-2 border-black rounded-sm p-2']"));

    public static final Target BTN_SEND = Target.the("The user send the information")
            .located(By.xpath("//*[@class=' border-black p-2 border-2 rounded-md mx-auto hover:bg-blue-300']"));
    public static final Target MSG_FINISH = Target.the("Finish message")
            .located(By.xpath("//h1[contains(text(), 'Felicidades, has terminado la prueba exitosamente')]"));
    //
}
