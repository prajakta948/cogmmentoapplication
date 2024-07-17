package BaseLayer;



	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WindowType;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class driverclose {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
	WebDriver driver=new ChromeDriver();
	driver.switchTo().newWindow(WindowType.WINDOW);
	driver.get("https://www.whatsapp.com/");

	//driver.switchTo().newWindow(WindowType.WINDOW);
	//driver.navigate().to("https://www.google.com/");
	
	driver.switchTo().newWindow(WindowType.WINDOW);
	driver.navigate().to("https://www.facebook.com/");
	
	driver.switchTo().newWindow(WindowType.WINDOW);
	driver.navigate().to("https://www.amazon.com/");
	
	driver.switchTo().newWindow(WindowType.TAB);
	driver.get("https://www.flipkart.com/");
	//String parent=driver.getWindowHandle();
	
	for(String child:driver.getWindowHandles()) {
		String title=driver.switchTo().window(child).getTitle();
	
	if(title.equals("facebook"))
	{
		driver.close();
	}
	}
	//driver.navigate().forward();
	//driver.close();
		}
	}
	
	
