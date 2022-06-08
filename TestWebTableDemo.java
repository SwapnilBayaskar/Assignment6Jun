package com.Test;

import com.Pages.WebTableDemo;

public class TestWebTableDemo {

	public static void main(String[] args) {
		
		WebTableDemo objWebTableDemo = new WebTableDemo();
		
		objWebTableDemo.initializeBrowser("https://demoqa.com/webtables");
//		objWebTableDemo.clickOnAddButton();
//		objWebTableDemo.setFirstNameAndLastName();
//		objWebTableDemo.setEmail("swapnil@gmail.com");
//		objWebTableDemo.setAge("27");
//		objWebTableDemo.setSalary("5000");
//		objWebTableDemo.setDepartment("IT");
//		objWebTableDemo.clickOnSubmitButton();
//		
//		objWebTableDemo.verifyEntryUsingName();
		objWebTableDemo.deleteRecord(3);

	}

}
