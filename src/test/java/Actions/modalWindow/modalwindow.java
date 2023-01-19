package Actions.modalWindow;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;


public class modalwindow {

    private WebDriver driver;

    public static void main (String [] args ) throws InterruptedException {


        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/text-box");
        driver.manage().window().maximize();

        driver.findElement(By.id("userEmail")).sendKeys("ertyui");

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,200)");

        driver.findElement(By.id("submit")).click();
        Thread.sleep(2000);
        WebElement a = driver.findElement(By.id("userEmail"));
        String par = a.getAttribute("class");
        System.out.println(par);
        assertEquals ("mr-sm-2 field-error form-control", par);

    }
}
