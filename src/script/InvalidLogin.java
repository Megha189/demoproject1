package script;

import org.testng.Reporter;
import org.testng.annotations.Test;
import generic.BaseTest;
import generic.Lib;
import pom.LoginPage;

public class InvalidLogin extends BaseTest {
	@Test(priority=0,groups="login")
	public void testInvalid()
	{
		LoginPage page = new LoginPage(driver);
		int count=Lib.Rowcount(EXCEL_PATH,"invalidLogin");
		Reporter.log("count:"+count,true);
		for(int i=1;i<count;i++)
		{
			String un=Lib.getExcelValue(EXCEL_PATH,"invalidLogin",i,0);
			page.setUserName(un);
			String pw=Lib.getExcelValue(EXCEL_PATH,"invalidLogin",i,1);
			page.setPassword(pw);
			page.clicklogin();
			try {
				Thread.sleep(2000);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			driver.navigate().back();
			page.ClearunANDpas();
			
		}
		
	}

}
