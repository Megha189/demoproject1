package pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Reporter;

public class EnterTimeTrackPage {
	@FindBy(xpath="//div[text()='Tasks']")
	private WebElement tasLNK;
	@FindBy(xpath="//div[text()='Time-Track']")
	private WebElement timetrackLNK;
	@FindBy(xpath="//div[text()='Reports']")
	private WebElement reportsLNK;
	@FindBy(xpath="//div[text()='Users']")
	private WebElement userLNK;
	@FindBy(xpath="//div[text()='Work Schedule']")
	private WebElement workscLNK;
	@FindBy(xpath="//div[text()='Settings']")
	private WebElement SettingLNK;
	@FindBy(name="usersSelector.selectedUser")
	private WebElement entertimeDWNLST;
	@FindBy(id="calendar_table")
	private WebElement cal;
	public EnterTimeTrackPage(WebDriver driver)
	{
		PageFactory.initElements(driver,this);
	}
	public void clickTask(WebDriver driver)
	{
		Actions action = new Actions(driver);
		action.moveToElement(tasLNK).click().build().perform();
		
	}
	public void clickTimeTrack(WebDriver driver)
	{
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Actions action = new Actions(driver);
		action.moveToElement(timetrackLNK).click().build().perform();
	}
	public void clickReports(WebDriver driver)
	{
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Actions action = new Actions(driver);
		action.moveToElement(reportsLNK).click().build().perform();
	}
	public void clickUserLNK(WebDriver driver)
	{
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Actions action = new Actions(driver);
		action.moveToElement(userLNK).click().build().perform();
	}
	public void clickWorkscLNK(WebDriver driver)
	{
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Actions action = new Actions(driver);
		action.moveToElement(workscLNK).click().build().perform();
	}
	public void clickSettingsLNK(WebDriver driver)
	{
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Actions action = new Actions(driver);
		action.moveToElement(SettingLNK).click().build().perform();
	}

	public void selectdropdwntimetrack(WebDriver driver)
	{
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Select select = new Select(entertimeDWNLST);
		List<WebElement> alloption = select.getOptions();
		Reporter.log("list"+alloption,true);
		for(int i= 0;i<alloption.size();i++)
		{
			WebElement option = alloption.get(i);
			String text = option.getText();
			Reporter.log(text,true);
			if(text.equals("ker, wor (worker)"))
			{
			select.selectByVisibleText(text);
			break;
			}
			
			
		}
	
	}
	
}
