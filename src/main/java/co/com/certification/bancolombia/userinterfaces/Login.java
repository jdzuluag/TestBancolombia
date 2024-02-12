package co.com.certification.bancolombia.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class Login {
    public static final Target INPUT_USER = Target.the("the user enters his user")
            .located(By.name("username"));
    public static final Target INPUT_PASSWORD = Target.the("the user enters his password")
            .located(By.name("password"));
    public static final Target BUTTON_SEND = Target.the("the user click on send")
            .located(By.xpath("//*[@class='bg-white border-black p-2 border-2 rounded-md hover:bg-blue-300 w-1/2 mx-auto']"));


}
