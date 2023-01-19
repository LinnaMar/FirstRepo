package package2611_2;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class package26112 {
    private WebDriver driver;


     @Before
             public void setUp() {
         WebDriver driver = new ChromeDriver();
         this.driver = driver;
         driver.get("https://ithillel.ua/");
     }
     @After
             public void clenUp() {
         driver.quit();
     }

     @Test
        public void SomeTest ()
     {
         assertEquals ("Комп'ютерна школа Hillel у Києві: Курси IT-технологій!!!", driver.getTitle()); // expected то что хотим видеть и что правильно, actual то что отдаст драйвер
    }
}
