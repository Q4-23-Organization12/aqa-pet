import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SecondTest {

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

        // Находим первый чекбокс с помощью XPath (неактивированный)
        WebElement checkbox1 = driver.findElement(By.xpath("//form[@id='checkboxes']/input[1]"));
        // Находим второй чекбокс с помощью XPath (активированный)
        WebElement checkbox2 = driver.findElement(By.xpath("//form[@id='checkboxes']/input[2]"));

        // Проверяем, если первый чекбокс не выбран, то выбираем его
        if (!checkbox1.isSelected()) {
            checkbox1.click();
        } else {
        }

        Thread.sleep(3000);

        // Проверяем, если второй чекбокс выбран, то снимаем выделение
        if (checkbox2.isSelected()) {
            checkbox2.click();

        } else {
        }

        Thread.sleep(3000);
    }

    @AfterEach
    public void tearDown() {
        // Закрываем браузер после выполнения теста
        driver.quit();
    }
}