import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class ValidInvalidLogin {



    private WebDriver driver;
    private final String URL = "https://the-internet.herokuapp.com/login";
    private final String USERNAME = "tomsmith";
    private final String PASSWORD = "SuperSecretPassword!";

    @BeforeEach
    public void setUp() {
        System.setProperty("selenium-chrome-driver-3.141.59", "C:\\Users\\Andrey Grynko\\.m2\\repository\\org\\seleniumhq\\selenium\\selenium-chrome-driver\\3.141.59");
        driver = new ChromeDriver();
    }

    @Test
    public void testEmptyLoginFields() throws InterruptedException {

        driver.get(URL);

        Thread.sleep(3000);

        WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));

        loginButton.click();

        assertTrue(driver.findElement(By.id("flash")).getText().contains("Your username is invalid!"));

        Thread.sleep(3000);
    }

    @AfterEach
    public void tearDown() {

        driver.quit();
    }

    @Test
    public void testSuccessfulLogin() throws InterruptedException {

        driver.get(URL);

        Thread.sleep(3000);


        WebElement usernameInput = driver.findElement(By.xpath("//input[@id='username']"));

        WebElement passwordInput = driver.findElement(By.xpath("//input[@id='password']"));

        WebElement loginButton = driver.findElement(By.xpath("//button[@type='submit']"));

        usernameInput.sendKeys(USERNAME);
        passwordInput.sendKeys(PASSWORD);

        Thread.sleep(3000);

        loginButton.click();

        assertTrue(driver.findElement(By.id("flash")).getText().contains("You logged into a secure area!"));

        Thread.sleep(3000);
    }
    @AfterEach
    public void setDown() {

        driver.quit();
    }
}