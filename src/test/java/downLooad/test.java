package downLooad;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import static org.junit.Assert.assertEquals;
import java.util.HashMap;
import java.util.Map;

public class test {

    private WebDriver driver;

    public static void main (String [] args ) throws InterruptedException {


      /*  ChromeOptions options = new ChromeOptions();
        Map<String, Object> prefs = new HashMap<String, Object>();
        prefs.put("download.default_directory", "C:\\Users\\Public");
        options.setExperimentalOption("prefs", prefs);

        WebDriver driver = new ChromeDriver(options);

        driver.manage().window().maximize();
        driver.get("https://demoqa.com/upload-download");

        driver.findElement(By.id("downloadButton")).click(); */

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        HomePage homepage = new HomePage();
        driver.get("https://demoqa.com/webtables");

        driver.findElement(homepage.btnAdd).click();
        //driver.findElement(homepage.firstName).sendKeys("Olga Ivanenko");
        driver.findElement(homepage.btnSubmit).click();

        WebElement a = driver.findElement (By.id("lastName"));
        System.out.println(a.getText() + a.getAttribute("background"));
        Thread.sleep(4000);
        a.click();
        System.out.println(a.getText() + a.getAttribute("background"));


       //assertEquals ("rgb(220, 53, 69)" , a.getAttribute("border-color"));
    }

}
