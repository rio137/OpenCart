package opencartTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MainClass {
	
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();  // maximizes the window size
		
		driver.get("https://demo.opencart.com/index.php?route=common/home&language=en-gb");  //opens the link of the website
		
		//regiPage(); // function call for registration page
		
		//loginpage();
		
		yourstorepage();
		
		monitor();

	}
	
	
	public static void regiPage() throws InterruptedException {
		
		
		 RegisterPage registerpage = new RegisterPage(driver);
			
			registerpage.myaccountdropdown();
			
			Thread.sleep(2000);
			registerpage.dropdown_registration_Option();
			
			Thread.sleep(2000);
			registerpage.first_name("Fuad");
			
			Thread.sleep(2000);
			registerpage.last_name("Chowdhury");
			
			Thread.sleep(2000);
			registerpage.email_regi("fuadaust007@gmail.com");
			
			Thread.sleep(2000);
			registerpage.passwordregi("fcf16202");
			
			Thread.sleep(2000);
			registerpage.radionews();
			
			Thread.sleep(2000);
			registerpage.radionewsyes();
			
			Thread.sleep(2000);
			registerpage.termscheckbox();
			
			Thread.sleep(2000);
			registerpage.terms_link();
			
			Thread.sleep(2000);
			registerpage.terms_popup_cross();
			
			Thread.sleep(2000);
			registerpage.contnue_btn();
			
			//driver.quit();
			
	    }
	
	
	
	public static void loginpage() throws InterruptedException {
		LoginPage logpg = new LoginPage(driver);
		
		//driver.get("https://demo.opencart.com/index.php?route=common/home&language=en-gb");
		
		logpg.myaccountdropdown();
		
		Thread.sleep(2000);
		
		logpg.dropdown_login_Option();
		
		Thread.sleep(2000);
			
		logpg.loginemail("fuadaust007@gmail.com");
		
		Thread.sleep(2000);
		logpg.fortgot_pass();
		
		Thread.sleep(2000);
		driver.navigate().back();
		
		Thread.sleep(2000);
		logpg.loginpassword("fcf16202");
		
		Thread.sleep(2000);
		logpg.login_btn();
		
	    }
	
	
	
	public static void yourstorepage() throws InterruptedException {
		YourStore yourstore = new YourStore(driver);
		yourstore.searchyourstore("imac");
		
		Thread.sleep(2000);
		yourstore.searchicon();
		
		Thread.sleep(2000);
		driver.navigate().back();
		
		
		Thread.sleep(2000);
		yourstore.componentsNavbar();
		
		Thread.sleep(2000);
		yourstore.componentsubmenumonitor();
		Thread.sleep(2000);
	    }
	
	
	public static void monitor() throws InterruptedException {
		Monitors monitors = new Monitors(driver);
		monitors.list_view_btn();
		
		Thread.sleep(2000);
		
		monitors.grid_view_btn();
		
		Thread.sleep(2000);
		monitors.limitation();
	    }

}
