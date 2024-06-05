import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class amazonpageprintalltoplinks
{
    public static void main(String args[])
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.in/");
        List<WebElement> allelements = driver.findElements(By.xpath("//div[@id='nav-xshop']//a[@class='nav-a  ']"));
        System.out.println(allelements.size());
        for(WebElement wb:allelements)
        {
            System.out.println(wb.getText());
        }
    }
}

