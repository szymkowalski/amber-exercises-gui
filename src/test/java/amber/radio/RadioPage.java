package amber.radio;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import amber.BasePage;

public class RadioPage extends BasePage{

    public RadioPage(WebDriver driver) {
      super(driver);
    }

    @FindBy(xpath = "//input[@value='v80']")
    private WebElement groupZero;

    @FindBy(xpath = "//input[@value='v81']")
    private WebElement groupOne;

    @FindBy(xpath = "//input[@value='v82']")
    private WebElement groupTwo;

    @FindBy(xpath = "//input[@value='v13']")
    private WebElement groupThree;
    
    public void navigateTo() {
      driver.get("https://antycaptcha.amberteam.pl/exercises/exercise4?seed=88ecc6b0-860a-4c85-97d7-ac684ed618f7");
    }
  
    public void groupZeroClick() {
      groupZero.click();
    }
    public void groupOneClick() {
      groupOne.click();
    }
    public void groupTwoClick() {
      groupTwo.click();
    }
    public void groupThreeClick() {
      groupThree.click();
    }

}
