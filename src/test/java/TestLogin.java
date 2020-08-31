import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;

public class TestLogin extends BaseTest {
    String username = "username";
    String password = "password";
    String submitBtn = "//button[text() ='Log in']";

    public void login(String userName, String passWord) {
        driver.findElement(By.id(username)).sendKeys(userName);
        driver.findElement(By.id(password)).sendKeys(passWord);
        driver.findElement(By.xpath(submitBtn)).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Test
    public void loginWithBlankField() {
        login("", "");
        Assert.assertEquals(driver.getCurrentUrl(), BaseTest.URL_login);
    }
    @Test
    public void loginWithInvalid() {
        login("azure", "123");
        String loginErrActual = driver.findElement(By.xpath("//div[contains(text(),'Invalid username or password.')]")).getText();
        String loginErrExpect = "Invalid username or password.";
        Assert.assertEquals(loginErrActual, loginErrExpect);
    }
    @Test
    public void loginByMember() {
        login("lara", "ToQuyen.95");
        Assert.assertEquals(driver.getCurrentUrl(), BaseTest.URL_dashBoard);
    }
}
