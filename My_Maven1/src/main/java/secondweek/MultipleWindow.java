package secondweek;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindow {
	

	public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://webdriveruniversity.com/");
	WebElement cont=driver.findElement(By.xpath("//h1[text()='CONTACT US']"));
	cont.click();
	
	WebElement login=driver.findElement(By.xpath("//h1[text()='LOGIN PORTAL']"));
	login.click();
	
	String parent=driver.getWindowHandle();//parent window open
	System.out.println("pppp"+parent);
	Set<String> allWindow=driver.getWindowHandles();//all window handled
	String title="";
	for(String temp:allWindow)
	{
		if(!temp.equals(parent)) {
		System.out.println("windows"+temp);
		driver.switchTo().window(temp);
		//System.out.println(driver.getTitle()); ithukandathale
		title=driver.getTitle();
		System.out.println("**********************");
	}
	if(title.equals("WebDriver | Login Portal"))
	{
		WebElement click=driver.findElement(By.xpath("//button[@type='submit']"));
		click.click();
		
		
	}
	if(title.equals("WebDriver | Contact Us")){
		WebElement fname=driver.findElement(By.name("first_name"));
		fname.sendKeys("sree");
	}
	
	driver.switchTo().window(parent);

	}

}
}
