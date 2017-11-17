package script;

import org.testng.Reporter;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Lib;
import pom.EnterTimeTrackPage;
import pom.LoginPage;

public class LoginTest extends BaseTest {
@Test(priority=1,groups="login")
public void testLogin()
{
	LoginPage page = new LoginPage(driver);
	String un=Lib.getExcelValue(EXCEL_PATH,"validLogin",1,0);
	page.setUserName(un);
	String pw=Lib.getExcelValue(EXCEL_PATH,"validLogin",1,1);
	page.setPassword(pw);
	page.clicklogin();
	
	try {
		Thread.sleep(2000);
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	EnterTimeTrackPage track = new EnterTimeTrackPage(driver);
	track.clickTask(driver);
	track.clickTimeTrack(driver);
	track.selectdropdwntimetrack(driver);
	track.clickReports(driver);
	track.clickUserLNK(driver);
	track.clickSettingsLNK(driver);
	track.clickWorkscLNK(driver);
	
	
}
}
