package serenityswag.authentication;


import net.serenitybdd.annotations.Managed;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.core.steps.UIInteractionSteps;
import net.serenitybdd.junit.runners.SerenityRunner;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;
import serenityswag.authentication.actions.LoginActions;
import serenityswag.inventory.InventoryPage;

import static org.assertj.core.api.Assertions.assertThat;

@RunWith(SerenityRunner.class)
//@ExtendWith(SerenityJUnit5Extension.class)
public class WhenLoggingOn {

    @Managed
    WebDriver driver;

    // The steps annotation identifies action classes
    // One or more steps that relate to business functionality
    @Steps
    LoginActions login;

    // This is a lightweight page object
    // No need for @annotation since serenity will recognize it automatically
    InventoryPage inventoryPage;

    @Test
    public void userCanLogOnViaTheHomePage() {

        login.usingCredentials("standard_user", "secret_sauce");

        // Should see product catalog
        assertThat(inventoryPage.getHeading()).isEqualToIgnoringCase("Products");
    }
}
