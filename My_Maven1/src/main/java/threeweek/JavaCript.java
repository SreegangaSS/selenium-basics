package threeweek;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaCript {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.in/");
		   driver.manage().window().maximize();
		   JavascriptExecutor js = (JavascriptExecutor) driver;  
			js.executeScript("window.scrollBy(0,550)","");
			//js.executeScript("window.scrollBy(0,-100)", "");
			//js.executeScript("window.scrollBy(0,document.body.scrollHeight)", "");
			WebElement checkBoxDemo=driver.findElement(By.id("nav-search-submit-button"));
			js.executeScript("arguments[0].click();",checkBoxDemo);
			checkBoxDemo.click();
		// java script send keys
	}

}
