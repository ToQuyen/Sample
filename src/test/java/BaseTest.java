import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;


public class BaseTest {
    public static WebDriver driver;
    public static final String URL_login = "https://athena-staging.cinnamon.is/login";
    public static final String URL_dashBoard = "https://athena-staging.cinnamon.is/data?offset=0&limit=100&sort_by=date_modified&order=DESC";

    @Before
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(URL_login);
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @After
    public void tearDown() {
        driver.quit();
    }
}
