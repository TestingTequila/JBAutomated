package pom;

import commonfunctions.CommonActions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class YourStore {

    WebDriver driver;
    CommonActions ca;

    public YourStore(WebDriver driver) {
        this.driver = driver;
        ca = new CommonActions(driver);
    }

    By myAccountIcon = By.xpath("//i[@class ='fa fa-user']");
    By loginLink = By.xpath("//a[text()='Login']");
    By giftCertificates = By.xpath("//ul[@class='main-navigation']/li/a[text()='Gift Certificates']");

    public void clickOnMyAccountIcon() throws InterruptedException {
        ca.doClick(myAccountIcon);
        Thread.sleep(2000);
    }

    public AccountLogin clickOnLoginLink() {
        ca.doClick(loginLink);
        return new AccountLogin(driver);
    }

    public void clickOnGiftCertificatesTab() {
        ca.doClick(giftCertificates);
    }
}
