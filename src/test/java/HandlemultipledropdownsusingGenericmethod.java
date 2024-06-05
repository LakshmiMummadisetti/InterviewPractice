import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class HandlemultipledropdownsusingGenericmethod {
    public static void main(String args[])
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
        driver.manage().window().maximize();
//        Select date = new Select(driver.findElement(By.xpath("//select[@name='DateOfBirthDay']")));
//        date.selectByIndex(10);
//        Select month = new Select(driver.findElement(By.xpath("//select[@name='DateOfBirthMonth']")));
//        month.selectByValue("11");
//        Select year = new Select(driver.findElement(By.xpath("//select[@name='DateOfBirthYear']")));
//        year.selectByVisibleText("1993");

        WebElement wbdate = driver.findElement(By.xpath("//select[@name='DateOfBirthDay']"));
        selectdropdown(wbdate,"12");
        WebElement wbmonth =driver.findElement(By.xpath("//select[@name='DateOfBirthMonth']"));
        selectdropdown(wbmonth,"November");
        WebElement wbyear =driver.findElement(By.xpath("//select[@name='DateOfBirthYear']"));
        selectdropdown(wbyear,"1993");

        driver.quit();
    }
    // This method get all options from the webelement
    public static void selectdropdown(WebElement ele, String Value)
    {
        Select se = new Select(ele);
        List<WebElement> alloptions = se.getOptions();
        for(WebElement currentoption:alloptions)
        {
            if(currentoption.getText().equals(Value))
            {
                currentoption.click();
                break;
            }
        }
    }
}
