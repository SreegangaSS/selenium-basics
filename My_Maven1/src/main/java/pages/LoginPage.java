package pages;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage {
	public WebDriver driver;

	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);// page factory declaration
	}
	
	@FindBy(xpath="//input[@placeholder='Username']") WebElement username;
	@FindBy(xpath="//input[@placeholder='Password']") WebElement password;
	@FindBy(xpath="//button[@type='submit']")WebElement clickbutton;
	
	public void anotherurl()
	{
		driver.navigate().to("https://webdriveruniversity.com/Login-Portal/index.html");
	}
	
	public void usernamefield()
	{
		//WebDriverWait wait=new WebDriverWait(driver ,Duration.ofSeconds(30));
		//wait.until(ExpectedConditions.visibilityOf(username));
		//JavascriptExecutor js = (JavascriptExecutor) driver;
		
		username.sendKeys("hii");
	}
	public void password()
	{
		password.sendKeys("hii");
	}
	public void button()
	{
		clickbutton.click();
	}
	
}
