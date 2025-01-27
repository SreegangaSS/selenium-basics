package secondweek;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stubWebDriver driver =new ChromeDriver();
		WebDriver driver =new ChromeDriver();
		driver.get("https://selenium.qabible.in/simple-form-demo.php");
		   driver.manage().window().maximize();
		   List<WebElement> element=driver.findElements(By.xpath("//input[@type='text']"));
		   for(WebElement option:element)
		   {
			 option.sendKeys("hii");
		   }
	}

}
