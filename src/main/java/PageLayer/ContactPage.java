package PageLayer;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import static UtilsLayer.UtilsClass.*;
import BaseLayer.BaseClass;

public class ContactPage extends BaseClass{

	@FindBy(xpath="//a[@href='/contacts']")
	private WebElement contactLink;
	
	@FindBy(xpath="//a[@href='/contacts/new']")
	private WebElement createBtn;
	
	@FindBy(name="first_name")
	private WebElement fname;
	
	@FindBy(name="last_name")
	private WebElement lname;
	
	@FindBy(name="middle_name")
	private WebElement mname;
	
	@FindBy(xpath="(//input[@name='value'])[1]")
	private WebElement email;
	
	@FindBy(name="status")
	private WebElement status;
	
	@FindBy(xpath="//div[@name='status']/span")
	private List<WebElement> statusList;
	
	@FindBy(name="channel_type")
	private WebElement socialChannel;
	
	@FindBy(xpath="(//div[@class='visible menu transition'])/div/span")
	private List<WebElement> socialChannelList;
	
	@FindBy(xpath="//label[text()='Phone']/following::div[1]//div[@name='hint']")
	private WebElement phoneClick;
	
	@FindBy(xpath="//label[text()='Phone']/following::div[1]//div[@role='option']/span")
	private List<WebElement> phonelist;
	
	@FindBy(xpath="//button[text()='Save']")
	private WebElement saveBtn;
	
	public ContactPage()
	{
		PageFactory.initElements(driver,this);
	}
	
	public void contactLinkFunctionality()
	{
		click(contactLink);
	}
	public void createBtnFunctionality()
	{
		click(createBtn);
	}
	public void contactPageFunctionality(String firstname,String lastname,String middlename,String Email,
			String Option,String channelOption)
	{
		sendKeys(fname, firstname);
		sendKeys(lname, lastname);
		sendKeys(mname, middlename);
		sendKeys(email, Email);
		click(status);
		selectFromMultiple(statusList, Option);
		click(socialChannel);
		selectFromMultiple(socialChannelList, channelOption);
		
	}
	public void saveBtnFunctionality()
	{
		click(saveBtn);
	}
	
	@FindBy(xpath="//button[@class='ui button icon']")
	private WebElement deleteBtn;
	
	@FindBy(xpath="//button[@class='ui red button']")
	private WebElement confirmDelete;
	
	public void deleteUserFunctionality()
	{
		click(deleteBtn);
		click(confirmDelete);
	}
	public String getCurrentUrl()
	{
		return driver.getCurrentUrl();
		
	}
	
}










