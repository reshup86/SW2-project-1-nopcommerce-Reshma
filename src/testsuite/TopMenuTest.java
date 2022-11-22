package testsuite;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import utility.Utility;

public class TopMenuTest extends Utility {
    String baseUrl = "https://demo.nopcommerce.com/";

    @Before
    public void setUp(){
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToComputerPageSuccessfully(){
        //click on computer tab
        clickOnElement(By.linkText("Computers"));
        //verify the header text 'Computers'
        String expectedText = "Computers";
        String actualText = getTextFromElement(By.xpath("//div [@class = 'page-title']/h1 [text() = 'Computers']"));
        Assert.assertEquals("Computers text is not displayed",expectedText,actualText);
    }

    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully(){
        //click on electronics tab
        clickOnElement(By.linkText("Electronics"));
        //verify the header text 'Electronics'
        String expectedText = "Electronics";
        String actualText = getTextFromElement(By.xpath("//div [@class = 'page-title']/h1 [text() = 'Electronics']"));
        Assert.assertEquals("Electronics text is not displayed",expectedText,actualText);
    }
    @Test
    public void userShouldNavigateToApparelPageSuccessfull(){
        //click on Apparel tab
        clickOnElement(By.linkText("Apparel"));
        //verify header text 'Apparel'
        String expectedText = "Apparel";
        String actualText = getTextFromElement(By.xpath("//div [@class = 'page-title']/h1 [text() = 'Apparel']"));
        Assert.assertEquals("Apparel text is not displayed",expectedText,actualText);
    }
    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfull(){
        //click on 'digital downloads' tab
        clickOnElement(By.linkText("Digital downloads"));
        //verify header text 'digital downloads'
        String expectedText = "Digital downloads";
        String actualText = getTextFromElement(By.xpath("//div [@class = 'page-title']/h1 [text() = 'Digital downloads']"));
        Assert.assertEquals("Digital downloads text is not displayed",expectedText,actualText);
    }
    @Test
    public void userShouldNavigateToBooksPageSuccessfully(){
        //click on 'books' tab
        clickOnElement(By.linkText("Books"));
        //verify header text 'Books'
        String expectedText = "Books";
        String actualText = getTextFromElement(By.xpath("//div [@class = 'page-title']/h1 [text() = 'Books']"));
        Assert.assertEquals("Books text is not displayed",expectedText,actualText);
    }
    @Test
    public void userShouldNavigateToJewelryPageSuccessfully(){
        //click on jewelry tab
        clickOnElement(By.linkText("Jewelry"));
        //verify header text 'jewelry'
        String expectedText = "Jewelry";
        String actualText = getTextFromElement(By.xpath("//div [@class = 'page-title']/h1 [text() = 'Jewelry']"));
        Assert.assertEquals("Jewelry text is not displayed",expectedText,actualText);
    }
    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfull(){
        //click on giftcards tab
        clickOnElement(By.linkText("Gift Cards"));
        //verify header text 'gift cards'
        String expectedText = "Gift Cards";
        String actualText = getTextFromElement(By.xpath("//div [@class = 'page-title']/h1 [text() = 'Gift Cards']"));
        Assert.assertEquals("Gift Cards text is not displayed",expectedText,actualText);
    }

    @After
    public void tearDown(){
        closeBrowser();
    }
}
