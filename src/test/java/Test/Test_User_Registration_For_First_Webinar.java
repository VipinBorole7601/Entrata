package Test;

import Base.Base;
import POM.mainPage_Register_WebinarPOM;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.log4testng.Logger;

public class Test_User_Registration_For_First_Webinar extends Base {
    mainPage_Register_WebinarPOM mp;
    private static final Logger logger = Logger.getLogger(Test_Entrata_Landing_Page.class);

    @Test(priority = 3 ,description = "verify CurruntUrl of the page")
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

    @Test(priority = 4 ,description = "verify title of the page")
    public void verify_Title()
    {
        logger.info("Navigated to login page and verify title");
        String title=driver.getTitle();
        Assert.assertEquals(title,"Property Management Software | Entrata®" , "Title is matched");
        System.out.println("title is matched");
    }



    @Test(priority = 5,description = "Hover on Resources and click on Webinars")
    public void verify_Registration_For_First_Webinar()
    {     logger.info("Hover on Resources and click on Webinars");
         mp.hover_On_Resource();
         mp.click_On_Webinar();
    }

    @Test(priority = 6,description = "click on fist webinar as described in test case validate and fill the registration form and land back on main page")
    public void register_For_Webinar()
    {
        logger.info("validate and fill the registration form and land back on main page");
        mp.click_And_click_to_Register_of_First_Webinar();

        try {
            wait(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
    @Test(priority = 7 ,description = "fill the registration form and comeback to main page")
    public void fill_Registration_Form()
    {
        logger.info("form filling completed");
          mp.fill_the_form();
          System.out.println(" All Test for Register Webinar are Passed for Webinar Registration:  ");
    }




}
