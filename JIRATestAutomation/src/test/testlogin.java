package test;

import org.testng.annotations.Test;

import Pages.BugUpdate;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.createIssue;
import driver.createdriver;

public class testlogin extends createdriver
{
	
	@Test(priority=1)
	public void loginTC() throws InterruptedException
	{
		System.out.println("Inside login TC");
		LoginPage login = new LoginPage(driver);
		login.enteremailid("singla.kaajal@gmail.com");
		login.clickContinue();
		Thread.sleep(2000);
		login.enterpassword("password@1234");
		login.ClickLogIn();
		Thread.sleep(5000);
	}
	
	@Test(priority=3)
	public void searchexistingissueTC() throws InterruptedException
	{
		System.out.println("Inside searchexistingissue TC");
		HomePage home = new HomePage(driver);
		home.searchexistingissue("BDM-6");
		Thread.sleep(3000);
	}
	
	@Test(priority=2)
	public void createnewissueTC() throws InterruptedException
	{
		System.out.println("Inside createnewissue TC");
		createIssue issue = new createIssue(driver);
		issue.clickoncreatebutton();
		issue.entersummary("Sample test bug");
		issue.enterdescription("description");
		issue.clickbuton();
		Thread.sleep(2000);
	}
	
	@Test(priority=4)
	public void existingissueupdateTC() throws InterruptedException
	{
		System.out.println("Inside existingissueupdate TC");
		BugUpdate update= new BugUpdate(driver);
		update.updatebug("updating issue");
		Thread.sleep(3000);
	}
		

}
