package secondweek;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameExample {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		/*driver.get("https://demoqa.com/frames");
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		WebElement hello = driver.findElement(By.id("frame1"));
		driver.switchTo().frame(hello);
		WebElement frames = driver.findElement(By.id("sampleHeading"));
		System.out.print(frames.getText());
		driver.switchTo().defaultContent();*/
		
		
		driver.navigate().to(" https://demo.guru99.com/test/guru99home/");
		WebElement iframe=driver.findElement(By.xpath(" //iframe[@id='a077aa5e']"));
		driver.switchTo().frame(iframe);
		WebElement frame1=driver.findElement(By.xpath("//a[@href='http://www.guru99.com/live-selenium-project.html']"));
		frame1.click();
		//WebElement img=driver.findElement(By.xpath("//img[@src='Jmeter720.png']"));
		//img.click();
		driver.switchTo().defaultContent();
		
	}

}
