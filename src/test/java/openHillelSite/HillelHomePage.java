package openHillelSite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HillelHomePage {
    private WebDriver driver;


    HillelHomePage(WebDriver driver) {
        this.driver = driver;
    }

    void clickkur() {
        driver.findElement(By.cssSelector("li.site-nav-menu_item:nth-child(2) > button:nth-child(1)")).click();
    }

    void clickInput() {
        driver.findElement(By.className("search-field_input")).sendKeys("QA");
    }

    void clickQAmanual () {
        (new WebDriverWait(driver, Duration.ofSeconds(50)).
                    until (ExpectedConditions.presenceOfElementLocated
                            (By.cssSelector("#coursesMenuSearchPanel > div.search-panel_screen.-result > div > ul > li:nth-child(1) > a > div > p")))).click();

    }
}


