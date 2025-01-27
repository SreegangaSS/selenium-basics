package secondweek;


import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload1  {
	public static void main(String[]rags) throws AWTException
	{
	WebDriver driver=new ChromeDriver();
	driver.navigate().to("https://www.ilovepdf.com/pdf_to_word");
	WebElement chooseFile=driver.findElement(By.xpath("//a[@id='pickfiles']"));
	chooseFile.click();
	StringSelection s = new StringSelection("C:\\Users\\HP\\Downloads\\Sarojini (2).pdf");
      // Clipboard copy
      Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s,null);
     // chooseFile.click();
      
  // Robot object creation
      Robot r = new Robot();
      //pressing enter
      r.delay(2500);
      //r.keyPress(KeyEvent.VK_ENTER);
      //releasing enter
      //r.keyRelease(KeyEvent.VK_ENTER);
      //pressing ctrl+v
      r.keyPress(KeyEvent.VK_CONTROL);
      r.keyPress(KeyEvent.VK_V);
      //releasing ctrl+v
      r.keyRelease(KeyEvent.VK_CONTROL);
      r.keyRelease(KeyEvent.VK_V);
      //pressing enter
      r.keyPress(KeyEvent.VK_ENTER);
      //releasing enter
      r.keyRelease(KeyEvent.VK_ENTER);
    
      
      
	}
}
