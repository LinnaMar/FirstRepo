package PageFac;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import static junit.framework.TestCase.assertEquals;

public class programm {

    private WebDriver driver;


    @Before
    public void setUp() {
        WebDriver driver = new ChromeDriver();
        this.driver = driver;
        driver.manage().window().maximize();
        driver.get ("https://ithillel.ua/");

}

    @Test

    public void getbtnConsultationText () {
         PageFac pagefac = PageFactory.initElements(driver, PageFac.class);

        System.out.println(pagefac.btnconsultation.getText() + " this is consultation");

    }

    @Test

    public void ComparingCorrectTitle () {

        assertEquals ("Комп'ютерна школа Hillel у Києві: Курси IT-технологій", driver.getTitle());
        System.out.println("title is correct");

    }
}
