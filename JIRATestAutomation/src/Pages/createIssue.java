package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class createIssue 
{
	WebDriver DC;
	public createIssue(WebDriver F)
	{
	DC=F;
	}
	public void clickoncreatebutton() throws InterruptedException
	{
		WebElement createButton = DC.findElement(By.xpath("//button[@id='createGlobalItem']"));
		createButton.click();
		Thread.sleep(2000);
	}
	public void selectIssueType(String issuetype)
	{
		WebElement Issuetypedropdown = DC.findElement(By.xpath("//input[@id='issuetype-field']"));
		Issuetypedropdown.click();
		Issuetypedropdown.sendKeys(issuetype);
		//System.out.println("After selecting issue type");
	}
	public void entersummary(String Summary)
	{
		WebElement Summaryfield = DC.findElement(By.xpath("//input[@id='summary']"));
		Summaryfield.click();
		Summaryfield.sendKeys(Summary);
		//System.out.println("After entring summary");
	}
	public void enterdescription(String description)
	{
		WebElement Descfield = DC.findElement(By.xpath("//textarea[@id='description']"));
		Descfield.click();
		Descfield.sendKeys(description);
		//System.out.println("After entring desc");
	}
	
	public void clickbuton()
	{
		WebElement createButtn = DC.findElement(By.xpath("//input[@id='create-issue-submit']"));
		createButtn.click();
		System.out.println("After creating on button");
	}
	
}
