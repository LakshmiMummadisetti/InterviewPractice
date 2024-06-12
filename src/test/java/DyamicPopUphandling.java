import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class DyamicPopUphandling {
    public static void main(String args[]) {
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        if (wait.until(ExpectedConditions.alertIsPresent()) == null) {
            System.out.println("Alert is not present");
        } else
            driver.switchTo().alert().accept();


//        try {
//            driver.switchTo().alert().accept();
//        } catch (noAlertPresentException e) {
//            System.out.println("Alert is not displayed");
//
//        }
    }
}