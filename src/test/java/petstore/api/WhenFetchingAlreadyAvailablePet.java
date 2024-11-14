package petstore.api;

import net.serenitybdd.junit5.SerenityJUnit5Extension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

// This anotation tells JUnit that this test case uses Serenity
// If not included the test will not be recognized as a Serenity test
@ExtendWith(SerenityJUnit5Extension.class)
public class WhenFetchingAlreadyAvailablePet {

    // This @Test anotation uses the org.junit.jupiter.api.Test class, from JUnit 5
    @Test
    public void fetchAlreadyAvailablePet() {

    }
}
