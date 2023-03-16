package org.stepdefinition;

import java.util.List;
import java.util.Map;

import org.base.BaseClass;
import org.pojo.AmazonLoginPojo;
import org.pojo.FbPojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import io.cucumber.datatable.DataTable;

public class AmazonSing extends BaseClass {
	
	AmazonLoginPojo a;
	FbPojo f;

	@When("To launch url of Amazon")
	public void to_launch_url_of_Amazon() {
		
		launchUrl("https://www.amazon.in/");
	    
	}

	@When("Click SingIn button")
	public void click_SingIn_button() {
		a =new AmazonLoginPojo();
		ClickBtn(a.getAccontclick());
	    
	}

	@When("Pass mails in Email Filed")
	public void pass_mails_in_Email_Filed(io.cucumber.datatable.DataTable d) {
		a =new AmazonLoginPojo();
		List<String> l = d.asList();
		passText(l.get(2), a.getEmail());
	   
	}

	@When("Click Continue")
	public void click_Continue() {
		a =new AmazonLoginPojo();
		ClickBtn(a.getContinue());
	   
		
	}
	
	@When("Launch Facebook Url")
	public void launchFacebookUrl() {
		
	   launchUrl("http://www.facebook.com/");
	}


	@When("To passs username in{string} email filed")
	public void to_passs_username_in_email_filed(String s) {
		f = new FbPojo();
	  passText(s, f.getEmail());
		
	}

	@When("To pass password in {string} password filed")
	public void toPassPasswordInPasswordFiled(String n) {
		
		f = new FbPojo();
	  passText(n, f.getPass());
	}

	@When("click LogIn")
	public void click_LogIn() {
		f = new FbPojo();
	  ClickBtn(f.getLogcli());
		
	}

	
	


	
}
