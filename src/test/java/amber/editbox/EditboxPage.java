package amber.editbox;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class EditboxPage {

    private final WebDriver driver;

    @FindBy(xpath = "//input")
    private WebElement textBox;

    @FindBy(xpath = "//button[@name='btnButton1']")
    private WebElement buttonOne;

    @FindBy(xpath = "//tr[2]//code[1]")
    private WebElement lineOneCode;

    public EditboxPage(WebDriver driver) {
        this.driver = driver;
      }
    
      public void navigateTo() {
        driver.get("https://antycaptcha.amberteam.pl/exercises/exercise2?seed=5268178a-de3c-4640-b541-b106dea4751f");
      }

      public void enterText(String text) {
          textBox.clear();
          textBox.sendKeys(text);
      }

      public void clickButton() {
        buttonOne.click();
      }

      public String lineOneCodeGetText() {
        return lineOneCode.getText();
      }
}
