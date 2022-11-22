package utility;

import browserfactory.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Utility extends BaseTest {
        public void clickOnElement(By by){
            WebElement loginElement = driver.findElement(by);
            loginElement.click();
        }
        public void sendTextToElement (By by, String text){
            WebElement emailField = driver.findElement(by);
            emailField.sendKeys(text);
        }
        public String getTextFromElement (By by){
            WebElement actualTextMessageElement = driver.findElement(by);
            return actualTextMessageElement.getText();
        }
}
