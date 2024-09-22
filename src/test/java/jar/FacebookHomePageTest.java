package jar;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class FacebookHomePageTest {

    private WebDriver driver;
    private String baseUrl;

    @Before
    public void setUp() {
        // Set the path to your WebDriver (example: ChromeDriver)
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Administrator\\Desktop\\Selenium_Code\\Selenium-Code\\Drivers\\chromedriver-win64\\chromedriver.exe");
        // Initialize WebDriver and navigate to Facebook homepage
        driver = new ChromeDriver();
        baseUrl = "https://www.facebook.com";
        driver.get(baseUrl);
    }

    @Test
    public void testHomePageTitle() {
        // Check that the page title is correct
        String expectedTitle = "Log into Facebook";
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
    //F-Name - Aamir
    //L-Name - Patel
    //Email - aamirp480@gmail.com
    //pass - Bnm1234@
    //DOB - Sep 22 1980
    //Gender - Male
    @Test
    public void testLoginFunctionality() {
    	driver.findElement(By.id("email")).isDisplayed();
    	WebElement email = driver.findElement(By.id("email"));
    	email.sendKeys("aamirp480@gmail.com");
    	driver.findElement(By.id("pass")).sendKeys("Bnm1234@");
    	driver.findElement(By.id("loginbutton")).click();
    	try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	driver.findElement(By.xpath("//*[text()='Upload a verification selfie']"));
    	boolean verification = driver.findElement(By.xpath("//*[text()='Upload a verification selfie']")).isDisplayed();
    	
        assertTrue(verification);

    }
    @org.junit.After
    public void tearDown() {
        // Close the browser after tests are done
        if (driver != null) {
            driver.quit();
        }
    }
}
