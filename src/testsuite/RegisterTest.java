package testsuite;

import browserfactory.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;

public class RegisterTest extends BaseTest {
    String baseUrl = "https://demo.nopcommerce.com/";


    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }

    @Test
    public void userShouldNavigateToComputerPageSuccessfully() {
        //click on the ‘Computers’ Tab
        driver.findElement(By.xpath("//a[text()='Computers ']")).click();

        //Verify the text ‘Computers’
        String expectedResult = "Computers";
        String actualResult = driver.findElement(By.xpath("//a[text()='Computers ']")).getText();
        Assert.assertEquals("Text not Match! ", expectedResult, actualResult);

    }

    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully() {
        //click on the ‘Electronics’ Tab
        driver.findElement(By.xpath("//a[text()='Electronics ']")).click();
        // Verify the text ‘Electronics’
        String expectedText = "Electronics";
        String actualText = driver.findElement(By.xpath("//a[text()='Electronics ']")).getText();
        Assert.assertEquals("Text not Match!", expectedText, actualText);

    }

    @Test
    public void userShouldNavigateToApparelPageSuccessfully() {
        //click on the ‘Apparel’ Tab
        driver.findElement(By.xpath("//a[text()='Apparel ']")).click();
        //Verify the text ‘apparel’
        String expectedText ="Apparel";
        String actualText = driver.findElement(By.xpath("//a[text()='Apparel ']")).getText();
        Assert.assertEquals("Text not Match!", expectedText, actualText);
    }

    @Test
    public void userShouldNavigateToDigitalDownloadsPageSuccessfully() {
        //click on the ‘Digital downloads’ Tab
        driver.findElement(By.xpath("//a[text()='Digital downloads ']")).click();
        // Verify the text ‘Digital downloads’
        String expectedText = "Digital downloads";
        String actualText = driver.findElement(By.xpath("//a[text()='Digital downloads ']")).getText();
        Assert.assertEquals("Text not Match!", expectedText, actualText);

    }

    @Test
    public void userShouldNavigateToBooksPageSuccessfully() {
        //click on the ‘Books’ Tab
        driver.findElement(By.xpath("//a[text()='Books ']")).click();
        // Verify the text ‘Digital downloads’
        String expectedText = "Books";
        String actualText = driver.findElement(By.xpath("//a[text()='Books ']")).getText();
        Assert.assertEquals("Text not Match!", expectedText, actualText);


    }
    @Test
    public void userShouldNavigateToJewelryPageSuccessfully() {
        //click on the ‘Jewelry’ Tab
        driver.findElement(By.xpath("//a[text()='Jewelry ']")).click();
        // Verify the text ‘Digital downloads’
        String expectedText = "Jewelry";
        String actualText = driver.findElement(By.xpath("//a[text()='Jewelry ']")).getText();
        Assert.assertEquals("Text not Match!", expectedText, actualText);


    }
    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfully() {
        //click on the ‘Gift Cards’ Tab
        driver.findElement(By.xpath("//a[text()='Gift Cards ']")).click();
        // Verify the text ‘Digital downloads’
        String expectedText = "Gift Cards";
        String actualText = driver.findElement(By.xpath("//a[text()='Gift Cards ']")).getText();
        Assert.assertEquals("Text not Match!", expectedText, actualText);

    }

}
