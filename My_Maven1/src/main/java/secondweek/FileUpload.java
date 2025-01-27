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

public class FileUpload {

	public static void main(String[] args) throws AWTException // (Abstract Window Toolkit)
	{
		WebDriver driver = new ChromeDriver();
	/*driver.get("https://the-internet.herokuapp.com/upload");
		driver.manage().window().maximize();

		WebElement chooseFile = driver.findElement(By.id("file-upload"));
		 chooseFile.click();
		chooseFile.sendKeys("C:\\Users\\HP\\Downloads\\AUTOMATION TESTING (2).pdf");*/
		
		driver.navigate().to("https://www.ilovepdf.com/pdf_to_word");
		WebElement chooseFile=driver.findElement(By.xpath("//span[text()='Select PDF file']"));
		chooseFile.click();
		StringSelection s = new StringSelection("C:\\Users\\HP\\Downloads\\AUTOMATION TESTING.pdf");
	      // Clipboard copy
	      Toolkit.getDefaultToolkit().getSystemClipboard().setContents(s,null); //cpaste to clipboard
	     
	      
	  // Robot object creation
	      Robot r = new Robot();
	      //pressing enter
	      // r.delay(10);
	      r.keyPress(KeyEvent.VK_ENTER);
	      //releasing enter
	      r.keyRelease(KeyEvent.VK_ENTER);
	      //pressing ctrl+v
	      r.keyPress(KeyEvent.VK_CONTROL);//two commands for pate
	      r.keyPress(KeyEvent.VK_V);//two
	      //releasing ctrl+v
	      
	      r.keyRelease(KeyEvent.VK_CONTROL);//release command
	      r.keyRelease(KeyEvent.VK_V);
	      //pressing enter
	      r.keyPress(KeyEvent.VK_ENTER);
	      //releasing enter
	      r.delay(90);
	      r.keyRelease(KeyEvent.VK_ENTER);

		
	}

}
