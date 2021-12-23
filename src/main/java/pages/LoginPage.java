package pages;

import com.codeborne.selenide.SelenideElement;
import com.codeborne.selenide.WebDriverRunner;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import static com.codeborne.selenide.Selenide.$;

public class LoginPage {
    private SelenideElement loginInput = $(By.xpath("//input[@name='user']"));
    private SelenideElement passwordInput = $(By.xpath("//input[@name='password']"));

    public void inputLogin(String text) {
        this.loginInput.val(text);
    }

    public void inputPassword(String text) {
        this.passwordInput.val(text);
    }

    public void prompt(String expectedDialogText) {
        WebDriver driver = WebDriverRunner.getWebDriver();
        Alert alert = driver.switchTo().alert();
        String actualDialogText = alert.getText();
        alert.accept();
        Assert.assertEquals(expectedDialogText, actualDialogText);
    }
}
