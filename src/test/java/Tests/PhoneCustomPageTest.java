package Tests;

import java.util.Properties;

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

public class PhoneCustomPageTest extends BasePage {

	WebDriver driver;
	Properties prop;
	BasePage basePage;
	VerizonMainPage verizonMainPage;
	SelectPhonePage selectPhonePage;
	PhoneCostumPage phoneCostumPage;
	MoreOptionsPage MoreOptionsPage;
	
	
	@BeforeMethod
	public void SetUp(){
	basePage= new BasePage();
	prop=basePage.initialize_properties();
	driver=basePage.initialize_driver(prop);
	
	verizonMainPage=new VerizonMainPage(driver);
	verizonMainPage.doSendAndClick();
	
	
	selectPhonePage= new SelectPhonePage(driver);
	selectPhonePage.doSendAndClick();
	
	

	phoneCostumPage= new PhoneCostumPage(driver);
	
		
		
	}
	
	@Test(priority=1, description="test of phone custom page title")
	public void getCustomPageTitle(){
	
		String title=phoneCostumPage.getCustomPageTitle();
		System.out.println(title);
		Assert.assertEquals(title, Constants.CUSTOM_PAGE_TITLE);

		try {
			Thread.sleep(3000);
		} catch (Exception e) {
			e.getStackTrace();
			
		}
		
	}
	
	
	
	
	
	
	@Test(priority=2, description="test of correctly customization of phone")
	public void dosendAndClick(){
		phoneCostumPage.doSendAndClick();
		
	}
	
	
	
	
	@AfterMethod
	public void tearDown(){
		driver.quit();
		
	}
	
	
	
	
}
