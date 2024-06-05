import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class webtable {
    public static void main(String args[])
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.browserstack.com/guide/selenium-3-vs-selenium-4");
        //Find number of rows
        List<WebElement> rows = driver.findElements(By.xpath("//div[contains(@class,'guide-content')]//table/tbody/tr"));
        System.out.println(rows.size());
        //find number of columns
        List<WebElement> columns = driver.findElements(By.xpath("//div[@class=' guide-content']//tr[1]/th"));
        System.out.println(columns.size());
        //retrieve data from specific row/column
        WebElement specificvalue = driver.findElement(By.xpath("//div[@class=' guide-content']//tr[4]/td[2]"));
        System.out.println(specificvalue.getText());
        //Retreive all data from the table
        for(int r=2;r<=rows.size();r++)
        {
            for(int c=1;c<=columns.size();c++)
            {
                WebElement wb = driver.findElement(By.xpath("//div[@class=' guide-content']//tr["+r+"]//td["+c+"]"));
                System.out.println(wb.getText()+"    ");
            }
            System.out.println();
        }
    }
}
