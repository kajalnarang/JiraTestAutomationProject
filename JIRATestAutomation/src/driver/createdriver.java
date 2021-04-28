package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

public class createdriver 
{
	public WebDriver driver; 

	@BeforeClass
	
	@Parameters("browser")
	public void createdriver1(String browser)
	{
	if (browser.equals("firefox")) 
	{
	driver=new FirefoxDriver(); 
	}
	else if (browser.equals("chrome")) 
	{
	System.setProperty("webdriver.chrome.driver", "E:/kajal/Selenium Project/chromedriver_win32/chromedriver.exe");
	driver=new ChromeDriver(); 
	}
	else 
	{
	driver=new FirefoxDriver(); 
	}
	
	driver.get("https://id.atlassian.com/login?continue=https%3A%2F%2Fcrx-markets.atlassian.net%2Flogin%3FredirectCount%3D1%26application%3Djira&application=jira");
	driver.manage().window().maximize();
	}
	
	@AfterClass
	public void closedriver()
	{
	driver.quit();
	}
}
