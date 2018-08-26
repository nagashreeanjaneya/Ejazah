package testScripts;

import org.openqa.selenium.TimeoutException;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

import library.BaseTest;
import pom.HomePagePO;

public class TestHome extends BaseTest {
	@Test(priority=1)
	public void testHotel() {
		try {
			HomePagePO pagePO=new HomePagePO(driver);
			pagePO.hotelBtn().click();
			pagePO.checkelement(pagePO.gngToTxtBx());
			boolean aStatus=pagePO.gngToTxtBx().isDisplayed();
			pagePO.checkelement(pagePO.gngToTxtBx());
			boolean eStatus=true;
			Assert.assertEquals(aStatus, eStatus);
		} catch (TimeoutException e) {
			Reporter.log("Exception generated", true);
			Assert.fail();
		}
		
	}
	@Test(priority=2)
	public void testFlight() {
		try {
			HomePagePO pagePO=new HomePagePO(driver);
			pagePO.flightBtn().click();
			pagePO.checkelement(pagePO.rndTripChkBx());
			boolean aStatus=pagePO.rndTripChkBx().isDisplayed();
			pagePO.checkelement(pagePO.rndTripChkBx());
			boolean eStatus=true;
			Assert.assertEquals(aStatus, eStatus);
		} catch (TimeoutException e) {
			Reporter.log("Exception generated", true);
			Assert.fail();
		}
		
	}
	@Test(priority=3)
	public void testHotelAndFlight() {
		try {
			HomePagePO pagePO=new HomePagePO(driver);
			pagePO.hotelAndFlightBtn().click();
			pagePO.checkelement(pagePO.cmgFrmTxtBx());
			boolean aStatus=pagePO.cmgFrmTxtBx().isDisplayed();
			pagePO.checkelement(pagePO.cmgFrmTxtBx());
			boolean eStatus=true;
			Assert.assertEquals(aStatus, eStatus);
		} catch (TimeoutException e) {
			Reporter.log("Exception generated", true);
			Assert.fail();
		}
		
	}
	@Test(priority=4)
	public void testCar() {
		try {
			HomePagePO pagePO=new HomePagePO(driver);
			pagePO.carBtn().click();
			pagePO.checkelement(pagePO.pickUpTxtBx());
			boolean aStatus=pagePO.pickUpTxtBx().isDisplayed();
			pagePO.checkelement(pagePO.pickUpTxtBx());
			boolean eStatus=true;
			Assert.assertEquals(aStatus, eStatus);
		} catch (TimeoutException e) {
			Reporter.log("Exception generated", true);
			Assert.fail();
		}
		
	}
	@Test(priority=5)
	public void testPckgdHolys() {
		try {
			HomePagePO pagePO=new HomePagePO(driver);
			pagePO.pckgdHoldyBtn().click();
			/*try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(driver.getTitle());*/
			String eTitle="Book Hotels | Cheap Flights | Holiday Package Online | Ejazah";
			pagePO.checkTitle(eTitle);
			String aTitle = driver.getTitle();
			Assert.assertEquals(aTitle, eTitle);
		} catch (TimeoutException e) {
			Reporter.log("Exception generated", true);
			Assert.fail();
		}
	}
	@Test(priority=6)
	public void testThngsToDo() {
		try {
			HomePagePO pagePO=new HomePagePO(driver);
			pagePO.thngsToDoBtn().click();
			pagePO.checkelement(pagePO.srchTxtBx());
			boolean aStatus=pagePO.srchTxtBx().isDisplayed();
			pagePO.checkelement(pagePO.srchTxtBx());
			boolean eStatus=true;
			Assert.assertEquals(aStatus, eStatus);
		} catch (TimeoutException e) {
			Reporter.log("Exception generated", true);
			Assert.fail();
		}
		
	}
	@Test(priority=7)
	public void testCart() {
			HomePagePO pagePO=new HomePagePO(driver);
			pagePO.cartBtn().click();
	}
	@Test(priority=8)
	public void testManage() {
		try {
			HomePagePO pagePO=new HomePagePO(driver);
			pagePO.mngBkngBtn().click();
			pagePO.checkelement(pagePO.refNoTxtBx());
			boolean aStatus=pagePO.refNoTxtBx().isDisplayed();
			pagePO.checkelement(pagePO.refNoTxtBx());
			boolean eStatus=true;
			Assert.assertEquals(aStatus, eStatus);
		} catch (TimeoutException e) {
			Reporter.log("Exception generated", true);
			Assert.fail();
		}
		
	}
	@Test(priority=9)
	public void testRegtr() {
		try {
			HomePagePO pagePO=new HomePagePO(driver);
			pagePO.regtrBtn().click();
			pagePO.checkelement(pagePO.regEleBtn());
			boolean aStatus=pagePO.regEleBtn().isDisplayed();
			pagePO.checkelement(pagePO.regEleBtn());
			boolean eStatus=true;
			Assert.assertEquals(aStatus, eStatus);
		} catch (TimeoutException e) {
			Reporter.log("Exception generated", true);
			Assert.fail();
		}
		
	}
	@Test(priority=10)
	public void testLogin() {
		try {
			HomePagePO pagePO=new HomePagePO(driver);
			pagePO.loginBtn().click();
			pagePO.checkelement(pagePO.loginEleBtn());
			boolean aStatus=pagePO.loginEleBtn().isDisplayed();
			pagePO.checkelement(pagePO.loginEleBtn());
			boolean eStatus=true;
			Assert.assertEquals(aStatus, eStatus);
		} catch (TimeoutException e) {
			Reporter.log("Exception generated", true);
			Assert.fail();
		}
		
	}
	@Test(priority=11)
	public void testCall() {
		try {
			HomePagePO pagePO=new HomePagePO(driver);
			pagePO.callBtn().click();
			pagePO.checkelement(pagePO.drpDwnMenu());
			boolean aStatus=pagePO.drpDwnMenu().isDisplayed();
			pagePO.checkelement(pagePO.drpDwnMenu());
			boolean eStatus=true;
			Assert.assertEquals(aStatus, eStatus);
		} catch (TimeoutException e) {
			Reporter.log("Exception generated", true);
			Assert.fail();
		}
		
	}
	@Test(priority=12)
	public void testLang() {
			HomePagePO pagePO=new HomePagePO(driver);
			pagePO.langBtn().click();
	}
}
