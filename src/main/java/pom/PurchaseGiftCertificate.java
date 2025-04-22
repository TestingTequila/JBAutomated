package pom;

import commonfunctions.CommonActions;
import datacenter.TestCasesData;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PurchaseGiftCertificate {
    WebDriver driver;
    CommonActions ca;
    By recipientNameTextBox = By.id("input-to-name");
    By recipientEmailId = By.id("input-to-email");

    By yourNameTextBox = By.id("input-from-name");
    By yourEmailIdTextBox = By.id("input-from-email");
    String theme = "Birthday";
    By birthdayThemeRbt = By.xpath("//label[contains(normalize-space(), '" + TestCasesData.THEME + "')]/input");
    By messageTextBox = By.id("input-message");
    By amountTextBox = By.id("input-amount");
    By nonRefundableChkBox = By.name("agree");
    By continueButton = By.xpath("//input[@type='submit']");

    public PurchaseGiftCertificate(WebDriver driver) {
        this.driver = driver;
        ca = new CommonActions(driver);
    }

    public void enterRecipientName(String recipientName) {
        ca.doSendKeys(recipientNameTextBox, recipientName);
    }

    public void enterRecipientEmailId(String recipientEmail) {
        ca.doSendKeys(recipientEmailId, recipientEmail);
    }

    public void enterYourName(String yourName) {
        ca.doSendKeys(yourNameTextBox, yourName);
    }

    public void enterYourEmailId(String yourEmail) {
        ca.doSendKeys(yourEmailIdTextBox, yourEmail);
    }

    public void selectGCTheme() {
        ca.doClick(birthdayThemeRbt);
    }

    public void enterMessage(String message) {
        ca.doSendKeys(messageTextBox, message);
    }

    public void enterAmount(String amount) {
        ca.doSendKeys(amountTextBox, amount);
    }

    public void clickOnNonRefundableChkBox() {
        ca.doClick(nonRefundableChkBox);
    }

    public void clickOnContinueButton() {
        ca.doClick(continueButton);
    }
    public  void validateStatus()
    {
        ca.validatePageUrl("success", "Successfully Bought Gift Certificate", "Failed to buy Gift Certificate ....");
    }
}
