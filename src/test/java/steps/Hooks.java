package steps;

import io.cucumber.java.Before;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class Hooks {

    @Before
    public void openUrl() {
        open("https://lmslite47vr.demo.mirapolis.ru/mira");
        goToAutorizationPage();
    }

    public void goToAutorizationPage() {
        if ($(By.xpath("//div[@id='system-message-main-container']")).exists()) {
            $(By.xpath("//div[@class='avatar-avatar has-avatar']")).click();
            $(By.xpath("//span[text()='Выйти']")).click();
        }
        if ($(By.xpath("//*[text()='Назад к входу в систему']")).exists()) {
            $(By.xpath("//*[text()='Назад к входу в систему']")).click();
        }
    }

}