package org.fasttrackit.features;

import org.fasttrackit.utils.Constants;
import org.junit.Test;

public class LoginTest extends BaseTest{
    @Test
    public void validLoginTest(){
        loginSteps.doLogin(Constants.USER_EMAIL,Constants.USER_PASS);
        loginSteps.userIsLoggedIn(Constants.USER_NAME);
    }
    @Test
    public void loginWithInvalidEmailTest(){
        loginSteps.doLogin("anaEma1234@yahoo.com",Constants.USER_PASS);
        loginSteps.checkErrorMsgInvalidMail();
    }
    @Test
    public void loginWithInvalidPassTest(){
        loginSteps.doLogin(Constants.USER_EMAIL, "123456");
        loginSteps.checkErrorMsgInvalidPass(Constants.USER_EMAIL);
    }
    @Test
    public void loginWithEmptyEmailFieldTest(){
        loginSteps.doLoginWithEmptyEmailField(Constants.USER_PASS);
        loginSteps.checkRequiredUsernameMsg();
    }
    @Test
    public void loginWithEmptyPassFieldTest(){
        loginSteps.doLoginWithEmptyPassField(Constants.USER_EMAIL);
        loginSteps.checkRequiredPassMsg();
    }
    @Test
    public void logoutTest(){
        loginSteps.doLogin(Constants.USER_EMAIL,Constants.USER_PASS);
        loginSteps.doLogout();
        loginSteps.loginIsDisplayedMyAccount();
    }
}
