package opencartTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class RegisterPage {
	
	
WebDriver driver;


//constructor
RegisterPage(WebDriver d)
	{
		driver = d;
		
		//this method will create web elements
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//span[normalize-space()='My Account']") WebElement myAccountDropdown;
	
	@FindBy(xpath = "//a[normalize-space()='Register']") WebElement dropdown_registeroption;
	
	@FindBy(id = "input-firstname") WebElement firstname;
	
	@FindBy(id = "input-lastname") WebElement lastname;
	
	@FindBy(id = "input-email") WebElement email;
	
	@FindBy(id = "input-password") WebElement password_regi;
	
	@FindBy(id = "input-newsletter-no") WebElement radio_news_no;
	
	@FindBy(id = "input-newsletter-yes") WebElement radio_news_yes;
	
	@FindBy(name = "agree") WebElement terms_checkbox;
	
	@FindBy(xpath = "//b[normalize-space()='Privacy Policy']") WebElement termslink;
	
	@FindBy(xpath = "//button[@class='btn-close']") WebElement termspopupcross;
	
	@FindBy(xpath = "//button[normalize-space()='Continue']") WebElement continuebtn;
	
	public void myaccountdropdown() {
		myAccountDropdown.click();
	}
	
	public void dropdown_registration_Option() {
		dropdown_registeroption.click();
	}
	
	public void first_name(String fstnm) {
		firstname.sendKeys(fstnm);
	}
	
	public void last_name(String lstnm) {
		lastname.sendKeys(lstnm);
	}
	
	public void email_regi(String emailrg) {
		email.sendKeys(emailrg);
	}
	
	public void passwordregi(String passrg) {
		password_regi.sendKeys(passrg);
	}
	
	public void radionews() {
		if(radio_news_no.isSelected())
		{
			System.out.println("Radio button no is selected");
		}
	}
	
	public void radionewsyes() {
		if(radio_news_yes.isSelected())
		{
			System.out.println("Radio button yes is selected");
		}
		else
		{
			radio_news_yes.click();
		}
	}
	
	public void termscheckbox() {
		terms_checkbox.click();
	}
	
	public void terms_link() {
		termslink.click();
	}
	
	public void terms_popup_cross() {
		termspopupcross.click();
	}
	
	//@Test(priority=1)
	public void contnue_btn() {
		continuebtn.click();
		
		//Assert.assertEquals(driver.getTitle(), "Your Store");
	}

}
