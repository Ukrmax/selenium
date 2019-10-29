package Tests;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Tests {
    WebDriver driver;

    @BeforeEach
    public void setUp () {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Max\\Documents\\Webdriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }


    @Test
    public void firstHomeWork() {
        driver.get("https://generator-online.com/numbers/");
        assertEquals(driver.getTitle(), "Генератор случайных чисел онлайн | Рандом чисел");
        WebElement firstRndNum = driver.findElement(By.id("numresult"));
        driver.findElement(By.id("genbutton")).click();
        WebElement secondRndNum = driver.findElement(By.id("numresult"));

        if (firstRndNum == secondRndNum) {
            System.out.println("Numbers are EQUAL!!!");
        } else {
            System.out.println("Numbers are not EQUAL!!!");
        }

    }
}
