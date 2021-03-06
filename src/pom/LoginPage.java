package pom;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	@FindBy(name="username")
	private WebElement unTB;
	@FindBy(name="pwd")
	private WebElement pwTB;
	@FindBy(id="loginButton")
	private WebElement loginBTN;
	
	public LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void setUserName(String un)
	{
		unTB.sendKeys(un);
	}
	public void setPassword(String pw)
	{
		pwTB.sendKeys(pw);
	}
	public void ClearunANDpas()
	{
		unTB.sendKeys(Keys.CONTROL+"a"+Keys.DELETE);
		pwTB.sendKeys(Keys.CONTROL+"a"+Keys.DELETE);
	}
	public void clicklogin()
	{
		loginBTN.click();
	}

}
