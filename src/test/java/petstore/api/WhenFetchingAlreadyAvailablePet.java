package petstore.api;

import net.serenitybdd.annotations.Story;
import net.serenitybdd.junit5.SerenityJUnit5Extension;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import petstore.api.actions.PetApiActions;

// This anotation tells JUnit that this test case uses Serenity
// If not included the test will not be recognized as a Serenity test
@ExtendWith(SerenityJUnit5Extension.class)
//@DisplayName("Fetching Available Pet")
public class WhenFetchingAlreadyAvailablePet {

    Long newPetId = null;
    PetApiActions petApi;

    // This @Test anotation uses the org.junit.jupiter.api.Test class, from JUnit 5
    @Test
    public void fetchAlreadyAvailablePet() {
        // Arrange (Given)
        newPetId = petApi.givenKittyIsAvailableInPetStore();

        // Act (When)
        petApi.whenIAskForAPetWithId(newPetId);

        // Assert (Then)
        petApi.thenISeeKittyAsResult();

    }
}
