package org.example.testing;

import org.example.demoqa.FormaPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FormaTest extends Basic {
    public static WebDriver driver;

    @BeforeClass
    public void beforeClass(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\PC\\Desktop\\chromedriver-win64\\chromedriver.exe");
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        FormaTest.driver = driver;
    }

    @Test
    public void FormaTngTest(){
        driver.get("https://demoqa.com/automation-practice-form");
        FormaPage formaPage = new FormaPage(driver);
        formaPage.setFirstName(FIRST_NAME);
    }

    @AfterClass
    public void  close(){
        driver.quit();
    }
}

