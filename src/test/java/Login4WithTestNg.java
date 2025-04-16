import datacenter.AppLevelData;
import datacenter.TestCasesData;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pom.AccountLogin;
import pom.MyAccount;
import pom.YourStore;

public class Login4WithTestNg {

    WebDriver driver;

    @BeforeMethod
    public void launchBrowser() {
        //1- Open the browser
        driver = utilities.HandlingBrowsers.launchBrowser(AppLevelData.BROWSER_NAME);

        //2- Enter the url
        driver.get(AppLevelData.URL);
    }

    @Test
    public void login1() throws InterruptedException {
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
    }

    @Test
    public void login2() throws InterruptedException {
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
    }

    @Test
    public void login3() throws InterruptedException {
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
    }


    @AfterMethod
    public void closeBrowser() {
        //9- Close the browser
        driver.close();
    }


}

