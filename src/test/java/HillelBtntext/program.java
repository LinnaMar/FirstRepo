package HillelBtntext;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;

import static junit.framework.TestCase.assertEquals;

public class program {
    private WebDriver driver;

    @Before

    public void SetUp () {
    WebDriver driver = new ChromeDriver();
    this.driver = driver;
    driver.get ("https://demoqa.com/webtables");
    driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));


    }

  /*  @After

    public void CleanUp () {
        driver.quit();
    } */


    @Test

    public void wrongEmail () throws InterruptedException {
    Homepage homepage = PageFactory.initElements(driver, Homepage.class);
    homepage.addButton.click();

    homepage.firstName.sendKeys(homepage.getFirstName());
    homepage.lastName.sendKeys(homepage.getLastName());
    homepage.userAge.sendKeys(homepage.getAge());
    homepage.userSalary.sendKeys("3000");
    homepage.department.sendKeys("deparrrtment");
    homepage.email.sendKeys("wrongEmailtext");

    homepage.submitButton.click();
    Thread.sleep(2000);

    assertEquals("rgb(220, 53, 69)", homepage.email.getCssValue ("border-color"));
        System.out.println("Рамка імейла стала червоною. Тест пройшов");
    }


    @Test
    public void wrongSalary () throws InterruptedException {

        Homepage homepage = PageFactory.initElements(driver, Homepage.class);
        homepage.addButton.click();

        homepage.firstName.sendKeys(homepage.getFirstName());
        homepage.lastName.sendKeys(homepage.getLastName());
        homepage.userAge.sendKeys(homepage.getAge());
        homepage.userSalary.sendKeys(homepage.getWrongUsersalary());
        homepage.department.sendKeys("deparrrtment");
        homepage.email.sendKeys(homepage.getEmailName());
        homepage.submitButton.click();

        Thread.sleep(2000);

        assertEquals("rgb(220, 53, 69)", homepage.userSalary.getCssValue ("border-color"));
        System.out.println("Рамка зарплатні стала червоною. Тест пройшов");
    }

    @Test
    public void correctFillingForm ()
    {
        Homepage homepage = PageFactory.initElements(driver, Homepage.class);
        homepage.addButton.click();

        homepage.firstName.sendKeys(homepage.getFirstName());
        homepage.lastName.sendKeys(homepage.getLastName());
        homepage.userAge.sendKeys(homepage.getAge());
        homepage.userSalary.sendKeys("3000");
        homepage.department.sendKeys("deparrrtment");
        homepage.email.sendKeys(homepage.getEmailName());
        homepage.submitButton.click();

        homepage.searchBox.sendKeys(homepage.getEmailName());

        Boolean emailAdded = driver.findElement(By.xpath("//*[text() ='abv@gmail.com']")).isDisplayed();
        //Thread.sleep(5000);
        if (emailAdded == true) {
            System.out.println("Новий імейл додали і знайшли");
        } else {
            System.out.println("Новий імейл не додали чи не знайшли");
        }

    }

    @Test

    public void clickWhiteSquare () {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,1000)");

        driver.findElement(By.xpath("//div[@class= 'element-group'][5]")).click();
        driver.findElement(By.xpath("//*[text()='Selectable']")).click();
        driver.findElement(By.id("demo-tab-grid")).click();
        driver.findElement(By.xpath("(//div[@class='list-group list-group-horizontal-sm'])[2]/li[2]")).click();
        WebElement e = driver.findElement(By.xpath("(//div[@class='list-group list-group-horizontal-sm'])[2]/li[2]"));
        System.out.println(e.getCssValue( "background-color") + "синий");

    }

    @Test

    public void clickCheckbox () {

        driver.findElement(By.xpath("//span[contains (text(), 'Check Box')]")).click();
        driver.findElement(By.cssSelector(".rct-icon.rct-icon-uncheck")).click();
        Boolean resultDisplayed = driver.findElement(By.cssSelector("#result")).isDisplayed();
        if (resultDisplayed == true)
            System.out.println("чекбокс нажат");
        else
            System.out.println("чекбокс не нажат");
    }


    @Test

    public void selecting() {

        WebElement selected = driver.findElement(By.cssSelector("select"));
        Select select = new Select(selected);
        select.selectByIndex(1);
        select.selectByValue("50");
        select.selectByVisibleText("100 rows");

    }

    @Test

    public void UploadDownload () throws InterruptedException{


        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");

        driver.findElement(By.xpath("//*[text() ='Upload and Download']")).click();
        Thread.sleep(3000);

        driver.findElement(By.id("downloadButton")).click();


        /* WebElement chooseFile = driver.findElement(By.cssSelector("#uploadFile"));

        chooseFile.sendKeys("C:\\Users\\evolv\\OneDrive\\Desktop\\Зубова Діана\\Maria.png"); // не забываай расширение ставить
        */
        // на элемент не надо кликать, надо просто назват его и выбрать команду Сенд ки
    }

    @Test

    public void fillForm () throws InterruptedException{
        driver.get("https://demoqa.com/automation-practice-form");
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0,500)");

        driver.findElement(By.xpath("//div[ (text () = 'Select State')]")).click();

        Thread.sleep(2000);
        driver.findElement(By.xpath("//*[text () = 'NCR']")).click();
        Thread.sleep(2000);

    }

}
