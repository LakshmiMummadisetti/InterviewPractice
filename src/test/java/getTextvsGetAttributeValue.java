import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class getTextvsGetAttributeValue {
    public static void main(String args[])
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.nopcommerce.com/");
        driver.findElement(By.linkText("Log in")).click();
        driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("laskhmikumari@gmail.com");
        driver.findElement(By.xpath("//input[@id='Email']")).clear();
        driver.findElement(By.xpath("//input[@id='Email']")).sendKeys("adminurlnow");
        WebElement regtext = driver.findElement(By.xpath("//button[text()='Register']"));
        //gives the inner text
        System.out.println(regtext.getText());
        // it returns the value of the associated attribute.
        System.out.println(regtext.getAttribute("type"));

        }
}
