package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static UtilsLayer.UtilsClass.*;
import BaseLayer.BaseClass;

public class LoginPage extends BaseClass{

	@FindBy(name="email")
	private WebElement username;
	
	@FindBy(name="password")
	private WebElement password;
	
	@FindBy(xpath="//div[text()='Login']")
	private WebElement loginBtn;
	
	public LoginPage()
	{
		PageFactory.initElements(driver,this);
	}
	
	public void loginFunctionality(String uname,String pass)
	{
		sendKeys(username,uname);
		sendKeys(password, pass);
		click(loginBtn);
	}
	
}
