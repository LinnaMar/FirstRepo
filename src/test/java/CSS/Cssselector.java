package CSS;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cssselector {

    private WebDriver driver;

    @Before
    public void SetUp () throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        this.driver = driver;
        driver.get ("https://ithillel.ua/");
        driver.manage().window().maximize();
        Thread.sleep(7000);
    }

    @Test

    public void testSelectors  () throws InterruptedException {

        WebElement btnConsult = driver.findElement(By.id("btn-consultation-hero"));
        System.out.println(btnConsult.getText());

        Thread.sleep(7000);

        WebElement school = driver.findElement(By.xpath("//li[@class ='site-nav-menu_item -submenu'] [1]"));
        System.out.println(school.getText());

        WebElement onlineBesida = driver.findElement(By.xpath("//*[text() = 'Онлайн співбесіда на позицію верстальника']"));
        System.out.println(onlineBesida.getText());
    }


    @Test

    public void findingwithcss ()  {

    WebElement btnConsultation = driver.findElement(By.cssSelector("#btn-consultation-hero")); // так оформляется айди #
    System.out.println(btnConsultation.getText());

    WebElement btnodesa = driver.findElement(By.cssSelector("a[data-city-id= 'od']"));
    // a class= "header-bar-link -city" href="https://odessa.ithillel.ua" data-city-id = "od" Я взяла один из атрибутов, сперва пишем тег, потом атрибут и потом его имя
        System.out.println(btnodesa.getText());

    WebElement rusbtn = driver.findElement(By.cssSelector("a[data-lang-switcher='ru']"));
    // точно также сделала поиск по атрибуту и его значению. ctrl+F  будет вывод инпута, где можно проверить, найден ли эл-т
        System.out.println(rusbtn.getText());

       /* WebElement pytannya = driver.findElement(By.cssSelector(".helpcrunch-widget-type-icon-text(2)"));
        System.out.println(pytannya.getText());  с этом эл-том беда, не находит */

    }

}
