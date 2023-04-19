package Prom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class PromOtzyvPage {

    private WebDriver driver;
    public PromOtzyvPage(WebDriver driver) {
        this.driver=driver;
    }

    @FindBy (xpath = "//input[@type='search']")
    WebElement searchInp;

    @FindBy (xpath = "//button[@data-qaid='search_btn']")
    WebElement searchBtn;

    @FindBy (xpath = "(//div[@class='l-GwW js-productad']) [1]")
    WebElement firstCoat;

    @FindBy (xpath = "//a[@data-qaid='opinion_count_btn']")
    WebElement opinionBtn;

    public WebElement waitElementVisible (WebElement element) {
        new WebDriverWait(driver, Duration.ofSeconds(8)).until(ExpectedConditions.elementToBeClickable(element));
        return element;
    }

}
