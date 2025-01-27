package first;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest2e extends Abcd{
	@Test
	public void showmessage()
	{
	String input="hello";
	String expected="Your Message : "+input;
	WebElement singleinputtest=driver.findElement(By.xpath("//input[@id='single-input-field']"));
singleinputtest.sendKeys(input);
WebElement button=driver.findElement(By.xpath("//button[@id='button-one']"));
button.click();
WebElement yourmessage=driver.findElement(By.xpath("//div[@id='message-one']"));
String yourmessagetext=yourmessage.getText();
System.out.println(yourmessagetext);
Assert.assertEquals(input, expected);
	}
@Test
public void showmessage1()
{
String input="hello";
String expected="Your Message : "+input;
WebElement singleinputtest=driver.findElement(By.xpath("//input[@id='single-input-field']"));
singleinputtest.sendKeys(input);
WebElement button=driver.findElement(By.xpath("//button[@id='button-one']"));
button.click();
WebElement yourmessage=driver.findElement(By.xpath("//div[@id='message-one']"));
String yourmessagetext=yourmessage.getText();
System.out.println(yourmessagetext);
assertEquals(expected,yourmessagetext,"expected and actual are not same"+input);
}
	
}
