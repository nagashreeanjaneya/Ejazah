package testScripts;

import org.openqa.selenium.TimeoutException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import library.BaseTest;
import pom.LoginPO;

public class TestLogin extends BaseTest {
	@Test(priority=1)
	public void testValidCredentials() {
		try {
			LoginPO loginPO=new LoginPO(driver);
			loginPO.login("nagashreeanjaneya17@gmail.com", "asdf@1234");
			/*try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(driver.getTitle());*/
			String eTitle="Book Hotels | Cheap Flights | Holiday Package Online | Ejazah";
			loginPO.checkTitle(eTitle);
			String aTitle = driver.getTitle();
			Assert.assertEquals(aTitle, eTitle);
		} catch (TimeoutException e) {
			Reporter.log("Exception generated", true);
			Assert.fail();
		}
	}
	@Test(priority=2)
	public void testInvalidUn() {
		try {
			LoginPO loginPO =new LoginPO(driver);
			loginPO.login("nagashree@gmail.com", "asdf@1234");
			loginPO.checkelement(loginPO.errmsg());
			boolean aStatus = loginPO.errmsg().isDisplayed();
			boolean eStatus = true;
			Assert.assertEquals(aStatus, eStatus);
		} catch (TimeoutException e) {
			Reporter.log("Exception generated", true);
			Assert.fail();
		}
	}
	@Test(priority=3)
	public void testInvalidPw() {
		try {
			LoginPO loginPO =new LoginPO(driver);
			loginPO.login("nagashreeanjaneya17@gmail.com", "asdf");
			loginPO.checkelement(loginPO.errmsg());
			boolean aStatus = loginPO.errmsg().isDisplayed();
			boolean eStatus = true;
			Assert.assertEquals(aStatus, eStatus);
		} catch (TimeoutException e) {
			Reporter.log("Exception generated", true);
			Assert.fail();
		}
	}
	@Test(priority=4)
	public void testInvalidUnAndPw() {
		try {
			LoginPO loginPO =new LoginPO(driver);
			loginPO.login("nagashree@gmail.com", "asdf");
			loginPO.checkelement(loginPO.errmsg());
			boolean aStatus = loginPO.errmsg().isDisplayed();
			boolean eStatus = true;
			Assert.assertEquals(aStatus, eStatus);
		} catch (TimeoutException e) {
			Reporter.log("Exception generated", true);
			Assert.fail();
		}
	}
	@Test(priority=5)
	public void testEmptyUn() {
		try {
			LoginPO loginPO =new LoginPO(driver);
			loginPO.login("", "asdf@1234");
			loginPO.checkelement(loginPO.emailErrMsg());
			boolean aStatus = loginPO.emailErrMsg().isDisplayed();
			boolean eStatus = true;
			Assert.assertEquals(aStatus, eStatus);
		} catch (TimeoutException e) {
			Reporter.log("Exception generated", true);
			Assert.fail();
		}
	}
	@Test(priority=6)
	public void testEmptyPw() {
		try {
			LoginPO loginPO =new LoginPO(driver);
			loginPO.login("nagashreeanjaneya17@gmail.com", "");
			loginPO.checkelement(loginPO.pwErrMsg());
			boolean aStatus = loginPO.pwErrMsg().isDisplayed();
			boolean eStatus = true;
			Assert.assertEquals(aStatus, eStatus);
		} catch (TimeoutException e) {
			Reporter.log("Exception generated", true);
			Assert.fail();
		}
	}
	@Test(priority=7)
	public void testEmptyUnAndPw() {
		try {
			LoginPO loginPO =new LoginPO(driver);
			loginPO.login("", "");
			loginPO.checkelement(loginPO.emailErrMsg());
			boolean aStatus = loginPO.emailErrMsg().isDisplayed();
			boolean eStatus = true;
			Assert.assertEquals(aStatus, eStatus);
		} catch (TimeoutException e) {
			Reporter.log("Exception generated", true);
			Assert.fail();
		}
	}
}
