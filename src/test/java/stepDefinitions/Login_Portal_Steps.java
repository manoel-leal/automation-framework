package stepDefinitions;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pageObjects.Base_PO;
import pageObjects.Login_PO;


public class Login_Portal_Steps extends Base_PO {

    private WebDriver driver = getDriver();

    private Login_PO login_po;

    public Login_Portal_Steps(Login_PO login_po){
        this.login_po = login_po;
    }

    @Given("I access the Webdriver University login portal page")
    public void i_access_the_webdriver_university_login_portal_page() {
        login_po.navigateToWebdriverUniversityLoginPage();
    }

    @Given("I enter the username {word}")
    public void i_enter_the_username(String userName){
        login_po.setUsername(userName);
    }

    @Given("I enter the password {word}")
    public void i_enter_the_password(String password) {
       login_po.setPassword(password);
    }

    @When("I click on Login button")
    public void i_click_on_login_button() {
        login_po.clickOnLoginButton();
    }

    @Then("I should be presented with a alert message {}")
    public void i_should_be_presented_with_a_alert_message(String messageExpected) {
        String messageDisplay = getAlertMessage();
        Assert.assertEquals(messageDisplay, messageExpected);
    }
}
