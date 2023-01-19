package waitElementdisappear;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

import static java.lang.Thread.*;

public class program {

   public static void main (String [] args) {

       WebDriver driver = new ChromeDriver();
       WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
       

        try {
            driver.get ("http://pagination.js.org/");
            driver.manage().window().maximize();
            Thread.sleep(4000);


            List<WebElement> numbers = driver.findElements(By.xpath("//div[@class = 'data-container']/ul/li"));
            List<WebElement> pages = driver.findElements(By.xpath("//div[@class='paginationjs-pages']/ul/li"));


            String text = numbers.get(5).getText();
            System.out.println(text); // номер 6 , мы хотим посмотреть на слово, которое вписано в элемент номер 6

            pages.get(3).click();
            wait.until(ExpectedConditions.stalenessOf(numbers.get(0)));

            numbers = driver.findElements(By.xpath("//div[@class = 'data-container']/ul/li"));
            text = numbers.get(8).getText();
            
            System.out.println(text); // номер 29

            Thread.sleep(2000);

            WebElement page = driver.findElement(By.xpath("//div[@class='paginationjs-pages']/ul/li[3]"));
            page.click();
            wait.until(ExpectedConditions.stalenessOf(numbers.get(8)));

            numbers = driver.findElements(By.xpath("//div[@class = 'data-container']/ul/li"));

            // перекопируем те же данные по поиску страницы, что и выше, загрузилась новая страница, и поэтому по тому самому х-пасу будет новый элемент
            text = numbers.get(1).getText(); // перезапишем в имеющуюся ячейку тэкст новые данные - - 12
            System.out.println(text);
        }

        catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
   }
}