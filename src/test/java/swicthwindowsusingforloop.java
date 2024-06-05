import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class swicthwindowsusingforloop {
    public static void main(String args[]) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.selenium.dev/documentation/webdriver/interactions/");
        driver.findElement(By.xpath("//a[normalize-space()='Edit this page']")).click();
        String currentwindowid = driver.getWindowHandle();
        Set<String> allwindowsid = driver.getWindowHandles();
        List<String> allwindowsidinlist = new ArrayList(allwindowsid);
        for(String str:allwindowsidinlist)
        {
            String title = driver.switchTo().window(str).getTitle();
            System.out.println("Foreach loop" + title);
        }

    }
}
