import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.Set;

public class findalllinksinpage {
    public static void main(String args[])
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in/");
        driver.manage().window().maximize();
        List<WebElement> alllinks = driver.findElements(By.tagName("a"));
        System.out.println("all links counts"+alllinks.size());
//        for(int i=0;i<=alllinks.size();i++)
//        {
//            System.out.println(alllinks.get(i).getText());
//        }
        //or
        for(WebElement wb:alllinks)
        {
            System.out.println(wb.getText());
        }
        
    }
}
