package amber.buttons;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import io.github.bonigarcia.seljup.SeleniumExtension;

@ExtendWith(SeleniumExtension.class)
@DisplayName("Exercise 1 Test")

class ButtonsTest{

    private ButtonsPage pressButton;

    @BeforeEach
    void beforeEach(ChromeDriver driver) {
        this.pressButton = PageFactory.initElements(driver, ButtonsPage.class);
        this.pressButton.navigateTo();
    }

    @Test
    @DisplayName("Button Test")
    void buttonTest() {

    pressButton.pressButtonNoOfTimes(3);

    assertEquals("b2b2b2", pressButton.trailOutcome("b2b2b2"));

    }

}
