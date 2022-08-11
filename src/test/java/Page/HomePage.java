package Page;

import org.openqa.selenium.WebDriver;

public class HomePage {

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    WebDriver driver;
    Page.BasePage basePage;


    public void goToHomePage() {
        basePage = new BasePage(driver);
        basePage.goToMenuItem("Home", "xpath",
                "//*[@id=\"navbarExample\"]/ul/li[1]/a");
        //Actual text  for this item and expected text don't match(there is a span tag inside our a tag in html which also has text)
        // (so Assert.assertTrue() doesn't work, we can print it and see:
        /*String text = basePage.getElement("xpath", "//*[@id=\"navbarExample\"]/ul/li[1]/a").getText();
        System.out.println(text);*/
    }

}