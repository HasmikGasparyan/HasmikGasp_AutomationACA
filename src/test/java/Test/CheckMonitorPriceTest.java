package Test;

import Base.SeleniumBase;
import Page.*;
import Utils.Helpers;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class CheckMonitorPriceTest extends SeleniumBase {

    BasePage basePage;
    SignUpPage signUpPage;
    HomePage homePage;
    MonitorsPage monitorsPage;
    Helpers helpers;
    LoginPage loginPage;

    private String username;
    private String password;

    @BeforeClass
    public void monitorTestPrerequisites() throws InterruptedException{
        basePage = new BasePage(driver);
        signUpPage = new SignUpPage(driver);
        homePage = new HomePage(driver);
        helpers = new Helpers();
        loginPage = new LoginPage(driver);

        String rndStr = helpers.randomStr(7);
        username = rndStr;
        String rndStr2 = helpers.randomStr(7);
        password = rndStr2;
        basePage.getUrl("https://www.demoblaze.com/");
        signUpPage.registration(username, password);
        loginPage.login(username, password);
        //homePage.goToHomePage();

    }


    @Test
    public void CheckMonitorPriceTest() throws InterruptedException{
        monitorsPage = new MonitorsPage(driver);
        monitorsPage.checkMonitorPrice("$230 *includes tax");
    }

    @AfterClass
    public void monitorTestPostRequisites(){
        quitDriver();
    }
}