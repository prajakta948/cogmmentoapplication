package UtilsLayer;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import BaseLayer.BaseClass;

public class UtilsClass extends BaseClass{

	public static void click(WebElement wb)
	{
		if(wb.isDisplayed()&& wb.isEnabled())
		{
			wb.click();
		}
	}
	
	public static void sendKeys(WebElement wb,String value)
	{
		if(wb.isDisplayed()&& wb.isEnabled())
		{
			wb.sendKeys(value);
		}
		
	}
	public static void selectFromMultiple(List<WebElement>wb,String value)
	{
		for(WebElement a:wb)
		{
			if(a.getText().equalsIgnoreCase(value))
			{
				a.click();
				break;
			}
		}
	}

	public static void drawborder(WebElement logo, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}

	public static void clickElementbyJs(WebElement wb, WebDriver driver) {
		// TODO Auto-generated method stub
		
	}
	
	
}
