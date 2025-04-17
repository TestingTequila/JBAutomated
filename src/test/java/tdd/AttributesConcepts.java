package tdd;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class AttributesConcepts
{
    @Test(priority = 2, dependsOnMethods = "registration", alwaysRun = true, groups = "smoke")
    public  void login()
    {
        System.out.println("This is login test case");
    }

    @Test(groups = "smoke")
    public  void registration()
    {
        System.out.println("This is registration test case");
        Assert.fail();
    }
    @Test(priority = 4, invocationCount = 10, groups = "sanity", timeOut = 1)
    public  void contactUs()
    {
        System.out.println("This is contactUs test case");
    }

    @Test(priority = 3, groups = "sanity", dependsOnGroups = "smoke")
    public  void product()
    {
        System.out.println("This is product test case");
    }

    @Test(priority = -3, enabled = false, groups = "regression")
    public  void payment()
    {
        System.out.println("This is product test case");
    }


    @Test @Parameters({"url", "browserType"})
    public  void banking(String url, String browserType)
    {
        System.out.println("BROWSER : " + browserType);
        System.out.println("BANK URL : " + url);

    }
}


// The default order of execution of Test Cases in TestNG is alphabetical order
//login [2]
//registration
//contactUs[4]
//product[3]
//payment[-3]

//Negative--> Default[No Priority] ---> Priority

//payment[-3]
//registration
//login [2]
//product[3]
//contactUs[4]