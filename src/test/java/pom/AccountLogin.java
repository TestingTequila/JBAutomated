package pom;

import commonfunctions.CommonActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AccountLogin {
    WebDriver driver;
    CommonActions ca;
    By loginButton = By.xpath("//input[@type='submit']");
    By emailTextBox = By.xpath("//input[@id='input-email']");
    By passwordTextBox = By.xpath("//input[@name='password']");

    public AccountLogin(WebDriver driver) {
        this.driver = driver;
        ca = new CommonActions(driver);
    }

    public void enterEmailId(String emailId) {
        ca.doSendKeys(emailTextBox, emailId);
    }

    public void enterPassword(String pwd) {
        ca.doSendKeys(passwordTextBox, pwd);
    }

    public MyAccount clickOnLoginButton() {
        ca.doClick(loginButton);
        return new MyAccount(driver);
    }
}
