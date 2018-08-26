package testScripts;

import org.openqa.selenium.TimeoutException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import library.BaseTest;
import pom.ThingToDoPO;

public class testThngsToDo extends BaseTest{
	@Test(priority=1)
	public void testValid() {
		ThingToDoPO doPO=new ThingToDoPO(driver);
		doPO.thngToDofn("australia");
		/*try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
		}
		System.out.println(driver.getTitle());*/
	}
	@Test(priority=2)
	public void testInvalid() {
		try {
			ThingToDoPO doPO=new ThingToDoPO(driver);
			doPO.thngToDofn("asdf");
			boolean aStatus = doPO.errMsg().isDisplayed();
			doPO.checkelement(doPO.errMsg());
			boolean eStatus=true;
			Assert.assertEquals(aStatus, eStatus);
		} catch (TimeoutException e) {
			Reporter.log("Exception generated", true);
			Assert.fail();
		}
	}
}
