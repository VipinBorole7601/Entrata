package Test;

import POM.Ai_automation_suit_POM;
import POM.mainPage_Register_WebinarPOM;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;
import Base.Base;
public class Test_AI_and_Automation_Suite_Demo extends Base {

    Ai_automation_suit_POM aa;
    mainPage_Register_WebinarPOM mp;
    private static final Logger logger = Logger.getLogger(Test_Entrata_Landing_Page.class);

    @Test(priority = 8 ,description = "verify CurruntUrl of the page")
    public void verify_CurrntUrl()
    {
        logger.info("Navigated to login page and verify url");
        String currunt_url=driver.getCurrentUrl();
        currunt_url.equals("https://www.entrata.com/");
        Assert.assertEquals(currunt_url,"https://www.entrata.com/" , "URL is matched");
        System.out.println("Currunt URL is correct matched with expected");

        mp = new mainPage_Register_WebinarPOM(driver);
        mp.closePrivacyPolicyPopup();



    }

    @Test(priority = 9 ,description = "verify title of the page")
    public void verify_Title()
    {
        logger.info("Navigated to login page and verify title");
        String title=driver.getTitle();
        Assert.assertEquals(title,"Property Management Software | Entrata®" , "Title is matched");
        System.out.println("title is matched");
    }

    @Test(priority = 10 ,description = "click on AI and Automation suit")
    public void click_on_AIAutomationSuit()
    {       aa=new Ai_automation_suit_POM(driver);
            aa.click_Ai_Automation_Suit();
            aa.click_bookademo();
            aa.fill_the_form();
            System.out.print("AI_automation Test sucessfull");
    }


}
