package POM;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.List;

public class mainPage_Register_WebinarPOM {

    private WebDriver driver;
    WebDriverWait wait;
    Actions a;
    Select s;

    JavascriptExecutor js;



    @FindBy(xpath = "//button[@class=' osano-cm-dialog__close osano-cm-close ']")
    private WebElement privacyPolicyPopup;

    @FindBy(xpath = "//div[text()='Resources']")
    private WebElement resources;

    @FindBy(xpath = "//div[@class='dropdown_link-content']//div[text()='Webinars']")
    private WebElement webinars;

    @FindBy(xpath = "//div[@class='resources_list w-dyn-items']//div//div//div[3][contains(text(),'Autonomous Property Management: The Multifamily AI Revolution')]")
    private WebElement webinar_title_text;


    @FindBy(xpath = "//*[@id='w-tabs-1-data-w-pane-2']/div/div/div/div[1]/a/div[2]/div[3]/div[1]")
    private WebElement click_register_button_first_webinar;

    @FindBy(xpath = "//input[@id='FirstName']")
    private WebElement enter_Firstname;

    @FindBy(xpath = "//input[@id='LastName']")
    private WebElement enter_Lastname;

    @FindBy(xpath = "//input[@id='Email']")
    private WebElement enter_Email;

    @FindBy(xpath = "//input[@id='Phone']")
    private WebElement enter_Phone;

    @FindBy(xpath = "//input[@id='Company']")
    private WebElement enter_Company ;

    @FindBy(xpath = "//input[@id='Title']")
    private WebElement enter_Title ;

    @FindBy(xpath = "//select[@id='Unit_Count__c']")
    private WebElement select_Dropdown ;

    @FindBy(xpath = "//button[text()='REGISTER NOW']")
    private WebElement hover_on_register_button;


     @FindBy(xpath = "//div[@class='logo_component w-embed']")
     private WebElement backtoMainPageViaLogo;





    public mainPage_Register_WebinarPOM(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }


    public void closePrivacyPolicyPopup() {

        wait = new WebDriverWait(driver, Duration.ofMillis(20000));
        privacyPolicyPopup=wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@class=' osano-cm-dialog__close osano-cm-close ']")));
        privacyPolicyPopup.click();

    }

    public void hover_On_Resource() {

          a = new Actions(driver);
          a.moveToElement(resources).build().perform();

    }

    public void click_On_Webinar() {
        webinars.click();
    }

    public void click_And_click_to_Register_of_First_Webinar()
    {
        List<WebElement> elements = driver.findElements(By.xpath("//div[@class='resources_list w-dyn-items']//div//div//div[3][contains(text(),'Autonomous Property Management: The Multifamily AI Revolution')]"));
        if (!elements.isEmpty()){
            try {
               elements.get(1).getAccessibleName();
            }
            catch (IllegalMonitorStateException e)
            {
                e.printStackTrace();
                System.out.print("but test continues to click on register button"+e.getMessage());

            }
            finally {

                js = (JavascriptExecutor)driver;
                js.executeScript("arguments[0].click()",click_register_button_first_webinar);

            }

        } else {
            System.out.print("No elements found");
        }



        //click_register_button_first_webinar.click();
            String expected= driver.getCurrentUrl();
            String actual = "https://www.entrata.com/resource/autonomous-property-management-the-multifamily-ai-revolution-webinar";
    }

    public void fill_the_form()
    {
         enter_Firstname.sendKeys("Philip");
         enter_Lastname.sendKeys("Sampson");
         enter_Email.sendKeys("phil.sampson@entrata.com");
         enter_Phone.sendKeys("4434444444");
         enter_Company.sendKeys("entrata");
         enter_Title.sendKeys("SDET QA");

        s = new Select(select_Dropdown);
        s.selectByContainsVisibleText("101 - 300");
        a.moveToElement(hover_on_register_button);

        wait.until(ExpectedConditions.visibilityOf(backtoMainPageViaLogo));
        backtoMainPageViaLogo.click();


    }

}
