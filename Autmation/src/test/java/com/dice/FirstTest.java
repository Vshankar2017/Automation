package com.dice;


import org.testng.annotations.Test;

import com.dice.base.BaseTest;

public class FirstTest extends BaseTest {
	
	@Test
	public void firstTestMethod()
	{
		
		
		driver.get("https://www.dice.com");
		
		
	}
	

}
