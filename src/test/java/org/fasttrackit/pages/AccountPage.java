package org.fasttrackit.pages;

import net.serenitybdd.core.annotations.findby.FindBy;
import net.serenitybdd.core.pages.WebElementFacade;

public class AccountPage extends BasePage{
    @FindBy(id="reg_email")
    private WebElementFacade registerEmailField;
    @FindBy(id="reg_password")
    private WebElementFacade registerPasswordField;
    @FindBy(css=".woocommerce-FormRow button")
    private WebElementFacade registerButton;
    @FindBy(css=".woocommerce-MyAccount-content p:nth-child(1)")
    private WebElementFacade welcomeRegisterTextElement;
    @FindBy(css=".woocommerce-error li")
    private WebElementFacade errorMsgInvalidEmailRegister;
    @FindBy(css="#post-7 .entry-content li")
    private WebElementFacade errorMsgProvidePassRegister;

    @FindBy(css="#post-7 li")
    private WebElementFacade errorMsgAlreadyRegistered;

    @FindBy(css="#username")
    private WebElementFacade loginEmailField;
    @FindBy(css="#password")
    private WebElementFacade loginPasswordField;
    @FindBy(css=".login .button")
    private WebElementFacade loginButton;
    @FindBy(css=".woocommerce-MyAccount-content p:first-of-type")
    private WebElementFacade welcomeLoginTextElement;
    @FindBy(css=".woocommerce-error li")
    private WebElementFacade errorMsgLoginInvalidEmail;
    @FindBy(css=".woocommerce-error li")
    private WebElementFacade errorMsgLoginInvalidPass;
    @FindBy(css=".woocommerce-error li")
    private WebElementFacade requiredUsernameMsg;
    @FindBy(css=".woocommerce-error li")
    private WebElementFacade requiredPassMsg;
    @FindBy(css=".woocommerce-MyAccount-content p:nth-child(1)  a")
    private WebElementFacade logoutAccount;
    @FindBy(css=".u-column1:first-child>h2")
    private WebElementFacade loginIsDisplayed;



    public void setRegisterEmailField(String value){typeInto(registerEmailField, value);}
    public void setRegisterPasswordField(String value){typeInto(registerPasswordField, value);}
    public void clickRegisterButton(){clickOn(registerButton);}
    public void userIsRegistered(String userName){welcomeRegisterTextElement.shouldContainOnlyText("Hello " + userName+" (not "+userName+"? Log out)");}
    public void getErrorMsgProvideEmailRegister(){errorMsgInvalidEmailRegister.shouldContainOnlyText("Error: Please provide a valid email address.");}
    public void getErrorMsgProvidePassRegister(){errorMsgProvidePassRegister.shouldContainOnlyText("Error: Please enter an account password.");}
    public void getErrorMsgAlreadyRegistered(){errorMsgAlreadyRegistered.shouldContainOnlyText("Error: An account is already registered with your email address. Please log in.");}
    public void setLoginEmailField(String value){typeInto(loginEmailField, value);}
    public void setLoginPasswordField(String value){typeInto(loginPasswordField,value);}
    public void clickLoginButton(){clickOn(loginButton);}
    public void userIsLoggedIn(String userName){welcomeLoginTextElement.shouldContainOnlyText("Hello " + userName+" (not "+userName+"? Log out)");}
    public void checkLoginMsgInvalidMail(){errorMsgLoginInvalidEmail.shouldContainOnlyText("ERROR: Invalid email address. Lost your password?");}
    public void checkLoginMsgInvalidPass(String userEmail){errorMsgLoginInvalidPass.shouldContainOnlyText("ERROR: The password you entered for the email address "+userEmail+" is incorrect. Lost your password?");}
    public String getRequiredUsernameMsg(){
        waitFor(requiredUsernameMsg);
        return requiredUsernameMsg.getText();
    }
    public String getRequiredPassMsg(){
        waitFor(requiredPassMsg);
        return requiredPassMsg.getText();
    }
    public void clickOnLogoutAccount(){clickOn(logoutAccount);}
    public void verifyLoginIsDisplayed(){loginIsDisplayed.isDisplayed();}
}
