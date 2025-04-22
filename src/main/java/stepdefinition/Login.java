package stepdefinition;

import datacenter.AppLevelData;
import datacenter.TestCasesData;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pom.AccountLogin;
import pom.MyAccount;
import pom.YourStore;

public class Login{
    WebDriver driver;
    YourStore ys;
    AccountLogin al;
    MyAccount ma;

    public Login()
    {
       driver = Hooks.driver;
    }


    @Given("enter the url")
    public void enter_the_url() {
        driver.get(AppLevelData.URL);
    }

    @Given("click on my account icon")
    public void click_on_my_account_icon() throws InterruptedException {
        ys = new YourStore(driver);
        ys.clickOnMyAccountIcon();
    }

    @Given("click on login link")
    public void click_on_login_link() {
        al = ys.clickOnLoginLink();
    }

    @When("enter correct email")
    public void enter_correct_email() {
        al.enterEmailId(TestCasesData.EMAIL_ID);
    }

    @When("enter correct password")
    public void enter_correct_password() {
        al.enterPassword(TestCasesData.PASSWORD);
    }

    @When("click on login button")
    public void click_on_login_button() {
        ma = al.clickOnLoginButton();
    }

    @Then("validate login status")
    public void validate_login_status() {
        ma.validateLoginStatus();
    }

    @When("enter correct email as {string}")
    public void enter_correct_email_as(String emailId) {
        al.enterEmailId(emailId);
    }
    @When("enter correct password as {string}")
    public void enter_correct_password_as(String password) {
        al.enterPassword(password);
    }

    @When("enter details of users")
    public void enter_details_of_users(DataTable dataTable)
    {
        al.enterEmailId(dataTable.cell(0,0));
        al.enterPassword(dataTable.cell(0,1));
        System.out.println("CITY: "+dataTable.cell(0,2));
        System.out.println("MOBILE NUMBER: "+dataTable.cell(0,3));
        System.out.println("IS MARRIED: "+dataTable.cell(0,4));

    }

    @When("enter correct {string} and correct {string}")
    public void enter_correct_and_correct(String emailId, String password) {
        al.enterEmailId(emailId);
        al.enterPassword(password);
    }
}
