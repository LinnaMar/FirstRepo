package session12;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;
import java.util.Arrays;

import static org.junit.Assert.assertEquals;

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
        //Close browser
        driver.quit();
    }

    @Test
    public void dragNdropTest() throws InterruptedException {
        driver.get("https://javascript.info/article/mouse-drag-and-drop/ball4/");

        WebElement ball = driver.findElement(By.xpath("//*[@id=\"ball\"]"));
        WebElement gate = driver.findElement(By.xpath("//*[@id=\"gate\"]"));

        actions.dragAndDrop(ball, gate).perform();
        Thread.sleep(2000);

        assertEquals(gate.getAttribute("style"), "background: pink;");
    }

    @Test
    public void moveToElementTest() throws InterruptedException {
        driver.get("https://javascript.info/article/mouse-drag-and-drop/ball4/");

        WebElement ball = driver.findElement(By.xpath("//*[@id=\"ball\"]"));
        WebElement gate = driver.findElement(By.xpath("//*[@id=\"gate\"]"));

        actions.clickAndHold(ball)
                .moveToElement(gate)
                .release()
                .perform();

        Thread.sleep(2000);

        assertEquals(gate.getAttribute("style"), "background: pink;");
    }



    @Test
    public void moveWithOffsetTest() throws InterruptedException {
        driver.get("https://javascript.info/article/mouse-drag-and-drop/ball4/");

        WebElement ball = driver.findElement(By.xpath("//*[@id=\"ball\"]"));
        WebElement gate = driver.findElement(By.xpath("//*[@id=\"gate\"]"));

        actions.clickAndHold(ball)
                .moveToElement(ball, -60, -100)
                .release()
                .perform();

        Thread.sleep(2000);

        assertEquals(gate.getAttribute("style"), "background: pink;");
    }

    @Test
    public void contextClickTest() throws InterruptedException {
        driver.get("http://medialize.github.io/jQuery-contextMenu/demo.html");

        WebElement rightClickElement = driver.findElement(By.xpath("//*[text()='right click me']"));

        actions.contextClick(rightClickElement).moveToElement(rightClickElement, 10,10)
                .click()
                .perform();

        Thread.sleep(2000);

        Alert alert=driver.switchTo().alert();
        String textEdit = alert.getText();
        assertEquals("Failed to click on Edit link", textEdit, "clicked: edit");
    }
}
