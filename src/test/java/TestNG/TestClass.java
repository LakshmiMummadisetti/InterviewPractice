package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;



import java.time.Duration;

public class TestClass extends BaseClass {

//    @BeforeTest
//    public void openBrowser()
//    {
//        driver.get("https://www.globalsqa.com/");
//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//    }

    public void selectElements()
    {
        driver.get("https://www.globalsqa.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    driver.findElement(By.xpath("//img[@alt='GlobalSQA']"));
        WebElement seach = driver.findElement(By.className("s"));
        sendkeysE(seach,"SeachingKeyword");
        WebElement searchicon = driver.findElement(By.xpath("//button[@class='button_search']"));
        clickE(searchicon);
    }
    public void clickE(WebElement wb)
    {
        wb.click();
    }
    public void sendkeysE(WebElement text,String str)
    {
        text.sendKeys(str);
    }
}
