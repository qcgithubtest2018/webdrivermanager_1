package webdrivermanagerpkg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WebDriverManager_1
{
	public static void main(String[] args) 
	{
		// WebDriverManager.chromedriver().setup();                      // 4.4.3
		// WebDriver driver = new ChromeDriver();
		
		// WebDriver driver = WebDriverManager.chromedriver().create();  // 5.1.1 
		
		ChromeOptions co = new ChromeOptions();
		co.setHeadless(true);
		WebDriver driver = WebDriverManager.chromedriver().capabilities(co).create();  // 5.1.1
		
		driver.get("https://www.google.com");
		driver.getTitle();
		driver.getCurrentUrl();
		driver.quit();
	}
}