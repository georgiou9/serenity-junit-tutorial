package serenityswag.authentication.actions;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.core.steps.UIInteractionSteps;
import org.openqa.selenium.By;

public class LoginActions extends UIInteractionSteps {

    //UIInteractionSteps gives the capability to add some shortcuts into the code, that make the
    // serenity code easier to read and quicker to write
    @Step("Log in as {0} {0}")
    public void usingCredentials(String username, String password) {

        // with UIInteractionsSteps we can use other methods instead of calling the driver
        //driver.get("https://www.saucedemo.com/");
        openUrl("https://www.saucedemo.com");

        // we can reaplace driver.findElement with just find()
        // we can also replace find() with the dollar sign $
        // Login as a standart user
//        driver.findElement(By.id("user-name")).sendKeys("standard_user");
//        driver.findElement(By.id("password")).sendKeys("secret_sauce");
//        driver.findElement(By.id("login-button")).click();
        find(By.id("user-name")).sendKeys(username);
        find(By.id("password")).sendKeys(password);
        find(By.id("login-button")).click();
    }

}
