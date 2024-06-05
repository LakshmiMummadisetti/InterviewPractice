import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class dropdown {
    public static void main(String args[])
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.findElement(By.xpath("//a[text()='Register']")).click();
        WebElement selectdate = driver.findElement(By.xpath("//select[@name='DateOfBirthDay']"));
        Select sedate = new Select(selectdate);
        sedate.selectByVisibleText("12");
        WebElement selectmonth = driver.findElement(By.xpath("//select[@name='DateOfBirthMonth']"));
        Select semonth = new Select(selectmonth);
        sedate.selectByValue("11");
        WebElement selectyear = driver.findElement(By.xpath("//select[@name='DateOfBirthYear']"));
        Select seyear = new Select(selectyear);
        seyear.selectByIndex(45);
        List<WebElement> allmonths = semonth.getOptions();
        for(WebElement currentoption:allmonths)
        {
            if(currentoption.getText().equals("November"))
            {
                currentoption.click();
                break;
            }
        }
    }
}
