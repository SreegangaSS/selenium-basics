package seleniumfirstweek;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Locators3 extends Base{
	public void locatingMethods()
	{
		//id
		//WebElement elementname=driver.findElement(By.Locator("locator value"));
	WebElement showMessageButton=driver.findElement(By.id("button-one"));
	//System.out.println(showMessageButton);
	WebElement showMessageButton1=driver.findElement(By.id("button-two"));
	WebElement showMessageButton2=driver.findElement(By.id("single-input-field"));
	WebElement showMessageButton3=driver.findElement(By.id("value-a"));
	WebElement showMessageButton4=driver.findElement(By.id("value-b"));
	//className
	WebElement showclass1=driver.findElement(By.className("header-top"));
	WebElement showclass2=driver.findElement(By.className("clearfix"));
	WebElement showclass3=driver.findElement(By.className("mb-sec"));
	WebElement showclass4=driver.findElement(By.className("navbar-brand"));
	//name
	WebElement name1=driver.findElement(By.name("viewport"));
	WebElement name2=driver.findElement(By.name("description"));
	WebElement name3=driver.findElement(By.name("keywords"));
	WebElement name4=driver.findElement(By.name("author"));
//linkText
	WebElement link1=driver.findElement(By.linkText("Simple Form Demo"));
	WebElement link2=driver.findElement(By.linkText("Checkbox Demo"));
	WebElement link3=driver.findElement(By.linkText("Radio Buttons Demo"));
	WebElement link4=driver.findElement(By.linkText("Select Input"));
	WebElement link5=driver.findElement(By.linkText("Form Submit"));
//partialLinkText
	WebElement par=driver.findElement(By.partialLinkText("Simple Form "));
	WebElement par1=driver.findElement(By.partialLinkText("Checkbox "));
	WebElement par2=driver.findElement(By.partialLinkText("Radio Buttons Demo"));
	WebElement par3=driver.findElement(By.partialLinkText("Select Input"));
	WebElement par4=driver.findElement(By.partialLinkText("Ajax Form "));


	
	}
	public static void main(String[] args) 
	{
		Locators3 Locators =new Locators3();
		Locators.initializeBrowser();
		Locators.locatingMethods();
		Locators.driverQuit();
	}

}
