package Testing.pageObjectClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AdminPage {
	
	WebDriver driver;
	
	
	public AdminPage(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver,this);
	}
	
	
	//define locators
	@FindBy(xpath="(//input[@class='oxd-input oxd-input--active'])[2]")
	public WebElement txtbox;
	
	
	
	//Action methods
	public void setUsername(String uName) {
		
		txtbox.sendKeys(uName);
		
	}

}
