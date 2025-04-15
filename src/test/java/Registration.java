import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Registration {
    public static void main(String[] args) {
        //1. Open the browser
        WebDriver driver = utilities.HandlingBrowsers.launchBrowser("Firefox");

        //2. enter the url
        driver.get("https://janbaskdemo.com/");

        //3- Click on My Account icon
        WebElement myAccountIcon = driver.findElement(By.xpath("//i[@class ='fa fa-user']"));
        myAccountIcon.click();

        //4. Click on Register Link
        WebElement registerLink = driver.findElement(By.xpath("//a[text()='Register']"));
        registerLink.click();

        //5. Fill the Registration form
        WebElement firstNameTextBox = driver.findElement(By.id("input-firstname"));
        firstNameTextBox.sendKeys("Mabasshar");
        WebElement lastNameTextBox = driver.findElement(By.name("lastname"));
        lastNameTextBox.sendKeys("Rizvi");
        WebElement emailTextBox = driver.findElement(By.id("input-email"));
        emailTextBox.sendKeys("mabasshar.rizvi@janbask.com");
        WebElement telephoneTextBox = driver.findElement(By.name("telephone"));
        telephoneTextBox.sendKeys("2343423");
        WebElement countryDdl = driver.findElement(By.id("input-country"));
        Select country = new Select(countryDdl);
        country.selectByVisibleText("India");
        WebElement passwordTextBox = driver.findElement(By.id("input-password"));
        passwordTextBox.sendKeys("test@1234");
        WebElement cPasswordTextBox = driver.findElement(By.id("input-confirm"));
        cPasswordTextBox.sendKeys("test@1234");
        WebElement yesRadioButton = driver.findElement(By.xpath("//input[@value=1 and @name='newsletter']"));
        yesRadioButton.click();
        WebElement subscriptionDdl = driver.findElement(By.name("subscription"));
        Select subscription = new Select(subscriptionDdl);
        subscription.selectByVisibleText("Monthly");
        //6. Click on Privacy Policy checkbox
        WebElement privacyPolicyCheckbox = driver.findElement(By.xpath("//input[@type='checkbox']"));
        privacyPolicyCheckbox.click();
        //7. Click on Continue button
        WebElement continueButton = driver.findElement(By.id("submitbtn"));
        continueButton.click();
        //8. Validate Registration Status
        String expectedRegistrationSuccessTitle = "Your Account Has Been Created!";
        String actualRegistrationSuccessTitle = driver.getTitle();
        if (expectedRegistrationSuccessTitle.equals(actualRegistrationSuccessTitle)) {
            System.out.println("Registration is SuccessFul");
        } else {
            System.out.println("User with this email Id is already Registered...Please use some other email");
        }
        //9. Close the browser
        driver.close();

    }
}
