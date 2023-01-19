package package2911;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Test;
import java.time.Duration;

//тест с пейджОбджект

public class program {
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
    public void correctRegister () {

        page p = new page(driver);

        p.clickFreeConsult();

        p.enterUsername();
        p.enterMail();
        p.enterPhone();

        p.clickDropdown();
        p.clickFrontendCourse();
        p.clickCheckbox();


        }
    }




