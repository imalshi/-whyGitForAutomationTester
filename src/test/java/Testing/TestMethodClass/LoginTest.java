package Testing.TestMethodClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import Testing.pageObjectClass.AdminPage;
import Testing.pageObjectClass.DashboardPage;
import Testing.pageObjectClass.LandingPage;

public class LoginTest {

	WebDriver driver;
	ExtentReports extent;
	
	@BeforeClass
	public void setUp() {
		
		driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
	}
	
	
	
	@Test(priority=1)
	
	public void testLogin() {
		
		
		LandingPage lp= new LandingPage(driver);
		lp.loginApplication("Admin", "admin123");
		
		Assert.assertEquals(driver.getTitle(), "OrangeHRM");
		
		
	}
	
	@Test(priority=2)
	
	public void dashbordlogin() {
		
		DashboardPage dp = new DashboardPage(driver);
		dp.moveToAdminbtn();
		
	}
	
	@Test(priority=3)
	
	public void AdminSearch() {
		
		AdminPage ap = new AdminPage(driver);
		ap.setUsername("Admin");
		
	}
	
	
	
	@AfterClass
	public void tearDown() {
		
		//driver.quit();
		
	}
	
}
