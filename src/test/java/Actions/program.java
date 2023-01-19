package Actions;

import dev.failsafe.internal.util.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import static org.junit.Assert.assertEquals;

public class program {

    private WebDriver driver;

    private Actions actions;

    @Before
    public void SetUp () throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        this.driver = driver;
        driver.get ("https://javascript.info/article/mouse-drag-and-drop/ball4/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
    }

    @Test

    public void ballToGate ()  {

        Actions actions = new Actions(driver);

        WebElement ball = driver.findElement(By.id("ball"));
        WebElement gate = driver.findElement(By.id("gate"));

       // actions.moveToElement(ball).clickAndHold().moveToElement(gate).release().perform(); // пошагово наведу на эл-т, зажму, передвину, отпущу
       // actions.dragAndDrop(ball, gate).perform(); // упрощенный метод
        actions.dragAndDropBy(ball, -57, - 113).perform();

        // как определить, куда двигать мяч и сколько пикселей? На странице есть скрипт, его надо открыть и подвигать мячем. Бужет видно изменения по осям
        assertEquals (gate.getAttribute  ("style"), "background: pink;");
        // здесь самое запутанное. В getAttribute я впишу то, что изменится, а именно фон станет розовым. Но я пишу не само слово розовый,
        // а именно ищу слово стайл. Потому что имя аттрибута стайл, а внутри стайл уже впишется розовый
    }

}
