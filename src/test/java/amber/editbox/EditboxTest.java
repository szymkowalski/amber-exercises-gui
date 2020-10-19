package amber.editbox;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import io.github.bonigarcia.seljup.SeleniumExtension;

@ExtendWith(SeleniumExtension.class)
@DisplayName("Exercise 2 Test")

class EditboxTest{

    private EditboxPage editTextBox;
    
    private static final String TEXT = "Long particularly.";
    
    @BeforeEach
    void beforeEach(ChromeDriver driver) {
        this.editTextBox = PageFactory.initElements(driver, EditboxPage.class);
        this.editTextBox.navigateTo();
    }

    @Test
    @DisplayName("Editbox Test")
    void editboxTest() {

    editTextBox.enterText(TEXT);

    editTextBox.clickButton();

    assertEquals(TEXT, editTextBox.lineOneCodeGetText());

    }

}