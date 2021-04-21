package launch;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;


import io.github.bonigarcia.wdm.WebDriverManager;

public class Credentials {
WebDriver driver;

	@DataProvider(name="credentials")
	private Object[][]datas(){
		return new Object[][] {{"Purna@gmail.com","1234"},{"santhosh@gmail.com","5678"},{"srinu@gmail.com","1716"}};
	}
	@BeforeMethod
	private void launchbrowser() {
		WebDriverManager.chromedriver().setup();
		driver =new ChromeDriver();
		driver.get("https://www.facebook.com");
	}
	
	@AfterMethod
	private void quitbrowser() {
		driver.quit();
	}
	

	@Test(dataProvider="credentials")
	
	private void tc1 (String username,String pass) {
	WebElement txtuser=driver.findElement(By.name("email"));
	txtuser.sendKeys("name");
	WebElement txtpass=driver.findElement(By.name("pass"));
	txtpass.sendKeys("pass");
	WebElement btnlogin=driver.findElement(By.name("login"));
	btnlogin.click();
	
	}
	
}
	
	
	


