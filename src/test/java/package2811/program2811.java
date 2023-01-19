package package2811;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Test;
import java.time.Duration;
import org.openqa.selenium.support.ui.Select;

import static junit.framework.TestCase.assertEquals;


public class program2811 {
    private WebDriver driver;

    @Before

    public void SetUp () {
        WebDriver driver = new ChromeDriver();
        this.driver = driver;
        driver.get("https://kitchen.applitools.com/ingredients/select");

    }

    @Test

    public void NumberofOptions () {

        Select dropdown = new Select(driver.findElement(By.id("spices-select-single"))); // создаем обьект класса Селект
        // теперь дропдаун будет наделен теми качествами, какие имеет шаблон Селект


        dropdown.selectByValue("garlic");
        dropdown.selectByVisibleText("Ginger");
        dropdown.selectByIndex(1); // ето я просто учусь искать елемент дропдауна по разним опциям
        // что делать с вібратнними версиями дальще, неизвестно

        var selectedOptions = dropdown.getAllSelectedOptions();
        assertEquals(2,selectedOptions.size()); // теперь сверяемся, должна біть найдена одна опция, а сколько вібрано в реальности

    }

    @Test

    public void OptionComparison () {
        Select dropdown = new Select(driver.findElement(By.id("spices-select-single")));
        String option1 = "ginger";

        var selectedOptions = dropdown.getAllSelectedOptions();
        assertEquals(option1, selectedOptions.get(0).getAttribute("value"));

    }


}
