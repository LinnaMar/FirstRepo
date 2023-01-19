package package2611;

import dev.failsafe.internal.util.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import static junit.framework.TestCase.assertEquals;


public class program2611 {

    public static void main (String[] args) throws InterruptedException {

        By impressButton = By.xpath("//*[text() ='Impressive']");
        By radioButton = By.xpath("//span[text()='Radio Button']");
        By impresText = By.xpath("//p[@class ='mt-3' ] /span [text() ='Impressive']");

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://demoqa.com/elements");


       driver.findElement(radioButton).click();

       Thread.sleep(5);

       driver.findElement(impressButton).click();

       WebElement impressiveText = driver.findElement(impresText);

       assertEquals("Impressive", impressiveText.getText());

    }
}
