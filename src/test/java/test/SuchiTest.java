package test;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pages.LogInPage;

import java.util.concurrent.TimeUnit;

public class SuchiTest {

    private static WebDriver driver;

    private String web = "http://sushikoi.pl/zamow-i-zaplac-online/";


    @Before
    public void SetUp() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");

        driver = new ChromeDriver();

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.get(web);
    }

    @Test
    public void suchiOrder(){

        LogInPage logIn = new LogInPage(this.driver);


        logIn.goToLogIn();
        logIn.clickLogin();
        logIn.userData();
        logIn.password();
        logIn.logClick();


    }


}
