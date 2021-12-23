package pages;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class BasicPage {

    public void clickButton(String text) {
        $(By.xpath("//*[text()='" + text + "']")).click();
    }

    public void clickForgetPassword() {
        $(By.xpath("//table[@class='links-container']")).click();
    }

    public void contentIsVisible(String text) {
        $(By.xpath("//*[text()='" + text + "']")).shouldBe(Condition.visible);
    }

}
