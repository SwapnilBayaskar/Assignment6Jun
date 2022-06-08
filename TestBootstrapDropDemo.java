package com.Test;

import com.Pages.BootstrapDropDemo;

public class TestBootstrapDropDemo {

	public static void main(String[] args) {
		
		BootstrapDropDemo objBootstrapDropDemo = new BootstrapDropDemo();
		
		objBootstrapDropDemo.initializeBrowser("https://www.jquery-az.com/boots/demo.php?ex=14.0_1");
		objBootstrapDropDemo.expandDropdown();
		objBootstrapDropDemo.setImplicitWait(5);
		objBootstrapDropDemo.selectDropdownOption("PHP");

	}

}
