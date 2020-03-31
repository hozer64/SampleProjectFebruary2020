package Pages;

import javax.swing.text.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import BasePage.BasePage;
import Utilities.Constants;
import Utilities.ElementUtil;

public class PhoneCostumPage extends BasePage{
	

	WebDriver driver;
	ElementUtil elementUtil;
	
	By selectColor=By.xpath("//div[@style='background-color: rgb(0, 0, 0);']");
	By selectCapacity=By.xpath("//p[contains(text(),'128GB')]");
	By selectPaymentOp=By.xpath("	//div[text()=' Retail price']");
	By selectContinue=By.id("ATC-Btn");
	By zipcode= By.id("zipcode");
	By confirmLoc=By.xpath("//button[contains(text(),'Confirm Location')]");
	By newCustomer=By.xpath("//button[contains(text(),'New Customer')]");
	
	
	//div[@class='sizePad']//span[text()='$749.99']
	public  PhoneCostumPage(WebDriver driver){
		this.driver=driver;
		elementUtil=new ElementUtil(driver);
	
	}
	
	
	public String getCustomPageTitle(){
		return elementUtil.waitForGetPageTitle(Constants.CUSTOM_PAGE_TITLE);
		
	}
	
	
	public MoreOptionsPage  doSendAndClick(){
	
		
		elementUtil.doClick(selectColor);
		elementUtil.doClick(selectCapacity);
		elementUtil.doClick(selectPaymentOp);
		elementUtil.doClick(selectContinue);
		elementUtil.doSendKeys(zipcode, "07512");
		elementUtil.doClick(confirmLoc);
		elementUtil.doClick(newCustomer);
		
		return new MoreOptionsPage(driver);
		
		

		
		
		
	}
	
	
	
	
}
