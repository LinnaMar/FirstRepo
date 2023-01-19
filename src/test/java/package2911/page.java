package package2911;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Test;
import java.time.Duration;

public class page {
    private WebDriver driver;

    page (WebDriver driver) {
        this.driver = driver;
    }

        void clickFreeConsult() {

        driver.findElement(By.id("btn-consultation-hero")).click(); // жму кнопку безкоштовна конультация
    }

        void enterUsername () {
        driver.findElement(By.id("input-name-consultation")).sendKeys("Mary");
    }

        void enterMail (){
        driver.findElement(By.id ("input-email-consultation")).sendKeys("mary@gmail.com");
    }

        void enterPhone (){
            driver.findElement(By.id  ("input-tel-consultation")).sendKeys ("681771717");
    }

        void clickDropdown() {
        driver.findElement(By.xpath ("//*[@id=\"listbox-btn-input-course-consultation\"]/span")).click();
                //className ("listbox-btn_content")).click();
    }

        void clickCheckbox() {
        driver.findElement(By.xpath ("//*[@id=\"container-input-course-consultation\"]/div/ul/li[1]/span")).click();
    }

        void clickFrontendCourse() {
        driver.findElement(By.className ("checkbox_checkmark")).click();
    }

}
