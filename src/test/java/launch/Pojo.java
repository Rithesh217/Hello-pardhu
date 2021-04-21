package launch;

import java.sql.Driver;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pojo  extends Baseclass{

	public  Pojo() {
		
		PageFactory.initElements(driver,this);
	}
		@FindBy(name="username")
		private WebElement txtuser;
	
	@FindBy(id="password")
	private WebElement txtpass;
	@FindBy(id="login")
		private WebElement btnlogin;
	@FindBy (id="location")
	private WebElement txtloc;
	@FindBy(id="hotels")
	private WebElement txthot;
	@FindBy(id="room_type")
	private WebElement txtrom;
	
	
	
	
	
	
	public WebElement getTxtloc() {
		return txtloc;
	}
	public WebElement getTxthot() {
		return txthot;
	}
	public WebElement getTxtrom() {
		return txtrom;
	}
	public WebElement getTxtuser() {
		return txtuser;
	}
	public WebElement getTxtpass() {
		return txtpass;
	}
	public WebElement getBtnlogin() {
		return btnlogin;
	}
	
		
		
	}

