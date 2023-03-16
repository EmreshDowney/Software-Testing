package org.pojo;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FlipkartLogPojo extends BaseClass {
	
	
	public FlipkartLogPojo() {
		PageFactory.initElements(driver, this);
		
	}

	
	@FindBy(xpath = "//button[text()='✕']")
	private WebElement xcli;
	
	@FindBy(xpath = "//a[text()='Login']")
	private WebElement Login;
	
	@FindBy(xpath = "(//input[@type='text'])[2]")
	private WebElement Email;
	
	@FindBy(xpath = "//button[text()='Request OTP']")
	private WebElement OtpRequst;

	public WebElement getXcli() {
		return xcli;
	}

	public WebElement getLogin() {
		return Login;
	}

	public WebElement getEmail() {
		return Email;
	}

	public WebElement getOtpRequst() {
		return OtpRequst;
	}

	
}
