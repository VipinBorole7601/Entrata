package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Ai_automation_suit_POM  {

    private WebDriver driver;


    WebDriverWait wait;
    Actions a;
    Select s;

    @FindBy(xpath = "//div[text()='AI & Automation Suite'][1]")
    private WebElement aiandAutomationSuit ;

    @FindBy(xpath = "//div[@class='suite-hero_component']//div[text()='Book a demo']")
    private WebElement bookademo;

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

    @FindBy(xpath = "//select[@id='demoRequest']")
    private WebElement select_as_owner ;

    @FindBy(xpath = "//div[@class='padding-global']//div//a")
    private WebElement entratalogo;



    public Ai_automation_suit_POM(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    public void click_Ai_Automation_Suit(){
        aiandAutomationSuit.click();
    }

    public void click_bookademo(){
       bookademo.click();
    }

    public void fill_the_form(){

        enter_Firstname.sendKeys("Fiona");
        enter_Lastname.sendKeys("bompard");
        enter_Email.sendKeys("fiona.bompard@entrata.com");
        enter_Company.sendKeys("entrata");
        enter_Phone.sendKeys("3455555555");
        s= new Select(select_Dropdown);
        s.selectByContainsVisibleText("1 - 100");
        enter_Title.sendKeys("Engineering Head");
        s=new Select(select_as_owner);
        s.selectByContainsVisibleText("an Owner/Operator or Property Manager");

        wait = new WebDriverWait(driver, Duration.ofMillis(3000));
        wait.until(ExpectedConditions.visibilityOf(entratalogo));

        entratalogo.click();



    }



}
