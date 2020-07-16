package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_page {
	
	@FindBy(id = "username")
	private WebElement untbox;
	
	@FindBy(name = "pwd")
	private WebElement pwdbox;
	
	@FindBy(xpath = "//div[.='Login ']")
	private WebElement login;
	
	public Login_page(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	public void setUsername(String un)
	{
		untbox.sendKeys("un");
	}
	
	public void setpwd(String pwd)
	{
		pwdbox.sendKeys("pwd");
	}
	
	public void loginbutton()
	{
	      login.click();
	}



}
