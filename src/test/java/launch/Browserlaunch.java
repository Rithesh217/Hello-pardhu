package launch;

import java.util.Date;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Browserlaunch {


	@BeforeMethod
	public static void launchbrowser() {
		System.out.println("launchbrowser");
	}
	@AfterMethod
	public static void endbrowser() {
		System.out.println("endbrowser");
	}
	@BeforeClass
	public static void startdate() {
		Date d=new Date();
		System.out.println("start date="+d);
		
	}
	@AfterClass
	public static void enddate() {
		Date d =new Date();
		System.out.println("enddate="+d);
		
	}
	@Test
	public static void tc1() {
		System.out.println("test 1");
	}
	@Test
	public static void tc3() {
		System.out.println("test 3");
	}
	@Test
	public static void tc2() {
		System.out.println("test 2");
	}

}
