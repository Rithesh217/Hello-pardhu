package launch;

import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Ada extends Baseclass {

	private WebElement driver;
	@BeforeClass
	public static void launchbrowser() {

		browserlaunchchrome();
		tomax();
		toloadurl("https://adactinhotelapp.com/");

		togeturl();
		togettitle();

	}
@Test
public void tc1() {
	
	Pojo p = new Pojo();
	WebElement txtuser = p.getTxtuser();
	toType(txtuser, "Rithesh1990");
	WebElement txtpass = p.getTxtpass();
	toType(txtpass, "Chandra@123");
	WebElement btnlogin = p.getBtnlogin();
	toclick(btnlogin);
	
}
@Test
public void tc2() {
	Pojo p = new Pojo();
	WebElement txtloc = p.getTxtloc();
	toType(txtloc, "New york");
	 WebElement txthot = p.getTxthot();
	 toType(txthot, "Hotel Creek");
	 WebElement txtrom = p.getTxtrom();
	 toType(txtrom, "Standard");
}


}
