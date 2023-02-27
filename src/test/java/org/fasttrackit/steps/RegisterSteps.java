package org.fasttrackit.steps;

import net.thucydides.core.annotations.Step;

public class RegisterSteps extends BaseSteps{
    @Step
    public void navigateToMyAccountPage(){ homePage.clickMyAccountButton();}
    @Step
    public void typeRegisterEmail(String email) {accountPage.setRegisterEmailField(email);}
    @Step
    public void typeRegisterPassword(String password){accountPage.setRegisterPasswordField(password);}
    @Step
    public void clickRegisterButton(){accountPage.clickRegisterButton();}
    @Step
    public void getErrorMsgInvalidEmailRegister(){accountPage.getErrorMsgProvideEmailRegister();}
    @Step
    public void getErrorMsgProvidePassRegister(){ accountPage.getErrorMsgProvidePassRegister();}
    @Step
    public void getErrorMsgAlreadyRegistered(){accountPage.getErrorMsgAlreadyRegistered();}
    @Step
    public void doRegister(String email, String pass){
        navigateToMyAccountPage();
        typeRegisterEmail(email);
        typeRegisterPassword(pass);
        clickRegisterButton();
    }
    @Step
    public void userIsRegistered(String userName){
        accountPage.userIsRegistered(userName);

    }



}
