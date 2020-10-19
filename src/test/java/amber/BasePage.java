package amber;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    private static final int WAIT_TIME_SECONDS = 15;
    protected final WebDriver driver;

    public BasePage(WebDriver driver) {
        this.driver = driver;
    }

    public String trailOutcome(String value) {
        WebDriverWait wait = new WebDriverWait(driver, WAIT_TIME_SECONDS);
        WebElement element = wait.until(ExpectedConditions.presenceOfElementLocated(
            By.xpath("//code[@class='wrap' and text() = '" + value + "']")));
        return element.getText();
      }
}
