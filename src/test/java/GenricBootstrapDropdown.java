import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class GenricBootstrapDropdown {
    public static void main(String args[])
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://getbootstrap.com/docs/4.0/components/dropdowns/");
        driver.findElement(By.id("dropdownMenuButton")).click();
        List<WebElement> allelements = driver.findElements(By.xpath("//div[@class='dropdown-menu show']//a"));
        dropdownselect(allelements,"Another Action");
        driver.findElement(By.id("dropdownMenuLink")).click();
        List<WebElement> alloptions = driver.findElements(By.xpath("//div[@class='dropdown-menu show']//a"));
        dropdownselect(alloptions,"Another Action");
    }
    public static void dropdownselect(List<WebElement> wb,String Value)
    {
        for(WebElement currentoption:wb)
        {
            if(currentoption.getText().equals(Value))
            {
                currentoption.click();
                break;
            }
        }
    }
}
