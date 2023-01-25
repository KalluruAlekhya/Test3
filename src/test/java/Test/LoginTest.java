package Test;import org.testng.annotations.Test;
import GenericUtils.DriverUtils;
import Pages.AnotherLoginPage;
import Pages.LoginPage;
public class LoginTest extends BaseTest {
	@Test
	public void Login() throws InterruptedException
	{
		/*DriverUtils.getDriver().get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		LoginPage lp=new LoginPage();
		lp.enterUsername("Admin");
		lp.enterPassword("admin123");
		lp.clickLogin();*/
		
		DriverUtils.getDriver().get("https://demowebshop.tricentis.com/login");
		AnotherLoginPage lp=new AnotherLoginPage();
		lp.enterEmail("mounika.katta2001@gmail.com");
		lp.enterPassword("Kannayy@");
		lp.clickLogin();
		Thread.sleep(5000);
		
	
	}
}

	
