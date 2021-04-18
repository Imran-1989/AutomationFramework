import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class NewTc {
    WebDriver driver;

    @AfterTest
    public void tearDown() {
        // driver.close();
        //  driver.quit();
    }

    @BeforeTest
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "drivers/chrome/chromedriver.exe");
        driver = new ChromeDriver();


    }
}