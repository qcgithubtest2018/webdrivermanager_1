package utility;

import java.io.IOException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

// BaseClass + BrowserFactory
public class TestBase 
{
    public static WebDriver driver = null;
    
    @BeforeSuite
    public void initialize() throws IOException, InterruptedException
    {
    	//System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
    	//driver = new ChromeDriver();
    							
    	//System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
    	//driver = new FirefoxDriver();
    							
    	//System.setProperty("webdriver.gecko.driver", "C:/jars_selenium/drivers/geckodriver.exe");
    	//driver = new FirefoxDriver();
    					
    	System.setProperty("webdriver.chrome.driver", "C:/jars_selenium/drivers/chromedriver.exe");
    	driver = new ChromeDriver();
    					 
    	driver.manage().window().maximize();
    	driver.manage().deleteAllCookies();
    	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    	
    	driver.get("https://opensource-demo.orangehrmlive.com");
    	Thread.sleep(5000);
    }
    
    @AfterSuite
    public void tearDownTest()
    {
		driver.close();
    }
}
