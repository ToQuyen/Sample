import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class TestDemoStep2 {
	
    public static void main(String[] args) throws InterruptedException {
        /**
         * Khởi tạo trình duyệt và truy cập đến trang web cần test
         */
        System.setProperty("webdriver.chrome.driver", "driver/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://cinnamon-lab.account.box.com");
        driver.manage().window().maximize();

        // đăng nhập bằng tài khoản sai

        /**
         * Xác định vị trí của các phần tử trong trang login
         */
        
        WebElement email = driver.findElement(By.id("login-email"));
        WebElement next = driver.findElement(By.id("login-submit"));
        

        /**
         * Thực thi kịch bản test đăng nhập không thành công với thông tin email và password sai
         */
        email.sendKeys("Lara@cinnamon.is");
        next.click();
        WebElement password = driver.findElement(By.id("password-login"));
        
        WebElement login = driver.findElement(By.id("login-submit-password"));
        password.sendKeys("ToQuyen.95");
        login.click();
        
        WebElement Datapile = driver.findElement(By.linkText("Datapile"));
        Datapile.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement Uploadbutton = driver.findElement(By.id("menubutton127"));
        Uploadbutton.click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement File = driver.findElement(By.className("menu-item"));
        File.sendKeys("‪D:\\1121_2001_AC557790_上野 由華子_1.tif");
//       
//        if (driver.findElement(By.className("img-avatar")).isDisplayed()){
//            System.out.println("Đăng nhập thành công");
//        }
//        else {
//            System.out.println("Fail");
//        }
//        
//       driver.close();
    }
}
