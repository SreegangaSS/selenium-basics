package project;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;

public class Login extends Base {
  @Test
  public void loginPage() {
	  
	  
	  WebElement dashboard=driver.findElement(By.xpath("//p[text()='Dashboard']"));
	  boolean ishomePageIsAvailable=dashboard.isDisplayed();
	  assertTrue(ishomePageIsAvailable,"error messgae");
	  
	  
  }
  

}
