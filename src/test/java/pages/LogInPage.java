package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LogInPage {

    private WebDriver driver;

    public LogInPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(css = "div.user-account > a")
    private WebElement goToLog;

    @FindBy(id = "_start-login")
    private WebElement logIn;

    @FindBy(name = "username")
    private WebElement userName;

    @FindBy(name = "password")
    private WebElement password;

    @FindBy(id = "_login")
    private WebElement log;



    public void goToLogIn(){
        driver.switchTo().frame("upmenu-iframe");
        goToLog.click();
    }

    public void clickLogin(){
        logIn.click();
    }


    public void userData(){
        userName.clear();
        userName.sendKeys("rafal.szostakowski+sushi@gmail.com");
    }

    public void password(){
        password.clear();

    }

    public void logClick(){
        log.click();
    }




}
