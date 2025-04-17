package tdd;

import org.testng.Assert;
import org.testng.annotations.*;

public class TestNgAnnotations {

    @BeforeSuite
    public void createDb() {
        System.out.println("@BeforeSuite: This will create the database...");
    }

    @AfterSuite
    public void deleteDb() {
        System.out.println("@AfterSuite: This will delete the database...");
    }

    @BeforeTest
    public void connectToDb() {
        System.out.println("@BeforeTest: This will connect to database...");
    }

    @AfterTest
    public void disconnectToDb() {
        System.out.println("@AfterTest: This will connect to database...");
    }

    @BeforeClass
    public void launchBrowser() {
        System.out.println("@BeforeClass: This will launch the browser...");
    }

    @AfterClass
    public void closeBrowser() {
        System.out.println("@AfterClass: This will close the browser...");
    }

    @BeforeMethod
    public void enterUrl() {
        System.out.println("@BeforeMethod: This will enter the url into the browser....");
    }

    @Test
    public void login() {
        System.out.println("@Test: This is Login Test Case");
        Assert.assertTrue(true);
    }

    @Test
    public void registration() {
        System.out.println("@Test: This is registration Test Case");

    }

    @Test
    public void product() {
        System.out.println("@Test: This is product Test Case");
    }

    @AfterMethod
    public void removeUrl() {
        System.out.println("@AfterMethod: This will remove the url");
    }

    @Test(dataProvider = "getData")
    public void login(String userName, String password) {
        System.out.println("@Test: This is Login Test Case -> " + "User: " + userName + " ,Password: " + password);
    }

    @DataProvider
    public Object[][] getData()
    {
        Object[][] data = {{"Jason", "Test@1234"}, {"Kerry", "test@4321"}, {"John", "test@9876"}};
        return data;
    }


}
