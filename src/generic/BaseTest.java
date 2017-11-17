package generic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

public abstract class BaseTest implements IAutoConst{

	 public WebDriver driver;
	static
	{
		System.setProperty(KEY,VALUE);
	}
	@BeforeTest
	public void openApplication()
	{
		driver = new ChromeDriver();
		String url=Lib.getPPT(CONFIG_PATH,"URL");
		driver.get(url);
	}
}
