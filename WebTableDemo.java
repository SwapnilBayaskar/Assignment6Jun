package com.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.Base.BaseTest;

public class WebTableDemo extends BaseTest{
	
	public String strFname = "Swapnil";
	public String strLname = "Bayaskar";
	
	public void clickOnAddButton() {
		
		WebElement addButton = driver.findElement(By.xpath("//button[@id='addNewRecordButton']"));
		addButton.click();
				
	}
	
	public void setFirstNameAndLastName() {
		WebElement firstName = driver.findElement(By.xpath("//input[@id='firstName']"));
		firstName.sendKeys(strFname);
		
		WebElement lastName = driver.findElement(By.xpath("//input[@id='lastName']"));
		lastName.sendKeys(strLname);
	}
	
	public void setEmail(String strEmail) {
		WebElement emailField = driver.findElement(By.xpath("//input[@id='userEmail']"));
		emailField.sendKeys(strEmail);
	}
	
	public void setAge(String strAge) {
		WebElement ageField = driver.findElement(By.xpath("//input[@id='age']"));
		ageField.sendKeys(strAge);
	}
	
	public void setSalary(String strSalary) {
		WebElement salaryField = driver.findElement(By.xpath("//input[@id='salary']"));
		salaryField.sendKeys(strSalary);
	}
	
	public void setDepartment(String strDept) {
		WebElement DepartmentField = driver.findElement(By.xpath("//input[@id='department']"));
		DepartmentField.sendKeys(strDept);
	}
	
	public void clickOnSubmitButton() {
		WebElement submitButton = driver.findElement(By.xpath("//button[@id='submit']"));
		submitButton.click();
	}
	
	public void verifyEntryUsingName() {
		WebElement TableData = driver.findElement(By.xpath("//div[@class='rt-table']"));
		String strTableValue = TableData.getText();
		
		if(strTableValue.contains(strFname+strLname)) {
			System.out.println("Record is added Successfully");
		}else {
			System.out.println("Record not found");
		}
		
		//this.setFirstNameAndLastName(strTableValue, strTableValue)
	}
	
	public void deleteRecord(int intRecordNumber) {
		
		WebElement DeleteButton = driver.findElement(By.xpath("//span[@id='delete-record-"+intRecordNumber+"']"));
		DeleteButton.click();
	}

}
