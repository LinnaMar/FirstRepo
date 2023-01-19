package waitt;

import PageFac.PageFac;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class program {

    private WebDriver driver;
    private WebDriverWait wait;


    @Before
    public void setUp() {
        WebDriver driver = new ChromeDriver();
        this.driver = driver;
        driver.manage().window().maximize();
        driver.get ("https://ithillel.ua/");
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));  // пишем отдельную переменную вейт, чтоб потом не писать в каждом тесте ее отдельно по сто раз
        }

    @Test

    public void qooqi () {

        WebElement qooqi = wait.until(ExpectedConditions
                              .visibilityOfElementLocated(By.xpath("//button[@class = 'btn -small -light cookie-ntf_agreement']")));

        System.out.println(qooqi.getText()); // війдет на екран кнопка Прийняти кукі
        qooqi.click();
    }

    @Test

    public void visimRokiv (){

        WebElement visim = wait.until(ExpectedConditions
                        .presenceOfElementLocated(By.xpath("//span[@class= 'advantage_numbers'][1]")));

        System.out.println(visim.getText());
    }

    }
