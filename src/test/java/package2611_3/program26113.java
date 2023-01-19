package package2611_3;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Test;
import java.time.Duration;

public class program26113 {
    private WebDriver driver;

    @Before
    public void setUp() {
        WebDriver driver = new ChromeDriver();
        this.driver = driver;
        driver.manage().window().maximize();
        driver.get("https://ithillel.ua/");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    @After
    public void cleanUp() {
       driver.quit();
    }

    @Test
    public void RegisterToCourse () {

        driver.findElement(By.id ("btn-consultation-hero")).click(); // жму кнопку безкоштовна конультация


        driver.findElement(By.id("input-name-consultation")).sendKeys("Mary");
        driver.findElement(By.id ("input-email-consultation")).sendKeys("mary@gmail.com");
        driver.findElement(By.id ("input-tel-consultation")).sendKeys ("681771717"); // заполняю все форми в таблице

        driver.findElement(By.className ("listbox-btn_content")).click(); // ищу дропдаун и кликаю на него
        driver.findElement(By.xpath ("//*[@id=\"container-input-course-consultation\"]/div/ul/li[1]/span")).click(); // вибираю фронт-енд курс и кликаю (Тест проходит, но Х-пасс может поменяться)
        driver.findElement(By.className ("checkbox_checkmark")).click(); //кликаю на чекбокс, Згоден на обробку

        driver.findElement(By.xpath ("//*[@id=\"form-consultation\"]/div[1]/footer/div[2]/button")).click(); // кликаю на кнопку Залишити запит

        // етот тест проверяет форму на сайте. Заходит в Бесплатную консультаию, заполняет все формі, отмечает чекбокс и отправляет данніе
    }

}
