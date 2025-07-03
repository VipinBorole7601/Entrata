package Base;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.log4testng.Logger;

import java.time.Duration;

public class Base {


    public WebDriver driver;
    public final Logger logger = Logger.getLogger(Base.class);

    @Parameters("browser")
    @BeforeClass
    public WebDriver setUp(String browser) {

          logger.info("Initializing WebDriver...");
        if (browser.equalsIgnoreCase("chrome")) {

            WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
            driver.manage().window().maximize();
            logger.info("WebDriver initialized and window maximized");
            driver.get("https://www.entrata.com/");
            driver.manage().deleteAllCookies();
            driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));
        } else {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
            driver.manage().window().maximize();
            logger.info("WebDriver initialized and window maximized");
            driver.get("https://www.entrata.com/");
            driver.manage().deleteAllCookies();
            driver.manage().timeouts().implicitlyWait(Duration.ofMillis(10000));

        }


        return driver;
    }

   // @AfterClass
    public WebDriver setDown()
    {
        if (driver != null) {
            driver.close();
            driver.quit();
            logger.info("Browser closed successfully");
        }
        return driver;
    }

}
