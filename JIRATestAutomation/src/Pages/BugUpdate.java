package Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BugUpdate 
{
	WebDriver DC;
	public BugUpdate(WebDriver F)
	{
	DC=F;
	}

	public void updatebug(String comment)
	{
		System.out.println("Inside bug update function");
		DC.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
		WebElement commentfield = DC.findElement(By.xpath("//input[starts-with(@class , 'sc-')]"));
		commentfield.click();
		WebElement commentfieldtext = DC.findElement(By.xpath("//div[starts-with(@class , 'ua-chrome ProseMirror pm-table-resizing-plugin')]"));
		commentfieldtext.sendKeys(comment);
		WebElement savebutton =DC.findElement(By.xpath("//span[text()='Save']"));
		savebutton.click();
		System.out.println("After updating bug with comment");
	}
}
