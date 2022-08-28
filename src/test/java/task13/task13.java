package task13;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class task13 {
    public WebDriver driver;


    @Before
    public void setUp() {
        WebDriver driver = new ChromeDriver();
        WebDriverManager.chromedriver().setup();
        System.setProperty("webdriver.chrome.driver", "C:\\Users/evolv/chromedriver.exe");
        driver.get("https://ithillel.ua/");
    }

    @After
    public void cleanUp() {
    }

    @Test
    public void openSite() {

        System.out.println(driver.getCurrentUrl());
    }

    @Test
    public void openTitle() {

        System.out.println(driver.getTitle());
    }
    @Test
    public void openUrl() {

        System.out.println(driver.getTitle());
    }

}
