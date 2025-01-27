package secondweek;
import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import  org.openqa.selenium.Alert;

public class AlertEx {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
//right click option posible alla alert vannal ok allegil cancel kodthale aah popup pokuvollu
WebDriver driver=new ChromeDriver();
driver.get("https://selenium.qabible.in/javascript-alert.php");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(50));//every .5 sec execution nadakkum
//execution smooth ayit nadakkan aan wait use cheyyane
//explicit wait--wait particular element



//WebElement clickMe=driver.findElement(By.xpath("//button[@Class='btn btn-success']"));
//clickMe.click();
//driver.switchTo().alert().dismiss();

//WebElement clickOk=driver.findElement(By.xpath("//button[@Class='btn btn-warning']"));
//clickOk.click();
//driver.switchTo().alert().accept();
WebDriverWait s=new WebDriverWait(driver,Duration.ofSeconds(10));
WebElement clickMessage=driver.findElement(By.xpath("//button[@Class='btn btn-danger']"));
s.until(ExpectedConditions.visibilityOf(clickMessage));

clickMessage.click();
driver.switchTo().alert().sendKeys("hello");
driver.switchTo().alert().accept();


	
	
	}

}
