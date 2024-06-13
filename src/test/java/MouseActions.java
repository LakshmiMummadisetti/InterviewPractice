import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class MouseActions {
    public static void main(String args[]) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement rightClickButton = driver.findElement(By.xpath("//span[text()='right click me']"));
        Actions ac = new Actions(driver);
        ac.contextClick(rightClickButton).perform();
        ac.sendKeys(Keys.SPACE).build().perform();
        driver.findElement(By.xpath("//span[text()='Edit']")).click();
        driver.switchTo().alert().accept();
    }
}
