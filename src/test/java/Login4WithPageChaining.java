import datacenter.AppLevelData;
import datacenter.TestCasesData;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import pom.AccountLogin;
import pom.MyAccount;
import pom.YourStore;

public class Login4WithPageChaining {

    public static void main(String[] args) throws InterruptedException {
        //1- Open the browser
        WebDriver driver = utilities.HandlingBrowsers.launchBrowser(AppLevelData.BROWSER_NAME);

        //2- Enter the url
        driver.get(AppLevelData.URL);

        //3- Click on My Account icon
        YourStore ys = new YourStore(driver);
        ys.clickOnMyAccountIcon();

        //4- Click on login Link
        AccountLogin al = ys.clickOnLoginLink();

        //5- Enter correct email
        al.enterEmailId(TestCasesData.EMAIL_ID);

        //6- Enter correct password
        al.enterPassword(TestCasesData.PASSWORD);

        //7- Click on Login button
        MyAccount ma = al.clickOnLoginButton();

        //8- Validate login status
        ma.validateLoginStatus();

        //9- Close the browser
        driver.close();

    }

}
