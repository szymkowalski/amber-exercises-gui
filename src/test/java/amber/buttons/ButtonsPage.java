package amber.buttons;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import amber.BasePage;

public class ButtonsPage extends BasePage {

  @FindBy(xpath = "//button[@name='btnButton2']")
  private WebElement buttonTwo;

  public ButtonsPage(WebDriver driver) {
    super(driver);
  }

  public void navigateTo() {
    driver.get("https://antycaptcha.amberteam.pl/exercises/exercise1?seed=fea80053-f0e3-451f-962b-1069272894ae");
  }

  public void pressButtonNoOfTimes(int times) {
    for (int i = 0; i < times; i++) {
      buttonTwo.click();
      try {
        Thread.sleep(50);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }

}