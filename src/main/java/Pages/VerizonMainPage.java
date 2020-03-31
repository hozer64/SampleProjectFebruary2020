package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import BasePage.BasePage;
import Utilities.Constants;
import Utilities.ElementUtil;

public class VerizonMainPage extends BasePage{

	WebDriver driver;
	ElementUtil elementUtil;
	
	
	By Phones=By.xpath("//button[contains(text(),'Phones list')]");
	By SmartPhones=By.id("thirdLevel00");
	
	
	
	public VerizonMainPage(WebDriver mydriver){
		this.driver=mydriver;
		elementUtil=new ElementUtil(driver);
	}
	
	
	
	public String getVerizonTitle(){
		return elementUtil.waitForGetPageTitle(Constants.VERIZON_TITLE);
		
	}
	
	
	public SelectPhonePage  doSendAndClick(){
		elementUtil.MovetoElement(driver, Phones);
		elementUtil.doClick(SmartPhones);
		
		return new SelectPhonePage(driver);
		
	}



	
	
	
	
}



