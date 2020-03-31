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

public class VerizonMainPageTest extends BasePage{

	

	WebDriver driver;
	Properties prop;
	BasePage basePage;
	VerizonMainPage verizonMainPage;
	
	@BeforeMethod
	public void SetUp(){
		
		basePage= new BasePage();
		prop=basePage.initialize_properties();
		driver=basePage.initialize_driver(prop);
		
		verizonMainPage=new VerizonMainPage(driver);
		
		
	
		
	}
	
	@Test(priority=1, description="test of main page title verification")
	public void setUp(){
		String title=verizonMainPage.getVerizonTitle();
		System.out.println(title);
		Assert.assertEquals(title, Constants.VERIZON_TITLE);
		
	}
	
	@Test(priority=2, description="test of all phone menu")
	public void doSendAndClick(){
		verizonMainPage.doSendAndClick();
	}
	
	
	@AfterMethod 
public void tearDown(){
		
		driver.quit();
	}
	
	
}
