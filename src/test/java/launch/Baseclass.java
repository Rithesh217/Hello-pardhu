package launch;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.swing.text.html.parser.Element;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {

	public static WebDriver driver;
	public static Actions ac;

	public static void browserlaunchchrome() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	public static void toloadurl(String url) {
		driver.get(url);
		

	}

	public static void toType(WebElement element, String value) {
		element.sendKeys(value);
	}

	public static void toclick(WebElement element) {
		element.click();
	}

	public static String togeturl() {
		String url = driver.getCurrentUrl();
		System.out.println(url);
		return url;
		
	}

	public static String togettitle() {
		String title = driver.getTitle();
		System.out.println(title);
		return title;
	}

	public static void tomax() {
		driver.manage().window().maximize();
	}

	public static void todraganddrop(WebElement src, WebElement dest) {
		ac = new Actions(driver);
		ac.dragAndDrop(src, dest).perform();
	}

	public static void tomousehover(WebElement element) {
		ac = new Actions(driver);
		ac.moveToElement(element).perform();
	}
	public static void todoubleclick() {
		ac=new Actions(driver);
		ac.doubleClick().perform();
		
	}
	 
		 public static void  movetoelement(WebElement element) {
		ac=new Actions(driver);
		ac.moveToElement(element).perform();
		
	}
	public static void sendkeys() {
		driver.close();
		
	}
	
		public static String getstringcellvalue() {
			String value = getstringcellvalue();
			System.out.println("value");
		     return value;
			
		}
		public static String getphysicalnumberofrows() {
			String value=getphysicalnumberofrows();
			return value;
			
			
		}
		public static String getphysicalnumberofcells() {
          String v2 = getphysicalnumberofcells();
			return v2;
			
		}
		 public static void getcell() {
			  ac=new Actions(driver);
			  driver.close();
		 }
                              		 
		 public static void contextclick (WebElement element) {
			 ac=new Actions(driver);
			 ac.contextClick(element).perform();
		 }
		 public static void keyup(WebElement element) {
			 ac=new Actions(driver);
			 ac.keyUp(element, null).perform();
			 
		 }
		 
		 public static void keydown(WebElement element) {
			 ac=new Actions(driver);
			 ac.keyDown(element,null).perform();
		 }
		 
		 public static String getlocation() {
			 String l=getlocation();
			 return l;
		 }
			 
			 public static void getscreenshots(WebDriver driver,String location) throws IOException {
				 TakesScreenshot tk=(TakesScreenshot) driver;
				 java.io.File source =tk.getScreenshotAs(OutputType.FILE);
				 java.io.File target=new java.io.File((location));
				 FileUtils.copyFile(source, target);
			 }
			  		
			 public static void getwindowshandle() {
				 String g = driver.getWindowHandle();
				 System.out.println(g);
			 }
			 public static void getwindowshandles() {
				 driver.getWindowHandles();
				 List<Element>li=new ArrayList<Element>();
				 li.addAll(li);
				 }
			 
				 public static String gettext() {
					String text= gettext();
					 System.out.println(text);
					return text;
				 }
				 public static void elementselectionstatetobe() {
					 driver.findElement(By.xpath(null));
				 }
//				 public static void presskey() throws AWTException {
//					 r = new Robot();
//					 r.keyPress(KeyEvent.VK_CONTROL);
//					 r.keyPress(KeyEvent.VK_C);
//					 r.keyRelease(KeyEvent.VK_CONTROL);
//					 r.keyRelease(KeyEvent.VK_C);
//					 }
				 public static void rightclick(WebDriver driver,WebElement element) {
					 Actions actions=new Actions(driver);
					 actions.contextClick(element).perform();
				 }
				 public static void doubleclick(WebDriver driver,WebElement element) {
					 Actions actions=new Actions(driver);
					 actions.doubleClick(element).perform();
				 }
				 public static void alertaccept(WebDriver driver) {
					 Alert alert=driver.switchTo().alert();
					 alert.accept();
				 }
				 public static void alertgettext(WebDriver driver) {
					 Alert alert=driver.switchTo().alert();
					 alert.getText();
				 }
				 public static void alertDismiss(WebDriver driver) {
					 Alert alert=driver.switchTo().alert();
					 alert.dismiss();
				 }
				 public static void alertsendkeys(WebDriver driver,String date) {
					 Alert alert=driver.switchTo().alert();
					 alert.sendKeys(date);
				 }
}
