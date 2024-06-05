import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class GETWindowHandles {
    public static void main (String args[]) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();
        driver.get("https://www.selenium.dev/documentation/webdriver/interactions/");
        String currentwindow = driver.getWindowHandle();
        System.out.println("current window is:"+currentwindow);
        driver.findElement(By.xpath("(//a[normalize-space()='Edit this page'])[1]")).click();
        Set<String> AllWindowIds = driver.getWindowHandles();
        // First method using iterator
        Iterator<String> it = AllWindowIds.iterator();
        String parentid = it.next();
        String childid = it.next();
        System.out.println(parentid);
        System.out.println(childid);
        // second method using List/Arraylist
        List<String> windowidlist = new ArrayList(AllWindowIds); // converts set to list
        String parentidnew = windowidlist.get(0);
        String Childnew= windowidlist.get(1);
        System.out.println(parentidnew);
        System.out.println(Childnew);


    }
}
