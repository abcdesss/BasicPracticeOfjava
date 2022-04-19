package testCases;

import org.testng.Reporter;
import org.testng.annotations.Test;

import pages.BaseClass;

public class LogInText extends BaseClass {
	@Test
public void verifyLogInFunctionality() {
	lp.userName("Admin");
	lp.passWord("admin123");
	lp.loginClick();
	Reporter.log("Login successfull",true);
}
//	@Test
//	public void verifyInvalidCredentialMessage() {
//		lp.userName("abc");
//		lp.passWord("7263");
//		lp.loginClick();
//	}
}
