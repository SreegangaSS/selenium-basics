package secondweek;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ActionClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver =new ChromeDriver();
		driver.get("https://selenium.qabible.in/drag-drop.php");
		   driver.manage().window().maximize();
		   
		   WebElement draggable=driver.findElement(By.xpath("//span[text()='Draggable n°1']"));
		   System.out.println(draggable.getText());
		   Actions actions=new Actions(driver);
		   actions.moveToElement(draggable).click();
		   //actions.moveToElement(draggable).build().perform();
		   actions.doubleClick(draggable).perform();
		   actions.contextClick(draggable).perform();
		   WebElement destination=driver.findElement(By.xpath("//div[@id='mydropzone']"));
		   actions.dragAndDrop(draggable, destination).build().perform();
	}

}
