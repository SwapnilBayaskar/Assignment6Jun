package com.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Base.BaseTest;

public class SwagLabsWeb extends BaseTest {
	
	public void doLogin(String strUsername, String strPassword) {
		
		WebElement UsenameField = driver.findElement(By.xpath("//input[@id='user-name']"));
		UsenameField.sendKeys(strUsername);
		
		WebElement PasswordField = driver.findElement(By.xpath("//input[@id='password']"));
		PasswordField.sendKeys(strPassword);
		
		WebElement LoginButton = driver.findElement(By.xpath("//input[@id='login-button']"));
		LoginButton.click();
	}
	
	public void getItemNames(String strProductName) {
		List<WebElement> listItems = driver.findElements(By.xpath("//div[@class='inventory_item_name']"));
		System.out.println(listItems.size());
		
		for(WebElement Items : listItems) {
			String strValues = Items.getText();
			System.out.println(strValues);
			
			if(strValues.contains(strProductName)) {
				Items.click();
			}
		}
	}
	

}
