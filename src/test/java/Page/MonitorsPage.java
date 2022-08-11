package Page;


import org.openqa.selenium.WebDriver;

public class MonitorsPage {

    public MonitorsPage(WebDriver driver) {
        this.driver = driver;
    }

    WebDriver driver;
    Page.BasePage basePage;

    //finds the right element only by xpath, all the rest locators aren't unique,even id.
    public void checkMonitorPrice(String price) throws InterruptedException {
        basePage = new BasePage(driver);
        basePage.goToMenuItem("Monitors", "xpath", "//*[@id=\"itemc\"]");
        basePage.delay(2);
        basePage.goToMenuItem("ASUS Full HD", "xpath","//*[@id=\"tbodyid\"]/div[2]/div/div/h4/a" );
        basePage.delay(2);
        basePage.verifyMenuItemText(price, "xpath", "//*[@id=\"tbodyid\"]/h3");
        // Actual text/String price  is "$230 *includes tax" NOT just "$230", we can print it and see:
        /*String text = basePage.getElement("xpath", "//*[@id=\"tbodyid\"]/h3").getText();
        System.out.println(text);
       */

    }


    /*id ------  "itemc"*/
    /*"css ----- .card-title"*/


}
