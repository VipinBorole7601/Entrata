package Test;

import POM.Ai_automation_suit_POM;
import POM.Automation_leasing_POM;
import POM.mainPage_Register_WebinarPOM;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;
import Base.Base;

public class Test_Automated_Leasing extends Base{

    Automation_leasing_POM al;

    Ai_automation_suit_POM aa;
    mainPage_Register_WebinarPOM mp;
    private static final Logger logger = Logger.getLogger(Test_Entrata_Landing_Page.class);

    @Test(priority = 11 ,description = "verify CurruntUrl of the page")
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

    @Test(priority = 12 ,description = "verify title of the page")
    public void verify_Title()
    {
        logger.info("Navigated to login page and verify title");
        String title=driver.getTitle();
        Assert.assertEquals(title,"Property Management Software | Entrata®" , "Title is matched");
        System.out.println("title is matched");
    }

    @Test(priority = 13 ,description = "Verify user is able to interact with automation leasing page and test the flow")
    public void verify_AUtomation_leasing() {
        logger.info("verificaton of automation leasing page and test the flow");
        al=new Automation_leasing_POM(driver);
        al.test_Automation_leasing();
        System.out.print("Automation Leasing Test Complete");
    }

}
