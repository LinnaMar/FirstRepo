package task12;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Arrays;

import static org.junit.Assert.*;

public class ActionChainsTests {

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
        driver.quit();
    }

    @Test
    public void dragNdropByTest() throws InterruptedException {
        driver.get("https://javascript.info/article/mouse-drag-and-drop/ball4/");

        WebElement ball = driver.findElement(By.xpath("//*[@id=\"ball\"]"));
        WebElement gate = driver.findElement(By.xpath("//*[@id=\"gate\"]"));

        //your code goes after this line

        //your code goes before this line

        Thread.sleep(2000);
        assertEquals(gate.getAttribute("style"), "background: pink;");
    }

    @Test
    public void scrollTest() {
        driver.get("https://infinite-scroll.com/demo/full-page/");

        //your code goes after this line

        //your code goes before this line

        WebElement collageLink = driver.findElement(By.xpath("//a[text()='Draplin-esque']"));
        collageLink.click();

        String expectedTitle = "Draplin Design Co.: DDC-100 \"Pretty Much Everything Up To October 15, 2015\" Poster";
        assertEquals("Link wasn't clicked", expectedTitle, driver.getTitle());
    }


}

