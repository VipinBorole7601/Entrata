package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class mainPage {

    private WebDriver driver;
    WebDriverWait wait;

    @FindBy(xpath = "//div[@id='02b2762a-b890-4903-bc27-a9f8ed0425d7']//button")
    private WebElement privacyPolicyPopup;

    @FindBy(xpath = "//div[text()='Resources']")
    private WebElement resources;

    @FindBy(xpath = "//div[@class='dropdown_link-content']//div[text()='Webinars']")
    private WebElement webinars;



    public mainPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }


    public void closePrivacyPolicyPopup() {

        privacyPolicyPopup.click();

    }


}
