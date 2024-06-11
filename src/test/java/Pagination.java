import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class Pagination {
    public static void main(String args[])
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://datatables.net/examples/advanced_init/dt_events.html");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        List<WebElement> elements = driver.findElements(By.xpath("//tbody/tr/td[@class='sorting_1']"));
        List<String> allelements = new ArrayList<>();
        for(WebElement str : elements)
        {
            allelements.add(str.getText());
        }

        WebElement wb = driver.findElement(By.xpath("//button[@data-dt-idx='next']"));
        String nextvalue = wb.getAttribute("class");
        while (!nextvalue.contains("disabled"))
        {
            driver.findElement(By.xpath("//button[@data-dt-idx='next']")).click();
             elements = driver.findElements(By.xpath("//tbody/tr/td[@class='sorting_1']"));
            for(WebElement str : elements)
            {
                allelements.add(str.getText());
            }
           nextvalue= driver.findElement(By.xpath("//button[@data-dt-idx='next']")).getAttribute("class");
        }
        System.out.println(allelements);
        String str = driver.findElement(By.xpath("//div[@id='example_info']")).getText().split(" ")[5];
        System.out.println(str);
    }
}
