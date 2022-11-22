package testsuite;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utility.Utility;

public class LoginTest extends Utility {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToLoginPageSuccessfully() {
        clickOnElement(By.linkText("Log in"));

        String expectedMessage = "Welcome, Please Sign In!";
        WebElement actualTextMessageElement = driver.findElement(By.xpath("//div[@class = 'page-title']/h1 [text() = 'Welcome, Please Sign In!']"));
        String actualMessge = actualTextMessageElement.getText();

        Assert.assertEquals(expectedMessage, actualMessge);
    }

    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials() {
        //click on login link
        clickOnElement(By.linkText("Log in"));

        //enter valid credentials
        sendTextToElement(By.id("Email"), "test1234@gmail.com");
        sendTextToElement(By.name("Password"), "test1234");

        //click on login button
        clickOnElement(By.xpath("//button[@class = 'button-1 login-button']"));

        //verify 'Log out' text
        String expectedLogoutLink = "Log out";
        String actualLogoutLink = getTextFromElement(By.xpath("//a[@class = 'ico-logout']"));
        Assert.assertEquals("Log out link is not displayed",expectedLogoutLink,actualLogoutLink);
    }

    @Test
    public void verifyTheErrorMessage() {
        //click on login link
        clickOnElement(By.linkText("Log in"));

        //enter Invalid credentials
        sendTextToElement(By.id("Email"), "test234@gmail.com");
        sendTextToElement(By.name("Password"), "test134");

        //click on login button
        clickOnElement(By.xpath("//button[@class = 'button-1 login-button']"));

        //verify the error message
        getTextFromElement(By.xpath("//div [@class = 'message-error validation-summary-errors']"));
    }

    @After
    public void tearDown() {
         closeBrowser();
    }

}
