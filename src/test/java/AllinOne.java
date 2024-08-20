

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

public class AllinOne {
    public static void main(String[] args) throws IOException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.globalsqa.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.xpath("//li[@id='menu-item-6898']//a[normalize-space()='CheatSheets']")).click();
        TakesScreenshot ts = (TakesScreenshot)driver;
        File src = ts.getScreenshotAs(OutputType.FILE);
        File target = new File("C://Users//0036L1744//Downloads//screenshots/screenshot.png");
        FileUtils.copyFile(src,target);
        WebElement wb = driver.findElement(By.xpath("//li[@id='menu-item-51137']//a[normalize-space()='Home']"));
        Point location = wb.getLocation();
        System.out.println("point is " + location);
        Dimension sze = wb.getSize();
        System.out.println("Dimension is " + sze);
        int width = wb.getSize().getWidth();
        int height = wb.getSize().getHeight();
        System.out.println("Width is " + width);
        System.out.println("height is " + height);

    }
}
