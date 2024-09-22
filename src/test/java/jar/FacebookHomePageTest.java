package jar;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class FacebookHomePageTest {

    private WebDriver driver;
    private String baseUrl;

    @Before
    public void setUp() {
        // Set the path to your WebDriver (example: ChromeDriver)
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\home\\eclipse-workspace\\my-assignment\\Drivers\\chromedriver-win64\\chromedriver.exe");
        // Initialize WebDriver and navigate to Facebook homepage
        driver = new ChromeDriver();
        baseUrl = "https://www.facebook.com";
        driver.get(baseUrl);
    }

    @Test
    public void testHomePageTitle() {
        // Check that the page title is correct
        String expectedTitle = "Facebook - log in or sign up";
        String actualTitle = driver.getTitle();
        assertEquals(expectedTitle, actualTitle);
    }

    @Test
    public void testLoginButtonPresence() {
        // Check that the login button is present on the page
        boolean isLoginButtonDisplayed = driver.findElement(By.name("login")).isDisplayed();
        assertTrue(isLoginButtonDisplayed);
    }

    @Test
    public void testCreateNewAccountLink() {
        // Check that the "Create New Account" link is present
        boolean isCreateNewAccountLinkDisplayed = driver.findElement(By.linkText("Create new account")).isDisplayed();
        assertTrue(isCreateNewAccountLinkDisplayed);
    }

    @Test
    public void testLanguageOptions() {
        // Check that multiple language options are available at the bottom
        boolean isLanguageSelectorDisplayed = driver.findElement(By.id("pageFooterChildren")).isDisplayed();
        assertTrue(isLanguageSelectorDisplayed);
    }

    // You can add more tests for various elements

    @org.junit.After
    public void tearDown() {
        // Close the browser after tests are done
        if (driver != null) {
            driver.quit();
        }
    }
}
