package Prom;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;

public class promTest {

    private WebDriver driver;

    @Before
    public void setUp() {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        this.driver = driver;

        driver.manage().window().maximize();
        driver.get("https://prom.ua/");

    }

    @Test
    public void promOtzyv () throws InterruptedException {
        Cookie getCookie = new Cookie("auth", "df087abb6196f717fe2acb6467c5e60e3049cecb");
        driver.manage().addCookie(getCookie);
        driver.navigate().refresh();

        PromOtzyvPage promOtzyvPage = PageFactory.initElements(driver, PromOtzyvPage.class);
        promOtzyvPage.searchInp.sendKeys("пальто");
        promOtzyvPage.searchBtn.click();

        promOtzyvPage.waitElementVisible(promOtzyvPage.firstCoat).click();

        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,600)");
        Thread.sleep(3000);
        promOtzyvPage.opinionBtn.click();

        //лишити відгук не пускає, бо треба було замовити цей товар
    }
}
