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
        //WebDriverManager.chromedriver().setup();

        System.setProperty("webdriver.chrome.driver", "C:\\Users/evolv/chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.setExperimentalOption("excludeSwitches", Arrays.asList("disable-popup-blocking"));
        driver = new ChromeDriver(options=options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        driver.manage().window().maximize();
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
        actions.dragAndDropBy(ball, -60, -106).perform();
        //your code goes before this line

        Thread.sleep(4000);
        assertEquals(gate.getAttribute("style"), "background: pink;");
        System.out.println("Test with ball passed");
    }

    @Test
    public void scrollTest() throws InterruptedException {

        driver.get("https://infinite-scroll.com/demo/full-page/");

        //your code goes after this line
        actions.scrollByAmount(0, 6930).perform();
        //your code goes before this line
        //Thread.sleep(4000);
        WebElement collageLink = driver.findElement(By.xpath("//a[text()='Draplin-esque']"));
       // Thread.sleep(4000);
        collageLink.click();
       // Thread.sleep(4000);
        String expectedTitle = "Draplin Design Co.: DDC-100 \"Pretty Much Everything Up To October 15, 2015\" Poster";
        assertEquals("Link wasn't clicked", expectedTitle, driver.getTitle());
        System.out.println("Test with scroll passed");
    }
}

