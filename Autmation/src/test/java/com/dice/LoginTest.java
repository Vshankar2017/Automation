package com.dice;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.dic.pages.LogInPage;
import com.dic.pages.ProfilePage;
import com.dice.base.BaseTest;

public class LoginTest extends BaseTest {
	@Test
	public void positiveLogInTest()
	{
		LogInPage logInPage = new LogInPage(driver);
		String exectedaPageTitle ="Seeker Dashboard - Profile";
		String correctProfileName = "VISHNU SHANKAR";
		
		
		
		logInPage.openLogInPage();
		logInPage.fillUpEmailAndPassword("vishnu0shankar@gmail.com", "vishnu007");
		ProfilePage profilePage = logInPage.pushSignInButton();
		profilePage.waitForProfilePageToLoad();
		
		String actualTitle = profilePage.getTitle();
		Assert.assertTrue(exectedaPageTitle.equals(actualTitle),
				"Page title is not exected .\n Exedted:" + exectedaPageTitle + "\nActual:"+actualTitle);
		Assert.assertTrue(profilePage.isCorrectProfileLoaded(correctProfileName), "Profile name is not excepted");
	}

}
