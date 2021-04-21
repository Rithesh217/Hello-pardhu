package launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Equalsall {
	WebDriver driver;
	

	@BeforeMethod
	private void equalsall() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
	}
	@AfterMethod
	private void quitbrowser() {
		driver.quit();
	}
	
	@Test
	private void tc4() {
		WebElement txtuser=driver.findElement(By.name("email"));
		txtuser.sendKeys("purna@gmail.com");
		String text = txtuser.getAttribute("value");
		SoftAssert s=new SoftAssert();
		s.assertTrue(false);
		s.assertEquals("java", text);
		s.assertAll();
		WebElement txtpass=driver.findElement(By.name("pass"));
		txtpass.sendKeys("22222");
		WebElement btnlogin=driver.findElement(By.name("login"));
		btnlogin.click();
		
				
	}
	
	

}
