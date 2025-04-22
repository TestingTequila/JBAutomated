package stepdefinition;

import datacenter.AppLevelData;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;

public class Hooks
{
    static WebDriver driver;
    @Before
    public  void setUp()
    {
        driver = utilities.HandlingBrowsers.launchBrowser(AppLevelData.BROWSER_NAME);
        Login login = new Login();
    }

    @After
    public  void tearDown()
    {
       driver.close();
    }
}
