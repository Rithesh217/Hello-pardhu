package launch;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Paramete{

	
	WebDriver driver;
	

	@BeforeMethod
	private void paramete() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		
	}
	@AfterMethod
	private void quitbrowser() {
		driver.quit();
	}
	
	@Parameters({"username","password"})
	@Test
	private void tc1(String name,String pass) {
		
		WebElement txtuser=driver.findElement(By.xpath("email"));
		txtuser.sendKeys("name");
		WebElement txtpass=driver.findElement(By.xpath("pass"));
		txtpass.sendKeys("pass");
		WebElement btnlogin=driver.findElement(By.name("login"));
		btnlogin.click();
		
	}
}
