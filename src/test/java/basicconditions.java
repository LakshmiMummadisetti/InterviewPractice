import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class basicconditions {
    public static void main(String[] args)
    {
       // System.setProperty("webdriver.chrome.driver","C:\\Preparation\\Selenium\\lib\\chromedriver.exe");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/newtours/index.php");
        String title = driver.getTitle();
        System.out.println("Title of the page is"+ title);
        String pagesource = driver.getPageSource();
        System.out.println("Page Source details"+ pagesource);
        boolean displayed = driver.findElement(By.xpath("//input[@name='userName']")).isDisplayed();
        System.out.println("is this displayed" + displayed);
        boolean enabled = driver.findElement(By.xpath("//input[@type='password']")).isEnabled();
        System.out.println("is this enabled" + enabled);
        driver.findElement(By.linkText("Flights")).click();
        driver.get("https://www.amazon.com");
        driver.navigate().back();
        driver.navigate().forward();

//        boolean selected = driver.findElement(By.xpath("//input[@value='roundtrip']")).isSelected();
//        System.out.println("is slected:" + selected);
        driver.quit();

    }
}
