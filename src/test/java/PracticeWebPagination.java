import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class PracticeWebPagination {
    public static void main(String args[]) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://datatables.net/examples/advanced_init/dt_events.html");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(13));
        // get the row and column number of a specific element:
        int rowcount = driver.findElements(By.xpath("//table[@id='example']/tbody/tr/td[1]")).size();
        int columncount = driver.findElements(By.xpath("//table[@id='example']/tbody/tr[1]/td")).size();
        for (int i = 1; i <= rowcount; i++) {
            for (int j = 1; j <= columncount; j++) {
                String actual = driver.findElement(By.xpath("//table[@id='example']/tbody/tr[" + i + "]/td[" + j + "]")).getText();
                if (actual.equals("Software Engineer")) {
                    System.out.println(i + "," + j);
                }
            }
        }
// get the names which has age >40

        for (int j = 1; j <= columncount; j++) {
            String actual = driver.findElement(By.xpath("//table[@id='example']/tbody/tr[" + j + "]/td[4]")).getText();
            if (Integer.parseInt(actual) > 40) {
                String result = driver.findElement(By.xpath("//table[@id='example']/tbody/tr[" + j + "]/td[1]")).getText();
                System.out.println(result);

            }
        }

        for (int j = 1; j <= columncount; j++) {
            String val = driver.findElement(By.xpath("//table[@id='example']/tbody/tr[" + rowcount + "]/td[" + j + "]")).getText();
            System.out.println(val);
        }
    }
}
