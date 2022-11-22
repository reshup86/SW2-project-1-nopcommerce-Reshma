package testsuite;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utility.Utility;

public class RegisterTest extends Utility {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }

    @Test
    public void UserShouldNavigateToRegisterPageSuccessfully(){
        clickOnElement(By.linkText("Register"));
        getTextFromElement(By.xpath("//div [@class ='page-title']/h1 [text () = 'Register']"));
    }

    @Test
    public void userSholdRegisterAccountSuccessfully(){
        //Click on register link
        clickOnElement(By.linkText("Register"));

        //select gender radio button
        clickOnElement(By.id("gender-male"));
        //enter first name and last name
        sendTextToElement(By.id("FirstName"),"John");
        sendTextToElement(By.id("LastName"),"Taylor");

        //Select dd/mm/yyyy
        sendTextToElement(By.xpath("//div [@class='date-picker-wrapper']/select [@name = 'DateOfBirthDay']"),"3");
        sendTextToElement(By.xpath("//div [@class='date-picker-wrapper']/select [@name = 'DateOfBirthMonth']"),"March");
        sendTextToElement(By.xpath("//div [@class='date-picker-wrapper']/select [@name = 'DateOfBirthYear']"),"1980");

        //Enter email address
        sendTextToElement(By.id("Email"),"jahant1@gmail.com");

        //Enter password and confirm password
        sendTextToElement(By.id("Password"),"jht1234");
        sendTextToElement(By.id("ConfirmPassword"),"jht1234");

        //click on register button
        clickOnElement(By.id("register-button"));
        String expectedText = "Your registration completed";
        String actualText = getTextFromElement(By.xpath("//div [text() = 'Your registration completed']"));
        Assert.assertEquals("Your registration is not completed",expectedText,actualText);
    }

    @After
    public void tearDown(){
     closeBrowser();
    }
}
