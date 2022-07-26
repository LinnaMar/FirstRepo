package session12;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class IframeTests {

    private WebDriver driver;
    private Actions actions;

    @Before
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("excludeSwitches", Arrays.asList("disable-popup-blocking"));
        driver = new ChromeDriver(options=options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        actions = new Actions(driver);
    }

    @After
    public void tearDown() {
        //Close browser
        driver.quit();
    }

    @Test
    public void singleIframeTest() throws InterruptedException {
        driver.get("https://www.rediff.com/");

        WebElement moneyFrame = driver.findElement(By.xpath("//iframe[@id='moneyiframe']"));
        driver.switchTo().frame(moneyFrame);

        WebElement lastTradedTime = driver.findElement(By.xpath("//div[@id='last_traded_time']"));
        String actualTime = lastTradedTime.getText();
        assertNotEquals(lastTradedTime, "");


        driver.switchTo().defaultContent();
        WebElement createAccountLink = driver.findElement(By.linkText("Create Account"));
        createAccountLink.click();

    }
}
