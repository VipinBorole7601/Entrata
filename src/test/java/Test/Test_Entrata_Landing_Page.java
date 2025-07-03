package Test;

import Base.Base;
import POM.mainPage;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

public class Test_Entrata_Landing_Page  extends Base {

    mainPage mp;

    private static final Logger logger = Logger.getLogger(Test_Entrata_Landing_Page.class);

    @Test(priority = 1 ,description = "verify CurruntUrl of the page")
    public void verify_CurrntUrl()
    {
        logger.info("Navigated to login page and verify url");
         String currunt_url=driver.getCurrentUrl();
         currunt_url.equals("https://www.entrata.com/");
         Assert.assertEquals(currunt_url,"https://www.entrata.com/" , "URL is matched");
         System.out.println("Currunt URL is correct matched with expected");

         mp = new mainPage(driver);
         mp.closePrivacyPolicyPopup();



    }

    @Test(priority = 2 ,description = "verify title of the page")
    public void verify_Title()
    {
        logger.info("Navigated to login page and verify title");
        String title=driver.getTitle();
        Assert.assertEquals(title,"Property Management Software | Entrata®" , "Title is matched");
        System.out.println("title is matched");
    }



}
