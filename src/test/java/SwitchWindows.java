import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class SwitchWindows {
    public static void main(String args[])
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.selenium.dev/documentation/webdriver/interactions/");
        driver.findElement(By.xpath("//a[normalize-space()='Edit this page']")).click();
        String currentwindowid = driver.getWindowHandle();
        Set<String> allwindowsid = driver.getWindowHandles();
        Iterator<String> ite = allwindowsid.iterator();
        String Parentwindowid = ite.next();
        String Childwindowid = ite.next();
        driver.switchTo().window(Childwindowid);
        System.out.println("Parent Window title " + driver.getTitle());
        driver.findElement(By.linkText("Create an account")).click();
        driver.switchTo().window(Parentwindowid);
        System.out.println("Child Window title " + driver.getTitle());
        //driver.navigate().back();
        driver.findElement(By.xpath("(//button[contains(text(),'Python')])[1]")).click();

        //driver.quit();
    }
}
