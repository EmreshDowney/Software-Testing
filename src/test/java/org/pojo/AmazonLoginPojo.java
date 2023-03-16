package org.pojo;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AmazonLoginPojo extends BaseClass {
	
	public AmazonLoginPojo() {
		PageFactory.initElements(driver, this);
		
	}

@FindBy(xpath = "(//span[text()='Sign in'])[1]")
private WebElement Singin;

@FindBy(id = "ap_email")
private WebElement email;

@FindBy(id = "continue")
private WebElement Continue;

@FindBy(xpath = "//span[text()='Account & Lists']")
private WebElement Accontclick;

public WebElement getSingin() {
	return Singin;
}

public WebElement getEmail() {
	return email;
}

public WebElement getContinue() {
	return Continue;
}

public WebElement getAccontclick() {
	return Accontclick;
}


	
	
}
