package script;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class A {
	@Test
	public void call()
	{
		Reporter.log("hi",true);
	}

}
