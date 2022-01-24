package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import pageObjects.Base_PO;
import pageObjects.ContactUs_PO;


public class Contact_Us_Steps extends Base_PO {

    private WebDriver driver = getDriver();

    private ContactUs_PO contactUs_po;

    public Contact_Us_Steps(ContactUs_PO contactUs_po){
        this.contactUs_po = contactUs_po;
    }

    @Given("I access the Webdriver University contact us page")
    public void i_access_the_webdriver_university_contact_us_page() {
        contactUs_po.navigateToContactUsPage();
    }
    @When("I enter a unique first name")
    public void i_enter_a_unique_first_name() {
        contactUs_po.setFirstName("AutoFN" + generateRandomNumber(10));
    }
    @And("I enter a unique last name")
    public void i_enter_a_unique_last_name() {
        contactUs_po.setLastName("AutoLN" + generateRandomNumber(10));
    }
    @And("I enter a unique email address")
    public void i_enter_a_unique_email_address() {
        contactUs_po.setEmail("AutoEmail" + generateRandomNumber(10) + "@mail.com");
    }
    @And("I enter a unique comment")
    public void i_enter_a_unique_comment() {
        contactUs_po.setMessage("AutoMessage" + generateRandomString(100));
    }

    @When("I enter a specific first name {word}")
    public void i_enter_a_specific_first_name_joe(String firstName) {
        contactUs_po.setFirstName(firstName);
    }
    @When("I enter a specific last name {word}")
    public void i_enter_a_specific_last_name_blogs(String lastName) {
        contactUs_po.setLastName(lastName);
    }
    @When("I enter a specific email address {word}")
    public void i_enter_a_specific_email_address_joe_blogs123_mail_com(String email) {
        contactUs_po.setEmail(email);
    }
    @When("I enter a specific comment {string}")
    public void i_enter_a_specific_comment(String message) {
        contactUs_po.setMessage(message);
    }

    @And("I click on the subimit button")
    public void i_click_on_the_subimit_button() {
        contactUs_po.clickSubmit();
    }

    @Then("I should be presented with a successful contact us submission message")
    public void i_should_be_presented_with_a_successful_contact_us_submission_message() {
        Assert.assertEquals(contactUs_po.getSuccessMessage(), "Thank You for your Message!");

    }

}
