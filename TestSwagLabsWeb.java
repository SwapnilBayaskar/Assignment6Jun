package com.Test;

import com.Pages.SwagLabsWeb;

public class TestSwagLabsWeb {

	public static void main(String[] args) {
		
		SwagLabsWeb objSwagLabsWeb = new SwagLabsWeb();
		
		objSwagLabsWeb.initializeBrowser("https://www.saucedemo.com/");
		objSwagLabsWeb.setImplicitWait(5);
		objSwagLabsWeb.doLogin("standard_user", "secret_sauce");
		
		objSwagLabsWeb.getItemNames("Jacket");
	}

}
