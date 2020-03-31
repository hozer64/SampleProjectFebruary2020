package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import BasePage.BasePage;
import Utilities.Constants;
import Utilities.ElementUtil;

public class SelectPhonePage extends BasePage {

	
	WebDriver driver;
	ElementUtil elementUtil;
	
	By selectPhone= By.xpath("//a[@aria-label='Apple iPhone 11']");
	
	
	
	
	
	public  SelectPhonePage(WebDriver driver){
		this.driver=driver;
		elementUtil=new ElementUtil(driver);
	
		
	}
	
	
	public String getPhonePageTitle(){
		return elementUtil.waitForGetPageTitle(Constants.VERIZON_PHONEPAGE_TITLE);
		
	}
	
	
	public PhoneCostumPage doSendAndClick(){
		elementUtil.doClick(selectPhone);
	
		return new PhoneCostumPage(driver);
		
		
		
	}
	
	

	
}
