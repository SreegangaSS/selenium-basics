package first;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Abcd {
	public WebDriver driver;
	@BeforeMethod
	public void intlializeBrowser()
	{
		driver =new ChromeDriver();//loading the driver
		driver.get("hthttps://selenium.qabible.in/index.php");//launching the URL
		driver.manage().window().maximize();
	}
	@AfterMethod
	public void driverQuit()
	{
		driver.close();
	
	//driver.quit();
	}

}
