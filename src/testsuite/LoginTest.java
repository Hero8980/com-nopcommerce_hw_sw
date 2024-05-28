package testsuits;

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoginTest extends BaseTest {

    String baseUrl = "https://demo.nopcommerce.com/";


    @Before
    public void setUp() {
        openBrowser(baseUrl);
    }
    /*
       userShouldNavigateToLoginPageSuccessfully *
       click on the ‘Login’ link
       * Verify the text ‘Welcome, Please Sign
       In!’
        */
    @Test
    public void userShouldNavigateToLoginPageSuccessfully() {
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();
        String expectedText = "Welcome, Please Sign In!";
        WebElement welcomeTextElement = driver.findElement((By.xpath("//h1")));
        String actualText = welcomeTextElement.getText(); // store element
        Assert.assertEquals("Not redirected to login page", expectedText, actualText);

    }

    /*
    userShouldLoginSuccessfullyWithValidCredentials
* click on the ‘Login’ link
* Enter valid username
* Enter valid password
* Click on ‘LOGIN’ button
* Verify the ‘Log out’ text is display
     */
    @Test
    public void userShouldLoginSuccessfullyWithValidCredentials(){
        WebElement loginLink = driver.findElement(By.linkText("Log in"));
        loginLink.click();
        WebElement emailField = driver.findElement(By.id("Email"));
        emailField.sendKeys("abc123@gmail.com");
        // find the password field and type the password into password field
        driver.findElement(By.name("Password")).sendKeys("abc123");
        //Find Login  element and click
        driver.findElement(By.xpath("//button[text()='Log in']")).click();
        String expectedMessage = "Log out";
        String actualMessage = driver.findElement(By.xpath("//a[text()= 'Log out']")).getText();
        Assert.assertEquals("User is not login successfully",expectedMessage,actualMessage);
    }

    @Test
    public void verifyErrorMessageWithInvalidCredentials() {
        // Find the login link and click on login link element
        WebElement loginlink = driver.findElement(By.linkText("Log in"));
        loginlink.click();

        //find the email field Element and Type the Email address to email Field
        WebElement emailField = driver.findElement(By.id("Email"));
        emailField.sendKeys("Abd@gmail.com");

        driver.findElement(By.name("Password")).sendKeys("Abd123");
//find login btn element and click
        driver.findElement(By.xpath("//button[text() = 'Log in']")).click();

        String expectedErrorMessage = "Login was unsuccessful. Please correct the errors and try again.\n" +
                "No customer account found";
        String actualErrorMessage = driver.findElement(By.xpath("//div[@class='message-error validation-summary-errors']")).getText();
        Assert.assertEquals("Error message not display", expectedErrorMessage, actualErrorMessage);

    }

    @After
    public void tearDown() {
        // closeBrowser();
    }
}


