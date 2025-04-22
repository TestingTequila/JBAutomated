package pom;

import commonfunctions.CommonActions;
import org.openqa.selenium.WebDriver;

public class MyAccount {
    WebDriver driver;
    CommonActions ca;

    public MyAccount(WebDriver driver) {
        this.driver = driver;
        ca = new CommonActions(driver);
    }
    public void validateLoginStatus() {
        ca.validatePageTitle("My Account", "Login-Successful", "Login-Failed");
    }
}
