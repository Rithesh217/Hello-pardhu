package launch;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pojoclass extends Baseclass {
	
	
	public Pojoclass() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "email")
	private WebElement txtuser;

	@FindBy(id = "pass")
	private WebElement txtpass;

	@FindBy(xpath ="//button[text()='login']")
	private WebElement btnlogin;

	public WebElement gettxtuser() {
		return txtuser;
	}

	public WebElement gettxtpass() {
		return txtpass;
	}

	public WebElement btnlogin() {
		return btnlogin;
	}
}

		
		

