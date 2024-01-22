package opencartTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class YourStore {
	
	WebDriver driver;


	//constructor
	YourStore(WebDriver d)
		{
			driver = d;
			
			//this method will create web elements
			PageFactory.initElements(driver, this);
		}
	
	@FindBy(name = "search") WebElement search_yourstore;
	
	@FindBy(xpath = "//button[@class='btn btn-light btn-lg']") WebElement search_icon;
	
	@FindBy(xpath = "//a[normalize-space()='Components']") WebElement components_navbar;
	
	@FindBy(xpath = "//a[normalize-space()='Monitors (2)']") WebElement components_submenu_monitor;
	
	public void searchyourstore(String searchelements) {
		search_yourstore.sendKeys(searchelements);
	}
	
	public void searchicon() {
		search_icon.click();
	}
	
	public void componentsNavbar() {
		
		Actions component_mousehover_actions = new Actions(driver);

        // Perform the mouse hover action
		component_mousehover_actions.moveToElement(components_navbar).perform();
	}
	
	public void componentsubmenumonitor() {
		components_submenu_monitor.click();
		
		//assert get title here
	}

}
