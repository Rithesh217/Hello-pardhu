package launch;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Hardassert {

	WebDriver driver;
	
	@BeforeMethod
	private void hardassert() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
	}

	@AfterMethod
	private void quitbrowser() {
		driver.quit();
		
	}
	@Test
	private void tc4() {
		WebElement txtuser=driver.findElement(By.name("email"));
		txtuser.sendKeys("anu@gmail.com");
		String text = txtuser.getAttribute("value");
		Assert.assertTrue(text.contains("55555"), "to verify test 4");
		Assert.assertEquals("srinu@gmail.com", text);
		WebElement txtpass=driver.findElement(By.name("pass"));
		txtpass.sendKeys("1716");
		WebElement btnlogin =driver.findElement(By.name("login"));
		btnlogin.click();
	}
	
}
