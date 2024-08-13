package Testing.pageObjectClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
	
	WebDriver driver;
	
	//initializing driver
	public LandingPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements( driver, this);
	}
	
	
	//define locators using page factory design pattern
	
	@FindBy(xpath="//input[@placeholder='Username']")
	public WebElement userName;
	
	@FindBy(xpath="//input[@placeholder='Password']")
	public WebElement password;
	
	@FindBy(css="button[type='submit']")
	public WebElement LoginBtn;
	
	
	
	//Action Methods
	public void loginApplication(String user,String pwd) {
		
		userName.sendKeys(user);
		password.sendKeys(pwd);
		LoginBtn.click();
		
	}
	
	/*public void setUserName(String user) {
		
		userName.sendKeys(user);
		
	}
	
	public void setPassword(String pwd) {
		
		password.sendKeys(pwd);
		
	}
	
	public void clickLogin() {
		
		LoginBtn.click();
		
	}*/
	
	
	
	
	
	

}
