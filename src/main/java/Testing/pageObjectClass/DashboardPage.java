package Testing.pageObjectClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashboardPage {
	
	WebDriver driver;
	
	
	public DashboardPage(WebDriver driver){
		
		this.driver=driver;
		PageFactory.initElements(driver,this);
		
	}
	
	//define locators
	@FindBy(xpath="//li[1]//a[1]//span[1]")
	public WebElement Adminbtn;
	
	
	
	//Action methods
	public void moveToAdminbtn() {
		
		System.out.println(Adminbtn.getText());
		System.out.println("we are in test 2");
		Adminbtn.click();
		
		
	}

}
