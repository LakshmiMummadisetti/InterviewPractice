import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class FindElementsvsFindElement {
    public static void main(String args[])
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://demo.nopcommerce.com/");
        WebElement searchbox = driver.findElement(By.xpath("//input[@id='small-searchterms']"));
        searchbox.sendKeys("phones");
        driver.findElement(By.xpath("//button[@class='button-1 search-box-button']")).click();
        // gives only first webelement
        WebElement multiple = driver.findElement(By.xpath("//div[@class='footer-upper']//a"));
        System.out.println(multiple.getText());
        // Capture multiple webelements
        List<WebElement> links = driver.findElements(By.xpath("//div[@class='footer-upper']//a"));
        int t = links.size();
        System.out.println(t);
        for(WebElement element:links)
        {
            System.out.println(element.getText());
        }
        driver.quit();
    }
}
