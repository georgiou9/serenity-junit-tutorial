package serenityswag.authentication;


import net.serenitybdd.annotations.Managed;
import net.serenitybdd.junit.runners.SerenityRunner;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static org.assertj.core.api.Java6Assertions.assertThat;

@RunWith(SerenityRunner.class)
public class WhenLoggingOn {

    @Managed
    WebDriver driver;

    @Test
    public void userCanLogOnViaTheHomePage() {
        driver.get("https://www.saucedemo.com/");

        // Login as a standart user
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();

        // Should see product catalog
        assertThat(driver.findElement(By.cssSelector(".title")).getText())
                .isEqualTo("Products");
    }
}
