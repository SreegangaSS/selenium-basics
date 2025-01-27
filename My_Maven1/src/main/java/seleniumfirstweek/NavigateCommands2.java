package seleniumfirstweek;

public class NavigateCommands2 extends Base {
	public void navigateCommands()
	{
		driver.navigate().to("https://www.amazon.in/");
		driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();
	}

	public static void main(String[] args) {
		NavigateCommands2 n=new NavigateCommands2();
		n.initializeBrowser();
		n.navigateCommands();
		n.driverQuit();

	}

}
