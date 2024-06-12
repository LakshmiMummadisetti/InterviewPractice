import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;

public class NseIndia {
    public static void main(String args[]) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get ("https://www.nseindia.com/");
        driver.manage().window().maximize();
        driver.findElement(By.id("Equities")).click();
        driver.findElement(By.xpath("(//label[@id='market-lakh'])[3]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("(//span[@id='viewall'])[11]")).click();
        List<WebElement> allitems = driver.findElements(By.xpath("//tbody/tr/td[1]/a"));
        for(WebElement str : allitems)
        {
           System.out.println(str.getText());
        }
        Iterator<WebElement> ite = allitems.iterator();
        while (ite.hasNext())
        {
            System.out.println(ite.next().getText());
        }
    }
}
