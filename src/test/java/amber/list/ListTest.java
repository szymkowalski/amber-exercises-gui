package amber.list;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import io.github.bonigarcia.seljup.SeleniumExtension;

@ExtendWith(SeleniumExtension.class)
@DisplayName("Exercise 3 Test")

class ListTest{

    private ListPage thisList;

    @BeforeEach
    void beforeEach(ChromeDriver driver) {
        this.thisList = PageFactory.initElements(driver, ListPage.class);
        this.thisList.navigateTo();
    }

    @Test
    @DisplayName("Dropdown List Test")
    void listTest() {

    thisList.pickItemFromList();

    assertEquals("s13:v8", thisList.trailOutcome("s13:v8"));
    }

}
