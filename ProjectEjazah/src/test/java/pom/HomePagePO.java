package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import library.BasePage;

public class HomePagePO extends BasePage {

	public HomePagePO(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath="//div[@class='search-type active']")
	private WebElement hotelBtn;
	public WebElement hotelBtn() {
		return hotelBtn;
	}
	@FindBy(xpath="(//input[@name='SearchQuery'])[2]")
	private WebElement gngToTxtBx;
	public WebElement gngToTxtBx() {
		return gngToTxtBx;
	}
	@FindBy(xpath="(//div[@class='search-type'])[1]")
	private WebElement flightBtn;
	public WebElement flightBtn() {
		return flightBtn;
	}
	@FindBy(xpath="//input[@id='return-radio']")
	private WebElement rndTripChkBx;
	public WebElement rndTripChkBx() {
		return rndTripChkBx;
	}
	@FindBy(xpath="(//div[@class='search-type'])[2]")
	private WebElement hotelAndFlightBtn;
	public WebElement hotelAndFlightBtn() {
		return hotelAndFlightBtn;
	}
	@FindBy(xpath="(//input[@name='FlyingFrom'])[2]")
	private WebElement cmngFrmTxtBx;
	public WebElement cmgFrmTxtBx() {
		return cmngFrmTxtBx;
	}
	@FindBy(xpath="(//div[@class='search-type'])[3]")
	private WebElement carBtn;
	public WebElement carBtn() {
		return carBtn;
	}
	@FindBy(xpath="//input[@name='PickUpLocationName']")
	private WebElement pickUpTxtBx;
	public WebElement pickUpTxtBx() {
		return pickUpTxtBx;
	}
	@FindBy(xpath="//a[@class='search-type']")
	private WebElement pckgdHoldysBtn;
	public WebElement pckgdHoldyBtn() {
		return pckgdHoldysBtn;
	}
	@FindBy(xpath="(//div[@class='search-type'])[4]")
	private WebElement thngsToDoBtn;
	public WebElement thngsToDoBtn() {
		return thngsToDoBtn;
	}
	@FindBy(xpath="//input[@id='viator_location_search']")
	private WebElement srchTxtBx;
	public WebElement srchTxtBx() {
		return srchTxtBx;
	}
	@FindBy(xpath="//div[@class='cart-btn']")
	private WebElement cartBtn;
	public WebElement cartBtn() {
		return cartBtn;
	}
	@FindBy(xpath="(//a[@href='/en/ManageBooking/Index'])[2]")
	private WebElement mngBkngBtn;
	public WebElement mngBkngBtn() {
		return mngBkngBtn;
	}
	@FindBy(xpath="//input[@id='txtRetBookingConfirmationNumber']")
	private WebElement refNoTxtBx;
	public WebElement refNoTxtBx() {
		return refNoTxtBx;
	}
	@FindBy(xpath="//a[@href='/en/home/access?Type=1']")
	private WebElement regtrBtn;
	public WebElement regtrBtn() {
		return regtrBtn;
	}
	@FindBy(xpath="(//a[text()=\"Register\"])[4]")
	private WebElement regEleBtn;
	public WebElement regEleBtn() {
		return regEleBtn;
	}
	@FindBy(xpath="//a[@href='/en/home/access?Type=2']")
	private WebElement loginBtn;
	public WebElement loginBtn() {
		return loginBtn;
	}
	@FindBy(xpath="(//a[text()=\"Login\"])[4]")
	private WebElement loginEleBtn;
	public WebElement loginEleBtn() {
		return loginEleBtn;
	}
	@FindBy(xpath="(//button[@type='button'])[2]")
	private WebElement callBtn;
	public WebElement callBtn() {
		return callBtn;
	}
	@FindBy(xpath="//div[@class='dropdown-menu']")
	private WebElement drpDwnMenu;
	public WebElement drpDwnMenu() {
		return drpDwnMenu;
	}
	@FindBy(xpath="(//a[@class='liLangauge'])[2]")
	private WebElement langBtn;
	public WebElement langBtn() {
		return langBtn;
	}
}
