package PageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseLayer.BaseClass;

public class HomePage extends BaseClass {

	@FindBy(xpath="//div[@class='header item']")
	private WebElement homepageLogo;
	
	public HomePage()
	{
		PageFactory.initElements(driver,this);
	}
	
	public boolean homePageLogoStatus()
	{
		return homepageLogo.isDisplayed();
	}
	
	public String getTitle()
	{
		return driver.getTitle();
	}
	
	public String getCurrenturl()
	{
		return driver.getCurrentUrl();
	}
	
}
