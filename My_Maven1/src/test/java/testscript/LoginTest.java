package testscript;

import org.testng.annotations.Test;

import pages.LoginPage;

public class LoginTest extends Base {
  @Test
  public void verifymethod() {
	  LoginPage login=new LoginPage(driver);
	  //login.login();
	  login.anotherurl();
	  login.usernamefield();
	  login.password();
	  login.button();
  }
}
