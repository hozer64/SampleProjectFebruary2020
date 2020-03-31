package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import BasePage.BasePage;
import Utilities.Constants;
import Utilities.ElementUtil;
import Utilities.JavaScriptUtil;

public class MoreOptionsPage extends BasePage {

	
	WebDriver driver;
	ElementUtil elementUtil;
	
	By Next=By.xpath("//button[text()='Next']");
	By No=By.xpath("//p[text()='No']");
	By custom=By.xpath("//p[text()='Customize']");
	By Next2=By.xpath("//button[text()='Next']");
	By decline=By.xpath("//button[text()='Decline device protection']");
	By decline2=By.xpath("//div[@class='col-xs-12 col-md-6 deClineProtectionModalHeaderPadding']//button[text()='Decline device protection']");
	
	public MoreOptionsPage(WebDriver driver){
		this.driver=driver;
		elementUtil=new ElementUtil(driver);
	}

	public String getMoreOptionTitle(){
		return elementUtil.waitForGetPageTitle(Constants.MORE_OPTIONS_TITLE);
		
	}	
		public void doSendAndClick(){
			
			
			elementUtil.doClick(Next);
			elementUtil.doClick(No);
			elementUtil.doClick(custom);
			elementUtil.doClick(Next2);
			elementUtil.doClick(decline);
			elementUtil.doClick(decline2);
		
	}
	
	
}
