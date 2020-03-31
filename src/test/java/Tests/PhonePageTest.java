package Tests;

import java.util.Properties;

import org.omg.CORBA.PUBLIC_MEMBER;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import BasePage.BasePage;
import Pages.SelectPhonePage;
import Pages.VerizonMainPage;
import Utilities.Constants;

public class PhonePageTest extends BasePage {

	
	WebDriver driver;
	Properties prop;
	BasePage basePage;
	VerizonMainPage verizonMainPage;
	SelectPhonePage selectPhonePage;
	


	@BeforeMethod 
	public void SetUp(){
	basePage= new BasePage();
	prop=basePage.initialize_properties();
	driver=basePage.initialize_driver(prop);
	
	verizonMainPage=new VerizonMainPage(driver);
	
	
	selectPhonePage=verizonMainPage.doSendAndClick();
	
	
	
	
	}
	
	@Test(priority=1, description="test of phone page title verification")
	public void verifyTitle(){
	String title=selectPhonePage.getPhonePageTitle();
	System.out.println(title);
	Assert.assertEquals(title, Constants.VERIZON_PHONEPAGE_TITLE);
		
	}
	
	
	
	@Test(priority=2, description="test of selected phone correctly")
	public void selectPhone(){
		selectPhonePage.doSendAndClick();
		
	}
	

	@AfterMethod
	public void tearDown(){
		driver.quit();
	}
		
	
	
}
