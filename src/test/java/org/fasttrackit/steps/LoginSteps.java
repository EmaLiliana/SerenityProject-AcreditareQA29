package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;
import org.junit.Assert;

public class LoginSteps extends BaseSteps{
    @Step
    public void navigateToMyAccountPage(){homePage.clickMyAccountButton();}
    @Step
    public void typeLoginEmailField(String email){accountPage.setLoginEmailField(email);}
    @Step
    public void typeLoginPasswordField(String password){accountPage.setLoginPasswordField(password);}
    @Step
    public void clickLoginButton(){accountPage.clickLoginButton();}

    @Step
    public void doLogin(String email, String pass){
        navigateToMyAccountPage();
        typeLoginEmailField(email);
        typeLoginPasswordField(pass);
        clickLoginButton();
    }

    @Step
    public void userIsLoggedIn(String username){accountPage.userIsLoggedIn(username);}
    @Step
    public void checkErrorMsgInvalidMail(){accountPage.checkLoginMsgInvalidMail();}
    @Step
    public void checkErrorMsgInvalidPass(String userEmail){accountPage.checkLoginMsgInvalidPass(userEmail);}
    @Step
    public void checkRequiredUsernameMsg(){
        Assert.assertEquals("Error: Username is required.",accountPage.getRequiredUsernameMsg());
    }
    @Step
    public void checkRequiredPassMsg(){
        Assert.assertEquals("ERROR: The password field is empty.",accountPage.getRequiredPassMsg());
    }
    @Step
    public void doLoginWithEmptyEmailField(String password){
        navigateToMyAccountPage();
        typeLoginPasswordField(password);
        clickLoginButton();
    }
    @Step
    public void doLoginWithEmptyPassField(String email){
        navigateToMyAccountPage();
        typeLoginEmailField(email);
        clickLoginButton();
    }
    @Step
    public void doLogout(){accountPage.clickOnLogoutAccount();}
    @Step
    public void loginIsDisplayedMyAccount(){accountPage.verifyLoginIsDisplayed();}
}
