package PageFac;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PageFac {
 private WebDriver driver;

    @FindBy (id = "btn-consultation-hero")
    WebElement btnconsultation;


    public PageFac (WebDriver driver) {
        this.driver = driver;
    }
}
