package TestScriptss;

import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import GenricLibrary.Baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.relevantcodes.extentreports.*;
import ObjectRepository.RegisterPage;
import ObjectRepository.WelcomePage;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import fileutility.Excelutilitty;
import GenricLibrary.Baseclass;

public class RegisterTest extends Baseclass {
	@DataProvider(name = "regdata")
	public String[][] registerData() throws EncryptedDocumentException, IOException{
		return Excelutilitty.readExcelData("register");
	}
	
	
	@Test(dataProvider = "regdata")
	public void register_001(String firstName, String lastName, String email, String password, String confirmPassword) throws InterruptedException{
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		try {
			
		
		WelcomePage welcome=new WelcomePage(driver);
		RegisterPage register=new RegisterPage(driver);
		
		welcome.getRegisterLink().click();
		test.log(LogStatus.PASS,"clicked on Register link");
		
		register.getMaleRadioButton().click();
		test.log(LogStatus.PASS, "Selected Male Radio Button");
		
		register.getFirstname().sendKeys(firstName);
		test.log(LogStatus.PASS, "Entered First Name: " + firstName);
		
		register.getLastname().sendKeys(lastName);
		test.log(LogStatus.PASS, "Entered Last Name: " + lastName);
		
		register.getEmail().sendKeys(email);
		test.log(LogStatus.PASS, "Entered Email: " + email);
		
		register.getPassword().sendKeys(password);
		test.log(LogStatus.PASS, "Entered Password");
		
		register.getConfirmpassword().sendKeys(confirmPassword);
		test.log(LogStatus.PASS, "Entered Confirm Password");
		register.getRegisterbutton().click();
		test.log(LogStatus.PASS, "Clicked on Register Button");
		
	}catch(Exception e) {
		test.log(LogStatus.FAIL, "Test Failed: " + e.getMessage());
		
	}
		finally {
			driver.quit();
		}
	}
	

}
