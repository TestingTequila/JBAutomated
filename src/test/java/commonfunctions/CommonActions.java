package commonfunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CommonActions {

    WebDriver driver;

    public CommonActions(WebDriver driver) {
        this.driver = driver;
    }

    public void doClick(By locator) {
        getWebElement(locator).click();
    }

    public WebElement getWebElement(By locator) {
        return driver.findElement(locator);
    }

    public void doSendKeys(By locator, String text) {
        doClear(locator);
        getWebElement(locator).sendKeys(text);
    }

    public void doClear(By locator) {
        getWebElement(locator).clear();
    }

    public void validatePageTitle(String expectedPageTitle, String successMessage, String failureMessage) {
        String actualPageTitle = driver.getTitle();
        if (actualPageTitle.equals(expectedPageTitle)) {
            System.out.println(successMessage);
        } else {
            System.out.println(failureMessage);
        }
    }

    public void validatePageUrl(String urlPart, String successMessage, String failureMessage) {
        String pageUrl = driver.getCurrentUrl();
        if (pageUrl.contains(urlPart)) {
            System.out.println(successMessage);
        } else {
            System.out.println(failureMessage);
        }
    }
}
