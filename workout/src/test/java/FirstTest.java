import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {

    private WebDriver driver;
    private final String URL = "https://the-internet.herokuapp.com/checkboxes";

    @BeforeEach
    public void setUp() {
        // Указываем путь к драйверу Chrome
        System.setProperty("selenium-chrome-driver-3.141.59", "C:\\Users\\Andrey Grynko\\.m2\\repository\\org\\seleniumhq\\selenium\\selenium-chrome-driver\\3.141.59");
        // Создаем экземпляр WebDriver
        driver = new ChromeDriver();
    }

    @Test
    public void testCheckbox() throws InterruptedException {
        // Открываем веб-страницу с чекбоксами
        driver.get(URL);

        Thread.sleep(3000);

        // Находим чекбокс с помощью XPath (в данном случае, это первый чекбокс)

        WebElement checkbox = driver.findElement(By.xpath("//input[@type='checkbox']"));

        if (checkbox.isSelected()) ;
        {
            checkbox.click();

        }
    }
}
