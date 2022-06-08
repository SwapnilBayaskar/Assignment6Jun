package com.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Base.BaseTest;

public class BootstrapDropDemo extends BaseTest{
	
	public void expandDropdown() {
		
		WebElement DropdownButton = driver.findElement(By.xpath("//button[@class='dropdown dropdown-toggle']"));
		DropdownButton.click();
	}
	
	
	public void selectDropdownOption(String strOption) {
				
		List<WebElement> listOptions = driver.findElements(By.xpath("//button[@class='dropdown dropdown-toggle']/following::ul[@class='dropdown-menu']/li/a"));
		System.out.println("Size of the list is : "+listOptions.size());
		
		for(WebElement Options : listOptions) {
			
			System.out.println(Options.getAttribute("innerHTML")); //Print all the values using innerHTML
			
			if(Options.getAttribute("innerHTML").contains(strOption)) {
				Options.click();
				break;
			}
			
		}
		

	}

}
