package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactUs_PO extends Base_PO{

    private @FindBy(xpath = "//input[@name='first_name']")
    WebElement firstNameInputField;

    private @FindBy(xpath = "//input[@name='last_name']")
    WebElement lastNameInputField;

    private @FindBy(xpath = "//input[@name='email']")
    WebElement emailInputField;

    private @FindBy(xpath = "//textarea[@name='message']")
    WebElement messageTextArea;

    private @FindBy(xpath = "//input[@value='SUBMIT']")
    WebElement submitButton;

    private @FindBy(xpath = "//div[@id='contact_reply']/h1")
    WebElement successMessage;

    public ContactUs_PO(){
        super();
    }

    public void navigateToContactUsPage(){
        navigateToUrl("https://webdriveruniversity.com/Contact-Us/contactus.html");
    }

    public void setFirstName(String firstName){
        sendKeys(firstNameInputField, firstName);
    }

    public void setLastName(String lastName){
        sendKeys(lastNameInputField, lastName);
    }

    public void setEmail(String email){
        sendKeys(emailInputField, email);
    }

    public void setMessage(String message){
        sendKeys(messageTextArea, message);
    }

    public void clickSubmit(){
        click(submitButton);
    }

    public String getSuccessMessage(){
        return getText(successMessage);
    }
}
