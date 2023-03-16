package org.pojo;

import javax.management.loading.PrivateClassLoader;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FbPojo extends BaseClass  {

	public FbPojo() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="email")
	private WebElement email;
	
	@FindBy(name="pass")
	private WebElement pass;
	
	
	public WebElement getEmail() {
		return email;
	}


	public WebElement getPass() {
		return pass;
	}


	public WebElement getLogcli() {
		return logcli;
	}

	@FindBy(xpath="//button[@name='login']")
	private WebElement logcli;

	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
