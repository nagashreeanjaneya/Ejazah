package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import library.BasePage;

public class ThingToDoPO extends BasePage{

	public ThingToDoPO(WebDriver driver) {
		super(driver);
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
	@FindBy(xpath="//li[text()='Please select a valid location']")
	private WebElement errMsg;
	public WebElement errMsg() {
		return errMsg;
	}
	@FindBy(xpath="//a[text()='Search']")
	private WebElement srchBtn;
	public WebElement srchBtn() {
		return srchBtn;
	}
	public void thngToDofn(String place) {
		thngsToDoBtn().click();
		srchTxtBx().sendKeys(place);
		srchBtn().click();
	}
}
