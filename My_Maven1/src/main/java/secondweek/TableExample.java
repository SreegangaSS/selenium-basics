package secondweek;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import seleniumfirstweek.Base;

public class TableExample extends Base{

	public void fullTable()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement table=driver.findElement(By.xpath("//table[@id='dtBasicExample']"));
		System.out.println(table.getText());
	}
	public void selectRow()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement table=driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr[1]"));//any wil get
		System.out.println(table.getText());
	}
	public void selectPartElemet()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		WebElement table=driver.findElement(By.xpath("//table[@id='dtBasicExample']/tbody/tr[1]/td[1]"));
		System.out.println(table.getText());	
	}
	public void list()
	{
		driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
		List<WebElement> table=driver.findElements(By.xpath("//table[@id='dtBasicExample']/tbody/tr/td[4]"));
		for(WebElement element:table)
		{
			System.out.println(element.getText());
		}
	}
		public void elementSearch()
		{
			String input="Ashton Cox";
			driver.navigate().to("https://selenium.qabible.in/table-pagination.php");
			List<WebElement> table=driver.findElements(By.xpath("//table[@id='dtBasicExample']/tbody/tr/td[1]"));
			for(WebElement element:table)
			{
			if(element.getText().equals(input))
			{
				System.out.println(element.getText());
				
			}
			}
		}
	

	public static void main(String[] args)
	{
		TableExample o=new TableExample();
		o.initializeBrowser();
		o.fullTable();
		System.out.println("---------------------");
		o.selectRow();
		System.out.println("---------------------");
		o.selectPartElemet();
		System.out.println("---------------------");
		o.list();
		System.out.println("---------------------");
		o.elementSearch();
	}

}
