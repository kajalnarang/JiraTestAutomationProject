package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage 
{
	WebDriver DC;
	public LoginPage(WebDriver F)
	{
	DC=F;
	}

	public void enteremailid(String emailid)
	{
		WebElement email =DC.findElement(By.cssSelector("input[id*='username']"));
		email.sendKeys(emailid);
	}
	public void clickContinue()
	{
		WebElement continueButton = DC.findElement(By.xpath("//div[contains(@class,'sc-jWBwVP idzzUX')]"));
		continueButton.click();
	}
	public void enterpassword(String password)
	{
		WebElement pass = DC.findElement(By.cssSelector("input[id*='password']"));
		pass.click();
		pass.sendKeys(password);
	}
	public void ClickLogIn()
	{
		WebElement loginButton = DC.findElement(By.xpath("//button[@id='login-submit']"));
		loginButton.click();
	}

}
