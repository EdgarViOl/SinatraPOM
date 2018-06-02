package com.herokuapp.sinatra.test;

import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.FileParameters;
import junitparams.JUnitParamsRunner;

@RunWith(JUnitParamsRunner.class)
public class SinatraTestCasePOM extends TestBasePOM {

	@Test
	@FileParameters("./data/params.csv")
	public void sinatraHomePageTestCase(String user, String password) {
		homePage.goToSinatraHomePage();
		homePage.sinatraHomePageElementsValidation();
		
		loginPage.goToLoginPage();
		loginPage.sinatraLoginPageElementsValidation();
		loginPage.loginSinatraPage(user, password);
		
		logoutPage.sinatraLogoutElementsValidation();
		logoutPage.logoutSinatraPage();
	}
	
	@Test
	@FileParameters("./data/params.csv")
	public void sinatraAboutPageTestCase(String user, String password) {
		aboutPage.goToSinatraAboutPage();
		aboutPage.sinatraAboutPageElementsValidation();
		
		loginPage.goToLoginPage();
		loginPage.sinatraLoginPageElementsValidation();
		loginPage.loginSinatraPage(user, password);
		
		logoutPage.sinatraLogoutElementsValidation();
		logoutPage.logoutSinatraPage();
	}
	
	@Test
	@FileParameters("./data/params2.csv")
	public void sinatraContactPageTestCase(String NAME, String EMAIL, String URMESSAGE, String user, String password) {
		contactPage.goToSinatraContactPage();
		contactPage.sinatraContactPageElementsValidatation();
		contactPage.sendContactMessage(NAME, EMAIL, URMESSAGE);
		
		loginPage.goToLoginPage();
		loginPage.sinatraLoginPageElementsValidation();
		loginPage.loginSinatraPage(user, password);
		
		logoutPage.sinatraLogoutElementsValidation();
		logoutPage.logoutSinatraPage();
	}
	
	@Test
	@FileParameters("./data/params3.csv")
	public void sinatraSongsPageTestCase(String user, String password, String songTitle, int lenghtS, String dateS, String lyricS ) {
		loginPage.goToLoginPage();
		loginPage.sinatraLoginPageElementsValidation();
		loginPage.loginSinatraPage(user, password);
		
		songsPage.goToSinatraSongsPage();
		songsPage.sinatraSongsPageElementsValidation();

		addSongPage.goToSinatraAddSongsPage();
		addSongPage.sinatraAddSongPageElementsValidation();
		addSongPage.addSong(songTitle, lenghtS, dateS, lyricS);
		
		logoutPage.sinatraLogoutElementsValidation();
		logoutPage.logoutSinatraPage();
	}
	
	

}
