package amber.radio;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import io.github.bonigarcia.seljup.SeleniumExtension;

@ExtendWith(SeleniumExtension.class)
@DisplayName("Exercise 4 Test")

class RadioTest{

    private RadioPage pickFromLists;

    @BeforeEach
    void beforeEach(ChromeDriver driver) {
        this.pickFromLists = PageFactory.initElements(driver, RadioPage.class);
        this.pickFromLists.navigateTo();
    }

    @Test
    @DisplayName("Radio Test")
    void radioTest() {

        pickFromLists.groupZeroClick();

        pickFromLists.groupOneClick();

        pickFromLists.groupTwoClick();

        pickFromLists.groupThreeClick();

        assertEquals("[8, 8, 8, 1]", pickFromLists.trailOutcome("[8, 8, 8, 1]"));

    }

}
