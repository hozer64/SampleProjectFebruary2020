package Tests;

import java.util.Properties;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BasePage.BasePage;
import Pages.MoreOptionsPage;
import Pages.PhoneCostumPage;
import Pages.SelectPhonePage;
import Pages.VerizonMainPage;
import Utilities.Constants;

public class MoreOptionPageTest  extends BasePage{

	WebDriver driver;
	Properties prop;
	BasePage basePage;
	
	VerizonMainPage verizonMainPage;
	SelectPhonePage selectPhonePage;
	PhoneCostumPage phoneCostumPage;
	MoreOptionsPage moreOptionsPage;
	
	
	@BeforeMethod 
	public void setUp(){
		
	basePage=new BasePage();
	prop=basePage.initialize_properties();
	driver=basePage.initialize_driver(prop);
	
	verizonMainPage=new VerizonMainPage(driver);
	//verizonMainPage.doSendAndClick();
	
	selectPhonePage=verizonMainPage.doSendAndClick();
	phoneCostumPage=selectPhonePage.doSendAndClick();
	
//	moreOptionsPage=phoneCostumPage.doSendAndClick();

//	selectPhonePage= new SelectPhonePage(driver);
//	selectPhonePage.doSendAndClick();
//	
//	phoneCostumPage= new PhoneCostumPage(driver);
//	
//	
	moreOptionsPage=new MoreOptionsPage(driver);
	
	
	
	
	}
	@Test(priority=1, description="more option page title")
	public void getTitle(){
		String title=moreOptionsPage.getMoreOptionTitle();
		System.out.println(title);
		Assert.assertEquals(title,Constants.MORE_OPTIONS_TITLE);
	}
		
	@Test(priority=2, description="selecting correctly more options")
	public void doSendAndClick(){
		moreOptionsPage.doSendAndClick();
	}
	
	
	@AfterMethod 
	public void tearDown(){
		driver.quit();
	}
	
	
}
