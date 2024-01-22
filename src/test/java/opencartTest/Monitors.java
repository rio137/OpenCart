package opencartTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Monitors {

	
	WebDriver driver;


	//constructor
	Monitors(WebDriver d)
		{
			driver = d;
			
			//this method will create web elements
			PageFactory.initElements(driver, this);
		}
	
	@FindBy(id = "button-list") WebElement listviewbtn;
	
	@FindBy(id = "button-grid") WebElement gridviewbtn;
	
	@FindBy(xpath = "//body/main/div[@id='product-category']/div[@class='row']/div[@id='content']/div[@id='product-list']/div[1]/form[1]/div[1]") WebElement gridviewcard;
	
	@FindBy(xpath = "//body/main/div[@id='product-category']/div[@class='row']/div[@id='content']/div[@id='product-list']/div[1]/form[1]/div[1]/div[2]") WebElement listviewcard;
	
	@FindBy(id = "input-limit") WebElement limit;
	
	
	public void list_view_btn() {
		listviewbtn.click();
		if(listviewcard.isDisplayed())
		{
			System.out.println("Test passed");
		}
		else {
			System.out.println("Test Failed");
		}
	}
	
	public void grid_view_btn() {
		gridviewbtn.click();
		if(gridviewcard.isDisplayed())
		{
			System.out.println("Test passed");
		}
		else {
			System.out.println("Test Failed");
		}
	}
	
	
	public void limitation() {
		Select limit_dropdown = new Select(limit);
		limit_dropdown.selectByIndex(1);
		
		
		WebElement selectedOption_limit = limit_dropdown.getFirstSelectedOption();
		//System.out.println("The item is: "+selectedOption_limit.getText());
		String twentyfive = selectedOption_limit.getText();
		if(twentyfive.equalsIgnoreCase("25"))
		{
			System.out.println("Item 25 is selected");
		}
		
		else
		{
			System.out.println("Item 25 is not selected");
		}
	}
}
