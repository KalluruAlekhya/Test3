package Pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
public class LoginPage extends BasePage {
	@FindBy(xpath="//input[@name='username']")
	private WebElement textUsername;
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement textPassword;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement btnClick;
	public void enterUsername(String str)
	{
		textUsername.sendKeys(str);
	}
	public void enterPassword(String str)
	{
		textPassword.sendKeys(str);
	}
	public void clickLogin()
	{
		btnClick.click();
	}
	
		
	}
	
	
