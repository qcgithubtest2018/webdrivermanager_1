package webdrivermanagerpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

class WebDriverManager_2 
{
    WebDriver driver;

    @Test
    void test() throws InterruptedException 
    {
    	WebDriverManager.chromedriver().setup();
    	driver = new ChromeDriver();
    	driver.get("https://bonigarcia.dev/selenium-webdriver-java/");
    	Thread.sleep(5000);
        driver.quit();
    }
}


