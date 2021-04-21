package launch;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browser  {

	WebDriver driver;
	
	@BeforeMethod
	private void browser() {
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
		txtuser.sendKeys("anu@gmail.com");
		WebElement txtpass=driver.findElement(By.name("pass"));
		txtpass.sendKeys("55555");
		WebElement btnlogin=driver.findElement(By.name("login"));
		btnlogin.click();
		
					}
	
	@Test (enabled=false)
	private void tc5() {
		WebElement
		txtuser=driver.findElement(By.name("email"));
		txtuser.sendKeys("raj@gmail.com");
		WebElement txtpass = driver.findElement(By.name("pass"));
		txtpass.sendKeys("11111");
		WebElement btnlogin =driver.findElement(By.name("login"));
		btnlogin.click();
			}
	
	@Test
	private void tc6() {
	WebElement txtuser=driver.findElement(By.name("email"));
	txtuser.sendKeys("Arun@gmail.com");
	WebElement txtpass=driver.findElement(By.name("pass"));
	txtpass.sendKeys("22222");
	WebElement btnlogin =driver.findElement(By.name("login"));
	btnlogin.click();
}
}
