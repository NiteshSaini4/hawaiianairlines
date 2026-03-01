package com.AutomationDemoProject.testcase;

import org.testng.annotations.Test;

import com.AutomationDemoProject.pageobject.Hawaiianairlines;



public class TestCase extends BaseClass
{

	@Test(priority = 0)
	void login()
	{
		driver.get(url);
		Hawaiianairlines l=new Hawaiianairlines(driver);
		l.getUsername("student");
		l.getPassword("Password123");
		l.getClick();
		
	}
	
}
