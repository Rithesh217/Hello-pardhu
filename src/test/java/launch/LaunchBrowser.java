package launch;



import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;



public class LaunchBrowser extends Baseclass {

	
	

	@BeforeMethod
	private void launch() {
	browserlaunchchrome();
	toloadurl("https://www.facebook.com");

	}
	
	@AfterMethod
	private void quitbrowser() {
		driver.quit();
		
	}
	@Test
	private void tc1() {
		
		tomax();
		String url = togeturl();
		System.out.println(url);
		String tit = togettitle();
		System.out.println(tit);

				
		WebElement txtuser =driver.findElement(By.name("email"));
		txtuser.sendKeys("Purna@gmail.com");
		WebElement txtpass = driver.findElement(By.name("pass"));
		txtpass.sendKeys("1234");
		WebElement btnlogin =driver.findElement(By.name("login"));
		btnlogin.click();
		
		
		}

	@Test(invocationCount=3)
	private void tc3() {
		WebElement txtuser=driver.findElement(By.name("email"));
		txtuser.sendKeys("santhosh@gmail.com");
		WebElement txtpass =driver.findElement(By.name("pass"));
		txtpass.sendKeys("5678");
		WebElement btnlogin=driver.findElement(By.name("login"));
		btnlogin.click();
		}
	
	@Test
	private void tc2() {
		WebElement txtuser=driver.findElement(By.name("email"));
		txtuser.sendKeys("srinu@gmail.com");
		WebElement txtpass =driver.findElement(By.name("pass"));
		txtpass.sendKeys("1716");
		WebElement btnlogin =driver.findElement(By.name("login"));
		btnlogin.click();
		
					}
}

