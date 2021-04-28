package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage 
{
	WebDriver DC;
	public HomePage(WebDriver F)
	{
	DC=F;
	}
	public void clickonCreate()
	{
		WebElement createButton = DC.findElement(By.xpath("//button[@id='createGlobalItem']"));
		createButton.click();
	}
   	public void searchexistingissue(String issueid) {
   		//System.out.println("inside function search existing issue");
   		WebElement searchissuefield = DC.findElement(By.xpath("//input[@placeholder='Search']"));
    	searchissuefield.click();
    	//System.out.println("After focusiing on search field");
    	//System.out.println("value of issueid is" +issueid);
    	WebElement searchjiraissuefield = DC.findElement(By.xpath("//input[@placeholder='Search Jira']"));
    	searchjiraissuefield.sendKeys(issueid);
    	
    	//System.out.println("After entering issue id");
    	
    	searchjiraissuefield.sendKeys(Keys.ENTER);
}
}
