package steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.BasicPage;

public class BasicPageDef {
    BasicPage basicPage = new BasicPage();

    @When("Click {string} button")
    public void clickButton(String arg0) {
        basicPage.clickButton(arg0);
    }

    @Then("Content with {string} visible")
    public void contentWithVisible(String arg0) {
        basicPage.contentIsVisible(arg0);
    }

    @When("Click Forget Password")
    public void clickForgetPassword() {
        basicPage.clickForgetPassword();
    }
}
