package steps;

import config.UserConfig;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPage;

public class LoginPageDef {
    LoginPage loginPage = new LoginPage();

    @When("Input login")
    public void inputLogin() {
        loginPage.inputLogin(UserConfig.USER_LOGIN);
    }

    @When("Input password")
    public void inputPassword() {
        loginPage.inputPassword(UserConfig.USER_PASSWORD);
    }

    @Then("Alert have text {string}")
    public void alertHaveText(String arg0) {
        loginPage.prompt(arg0);
    }

    @When("Input incorrect login {string}")
    public void inputIncorrectLogin(String arg0) {
        loginPage.inputLogin(arg0);
    }

    @When("Input incorrect password {string}")
    public void inputIncorrectPassword(String arg0){
        loginPage.inputPassword(arg0);
    }
}