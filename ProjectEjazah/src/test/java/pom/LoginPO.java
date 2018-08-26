package pom;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import library.BasePage;

public class LoginPO extends BasePage {

	public LoginPO(WebDriver driver) {
		super(driver);
	}
	@FindBy(xpath="(//a[text()='Login'])[2]")
	private WebElement loginBtn;
	public WebElement loginBtn() {
		return loginBtn;
	}
	@FindBy(xpath="(//input[@name='EmailId'])[1]")
	private WebElement emailTxtBx;
	public WebElement emailTxtBx() {
		return emailTxtBx;
	}
	@FindBy(xpath="(//input[@name='Password'])[1]")
	private WebElement pwTxtBx;
	public WebElement pwTxtBx() {
		return pwTxtBx;
	}
	@FindBy(xpath="//div[@id='msgLoginError'][1]")
	private WebElement errmsg;
	public WebElement errmsg() {
		return errmsg;
	}
	@FindBy(xpath="//li[text()='Enter your email address']")
	private WebElement emailErrMsg;
	public WebElement emailErrMsg() {
		return emailErrMsg;
	}
	@FindBy(xpath="//li[text()='Enter Password']")
	private WebElement pwErrMsg;
	public WebElement pwErrMsg() {
		return pwErrMsg;
	}
	public void login(String em,String pw) {
		loginBtn.click();
		emailTxtBx().sendKeys(em);
		pwTxtBx().sendKeys(pw+Keys.ENTER);
		
	}
}
