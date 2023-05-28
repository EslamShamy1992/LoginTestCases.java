package TestCases;

import Base.BaseTest;
import PageObjects.GuestPage;
import PageObjects.LoginScreen;
import org.testng.Assert;
import org.testng.annotations.Test;

public class GuestTestCases extends BaseTest {

LoginScreen login;
GuestPage guest;
    @Test
    public void Enter_As_Guest(){
        login= new LoginScreen(driver);
        guest= new GuestPage(driver);
        login.Click_On_Allow();
        login.Click_On_Session_Button();
        login.Click_on_Enter_As_Guest();
        guest.Click_On_Skip_Tutorial();
        guest.Click_On_Menu();
        guest.Click_On_Profile_Button();
        String x = guest.Must_Signup_First().getText();
        Assert.assertEquals(x,"Sorry You Must SignUp First");
        System.out.println(x);
    }


}

