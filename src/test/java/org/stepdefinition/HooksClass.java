package org.stepdefinition;

import org.base.BaseClass;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class HooksClass extends BaseClass {

	@Before(order=2 , value = "@facebook")
	public void pre2() {

		
		System.out.println("just max it");

	}
	
	@Before(order=1 )
	public void pre1() {

		launchBrowser();
		System.out.println("launch browser");
	
	}
	
	@Before(order=3 )
	public void pre3() {
		
		System.out.println("Failed to show");

		
	}

	@After
	public void post() {

		closeEntireBrowser();

	}

}
