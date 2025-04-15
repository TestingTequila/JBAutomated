import commonfunctions.CommonActions;
import datacenter.AppLevelData;
import org.openqa.selenium.WebDriver;
import pom.PurchaseGiftCertificate;
import pom.YourStore;
public class GiftCertificates {
    public static void main(String[] args) {
        CommonActions ca;
        //1. Open the browser
        WebDriver driver = utilities.HandlingBrowsers.launchBrowser(AppLevelData.BROWSER_NAME);

        //2. Enter the url
        driver.get(AppLevelData.URL);

        //2. Click on gift Certificates Tab
        YourStore ys = new YourStore(driver);
        ys.clickOnGiftCertificatesTab();

        //3. Fill the form
        PurchaseGiftCertificate pgc = new PurchaseGiftCertificate(driver);
        pgc.enterRecipientName("Ashish");
        pgc.enterRecipientEmailId("ashish.mishra.sse@gmail.com");
        pgc.enterYourName("Zahid");
        pgc.enterYourEmailId("zahid@gmail.com");
        pgc.selectGCTheme();
        pgc.enterMessage("Happy Birthday Dear Friend...");
        pgc.enterAmount("1000");
        //4. Click on non-refundable checkbox
        pgc.clickOnNonRefundableChkBox();
        //5. Click on Continue button
        pgc.clickOnContinueButton();
        //6. Validate purchase status
        pgc.validateStatus();

    }

}

//Remember: Logic Page should create objects of Pages under Page Object Model only, if you have to create object of some
//          other class, Framework designing isn't good.