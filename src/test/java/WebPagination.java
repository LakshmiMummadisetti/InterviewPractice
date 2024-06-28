import io.github.bonigarcia.wdm.WebDriverManager;
import org.checkerframework.checker.units.qual.K;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class WebPagination {
    public static void main(String args[])
    {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://datatables.net/examples/advanced_init/dt_events.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        List<WebElement> age1 = driver.findElements(By.xpath("//tbody//tr/td[4]"));
        List<WebElement> name1 = driver.findElements(By.xpath("//tbody//tr/td[1]"));
        Map<String,Integer> map = new HashMap<>();
        System.out.println(age1.size());

        Iterator<WebElement> itname =  name1.iterator();
        Iterator<WebElement> itage =  age1.iterator();
        while (itname.hasNext()&&itage.hasNext())
        {
            map.put(itname.next().getText(), Integer.valueOf(itage.next().getText()));
        }



//        List<WebElement> agen = driver.findElements(By.xpath("//tbody//tr/td[4]"));
//        List<WebElement> namen = driver.findElements(By.xpath("//tbody//tr/td[1]"));
//        Iterator<WebElement> nextages =  agen.iterator();
//        Iterator<WebElement> nextnames =  namen.iterator();
        WebElement wb = driver.findElement(By.xpath("//button[@data-dt-idx='next']"));

        String nextvalue = wb.getAttribute("class");
        while (!nextvalue.contains("disabled")) {

                driver.findElement(By.xpath("//button[@data-dt-idx='next']")).click();
            List<WebElement>  newages = driver.findElements(By.xpath("//tbody//tr/td[4]"));
            List<WebElement> newnames = driver.findElements(By.xpath("//tbody//tr/td[1]"));
            Iterator<WebElement> nextages =  newages.iterator();
        Iterator<WebElement> nextnames =  newnames.iterator();
            while (nextages.hasNext()&&nextnames.hasNext()) {
                map.put(nextnames.next().getText(), Integer.valueOf(nextages.next().getText()));

                nextvalue = driver.findElement(By.xpath("//button[@data-dt-idx='next']")).getAttribute("class");
            }
        }
        System.out.println(map);
        Map<String,Integer> result = new HashMap<>();

       for(Map.Entry<String,Integer> ent : map.entrySet())
       {
           if(ent.getValue()<28)
           {
               result.put(ent.getKey(), ent.getValue());
           }
       }
       System.out.println(result);
    }
}
