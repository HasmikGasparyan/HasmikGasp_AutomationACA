package Page;

import org.openqa.selenium.WebDriver;

public class LoginPage {
    public LoginPage(WebDriver driver) {
        this.driver = driver;
    }
    WebDriver driver;
    Page.BasePage basePage;


    public void login(String username, String password)throws InterruptedException{
        basePage  = new Page.BasePage(driver);
        basePage.checkPageTitle("STORE");
        basePage.clickOnElement("id","login2");
        basePage.delay(1);
        basePage.insertInto("id", "loginusername", username);
        basePage.insertInto("id", "loginpassword", password);
        basePage.delay(1);
        basePage.clickOnElement("css", "[onclick='logIn()']");
    }
}