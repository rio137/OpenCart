package opencartTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginPage {
	
	WebDriver driver;
	
	LoginPage(WebDriver d)
	{
		driver = d;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//span[normalize-space()='My Account']") WebElement myAccountDropdown;
	
	@FindBy(xpath = "//a[normalize-space()='Login']") WebElement dropdownlogin_option;
	
	@FindBy(id = "input-email") WebElement login_email;
	
	@FindBy(id = "input-password") WebElement login_password;
	
	@FindBy(linkText = "Forgotten Password") WebElement forgotpass;
	
	@FindBy(xpath = "//button[normalize-space()='Login']") WebElement loginbtn;
	
	public void myaccountdropdown() {
		myAccountDropdown.click();
	}
	
	public void dropdown_login_Option() {
		dropdownlogin_option.click();
	}
	
	public void loginemail(String email) {
		login_email.sendKeys(email);
	}
	
	public void loginpassword(String passwrd) {
		login_password.sendKeys(passwrd);
	}
	
	public void fortgot_pass(){
		forgotpass.click();
	
	}
	
	@Test(priority=1)
	public void login_btn(){
		loginbtn.click();
		Assert.assertEquals(driver.getTitle(), "Your Store");
	}

	

}
