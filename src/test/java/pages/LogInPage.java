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

    @FindBy(xpath = "//span[contains(.,‘Konto‘)]")
    private WebElement account;

    @FindBy(id = "_start-login")
    private WebElement logIn;

    @FindBy(name = "username")
    private WebElement userName;



    public void goToLogIn(){
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        account.click();
    }

    public void logIn(){
        logIn.click();
    }

    public void userData(){
        userName.clear();
        userName.sendKeys("rafal.szostakowski@gmail.com");
    }


}
