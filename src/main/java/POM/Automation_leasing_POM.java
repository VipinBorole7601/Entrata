package POM;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Automation_leasing_POM {
    private WebDriver driver;
    WebDriverWait wait;
    Actions a;
    Select s;
    JavascriptExecutor js;



    @FindBy(xpath ="//h2[text()='Automated leasing']")
    private WebElement automation_leasing_verify;

    @FindBy(xpath ="//section[@class='section_home-automated-leasing']//div//a[@data-wf-element-id='f77db2b9-75f7-7ab1-281e-70099aef2680']//div[text()='Learn more']")
    private WebElement learn_more_button;

    @FindBy(xpath ="//section[@class='section_product-hero']//div[text()='Watch a demo']")
    private WebElement watch_a_demo_button;

    @FindBy(xpath = "//input[@id='FirstName']")
    private WebElement enter_Firstname;

    @FindBy(xpath = "//input[@id='LastName']")
    private WebElement enter_Lastname;

    @FindBy(xpath = "//input[@id='Email']")
    private WebElement enter_Email;

    @FindBy(xpath = "//input[@id='Company']")
    private WebElement enter_Company ;

    @FindBy(xpath = "//input[@id='Phone']")
    private WebElement enter_Phone;

    @FindBy(xpath = "//select[@id='Unit_Count__c']")
    private WebElement select_Dropdown ;

    @FindBy(xpath = "//input[@id='Title']")
    private WebElement enter_Title ;

    @FindBy(xpath = "//select[@id='demoRequest']")
    private WebElement select_I_am_resident ;

    @FindBy(xpath = "//button[text()='Watch Demo']")
     private WebElement watch_demo_btn;

    @FindBy(xpath = "//div[@class='padding-global']//div//a")
    private WebElement entratalogo;




    public Automation_leasing_POM(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }


    public void test_Automation_leasing() {

        js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true)",automation_leasing_verify);
        js.executeScript("arguments[0].scrollIntoView(true)",learn_more_button);
        js.executeScript("arguments[0].scrollIntoView(); window.scrollBy(0, -200);", learn_more_button);

        a=new Actions(driver);
        a.moveToElement(learn_more_button);

        wait = new WebDriverWait(driver, Duration.ofMillis(3000));
        wait.until(ExpectedConditions.elementToBeClickable(learn_more_button));

        learn_more_button.click();
        watch_a_demo_button.click();
        enter_Firstname.sendKeys("vipin");
        enter_Lastname.sendKeys("borole");
        enter_Email.sendKeys("vipin.borole@entrata.com");
        enter_Company.sendKeys("entrata powers");
        enter_Phone.sendKeys("2611717171");
        s= new Select(select_Dropdown);
        s.selectByContainsVisibleText("301 - 2000");
        enter_Title.sendKeys("QA Automation Tester");
        s= new Select(select_I_am_resident);
        s.selectByContainsVisibleText("a Resident");
        a.moveToElement(watch_demo_btn);
        entratalogo.click();

    }
}
