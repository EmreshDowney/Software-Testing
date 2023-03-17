package org.pojo;

import java.awt.Window;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class PojoSample extends BaseClass{
	
	public static void main(String[] args) {
	 launchBrowser();
	 
	 lauchUrl("https://www.flipkart.com/");
	 
	 WindowMaximize();
	 
	 FbPojo f = new FbPojo();
	 
	 ClickBtn(f.getClick());
	 
	 ClickBtn(f.getClickbtn());
	 
	 passText("emresh", f.getLog());
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
