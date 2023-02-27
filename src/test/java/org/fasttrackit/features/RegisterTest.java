package org.fasttrackit.features;

import org.fasttrackit.utils.Constants;
import org.junit.Test;

public class RegisterTest extends BaseTest{
    @Test
    public void validDataRegisterTest(){
        registerSteps.doRegister(Constants.USER_EMAIL,Constants.USER_PASS);
        registerSteps.userIsRegistered(Constants.USER_NAME);

    }
    @Test
    public void invalidEmailRegisterTest(){
        registerSteps.doRegister("ema_ana@yahoo",Constants.USER_PASS);
        registerSteps.getErrorMsgInvalidEmailRegister();

    }
    @Test
    public void emptyFieldPassRegisterTest(){
        registerSteps.doRegister("popema@yahoo.com","");
        registerSteps.getErrorMsgProvidePassRegister();

    }
    @Test
    public void registerWithSameDataTest(){
        registerSteps.doRegister(Constants.USER_EMAIL,Constants.USER_PASS);
        registerSteps.getErrorMsgAlreadyRegistered();
    }

}
