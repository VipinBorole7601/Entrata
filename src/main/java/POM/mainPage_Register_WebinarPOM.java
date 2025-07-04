package POM;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import java.time.Duration;

public class mainPage {

    private WebDriver driver;
    WebDriverWait wait;
    Actions a;



    @FindBy(xpath = "//button[@class=' osano-cm-dialog__close osano-cm-close ']")
    private WebElement privacyPolicyPopup;

    @FindBy(xpath = "//div[text()='Resources']")
    private WebElement resources;

    @FindBy(xpath = "//div[@class='dropdown_link-content']//div[text()='Webinars']")
    private WebElement webinars;

    @FindBy(xpath = "//div[@id='w-tabs-1-data-w-pane-0']//a[@data-wf-native-id-path='d39f3ff1-2d4a-fd50-5c86-a3febe68e905_instance-0']" +
            "//div[@class='resource-card_bottom']//div[text()='REGISTER NOW']")
    private WebElement click_register_button_first_webinar;




    public mainPage(WebDriver driver){
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

    public void click_And_Register_First_Webinar()
    {
            click_register_button_first_webinar.click();
            String expected= driver.getCurrentUrl();
            String actual = "https://www.entrata.com/resource/autonomous-property-management-the-multifamily-ai-revolution-webinar";



    }


}
