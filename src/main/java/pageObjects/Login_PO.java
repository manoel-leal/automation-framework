package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Login_PO extends Base_PO {

    private @FindBy(id = "text")
    WebElement usernameTextField;

    private @FindBy(id = "password")
    WebElement passwordTextField;

    private @FindBy(id = "login-button")
    WebElement loginButton;

    public Login_PO(){
        super();
    }

    public void navigateToWebdriverUniversityLoginPage(){
        navigateToUrl("https://webdriveruniversity.com/Login-Portal/index.html");
    }

    public void setUsername(String username){
        sendKeys(usernameTextField, username);
    }

    public void setPassword(String password){
        sendKeys(passwordTextField, password);
    }

    public void clickOnLoginButton(){
        click(loginButton);
    }
}
