package project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage {
	WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
	}WebElement username=driver.findElement(By.xpath("//input[@placeholder='Username']"));
	
	 @FindBy(xpath="//input[@placeholder='Password']") WebElement usernam;
	  
	  WebElement submit=driver.findElement(By.xpath("//button[@type='submit']"));
	 
	
	public void enterUserName(String username) {
		//usernameField.s
	}

}
