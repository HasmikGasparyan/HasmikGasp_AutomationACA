package Page;

import org.openqa.selenium.WebDriver;

public class SignUpPage {

    WebDriver driver;

    // urish BasePage el ka urish projectum(vor mer projecti Page packiji BasePage-c ogtvi)
    Page.BasePage basePage;

    public SignUpPage(WebDriver driver) {
        this.driver = driver;
    }

    public void registration(String username, String password)throws InterruptedException{
        basePage = new Page.BasePage(driver);
        basePage.clickOnElement("id", "signin2");
        basePage.delay(2);
        basePage.insertInto("id", "sign-username", username);
        basePage.insertInto("id", "sign-password", password);
        basePage.delay(1);
        basePage.clickOnElement("css", "[onclick='register()']");
        basePage.delay(1);
        basePage.checkAlertMessage("Sign up successful.");
        basePage.delay(1);
        basePage.alertAccept();
    }

}