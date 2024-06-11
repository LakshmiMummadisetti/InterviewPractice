import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class DatePicker {
    public static void main(String args[])
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.dummyticket.com/dummy-ticket-for-visa-application/");
        driver.findElement(By.xpath("//input[@name='appoinmentdate']")).click();
        driver.findElement(By.xpath("//select[@class='ui-datepicker-month']")).click();
        WebElement seMonth = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
        Select se = new Select(seMonth);
        se.selectByVisibleText("Nov");
        driver.findElement(By.xpath("//select[@class='ui-datepicker-month']")).click();
        WebElement seyear = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
        Select se1 = new Select(seyear);
        se.selectByVisibleText("2022");

    }
}
