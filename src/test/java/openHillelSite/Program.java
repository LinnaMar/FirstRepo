package openHillelSite;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import static junit.framework.TestCase.assertEquals;
import java.time.Duration;

import static junit.framework.TestCase.assertEquals;

public class  Program {

    private WebDriver driver;

    @Before
    public void setUp() {
        WebDriver driver = new ChromeDriver();
        this.driver = driver;
        driver.manage().window().maximize();
        driver.get("https://ithillel.ua/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

    @Test

    public void checkSearch  () throws InterruptedException {
        HillelHomePage hillelHomePage = new HillelHomePage(driver);


        hillelHomePage.clickkur();
        hillelHomePage.clickInput();
        Thread.sleep(3000);
        hillelHomePage.clickQAmanual();

        assertEquals("Курс QA Manual в Комп'ютерній школі Hillel у Києві", driver.getTitle());
        System.out.println("correct");
    }

}

// если хочу использовать паузу в виде тред.слип, надо в тесте  @Test поставить
// throws InterruptedException, а потом перед кликом на кнопку,
// в єтом же тесте внутри єтого файла ставить тред.слип и вписать милисекунді
