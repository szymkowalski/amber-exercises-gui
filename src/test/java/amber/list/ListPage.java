package amber.list;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import amber.BasePage;

public class ListPage extends BasePage{

    @FindBy(className = "u-full-width")
    private WebElement dropDownList;

    @FindBy(xpath = "//option[@value='v8']")
    private WebElement listElement;

    public ListPage(WebDriver driver) {
      super(driver);
    }
  
    public void navigateTo() {
      driver.get("https://antycaptcha.amberteam.pl/exercises/exercise3?seed=88ecc6b0-860a-4c85-97d7-ac684ed618f7");
    }
  
    public void pickItemFromList() {
      dropDownList.click();

      listElement.click();        
      
    }


}