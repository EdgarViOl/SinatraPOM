package com.herokuapp.sinatra.tests;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.herokuapp.sinatra.pages.SinatraAddNewSong;
import com.herokuapp.sinatra.pages.SinatraHomePage;
import com.herokuapp.sinatra.pages.SinatraSongInfo;
import com.herokuapp.sinatra.pages.SinatraSongsPage;

public class SinatraTestBasePOM {
	private static String DRIVER_PROPERTY ="webdriver.chrome.driver";
	private static String DRIVER_PATH ="C:\\test_automation\\drivers\\chromedriver.exe";

	private static WebDriver driver;
	private static WebDriverWait driverWait;
	protected SinatraHomePage home;
	protected SinatraSongsPage songs;
	protected SinatraAddNewSong addSongs;
	protected SinatraSongInfo infoSongs;


	@Before
	public void setup() {
		System.setProperty(DRIVER_PROPERTY, DRIVER_PATH);  //propiedad explorador chrome		
		driver = new ChromeDriver();  //driver de chrome
		driver.get("http://songs-by-sinatra.herokuapp.com/");
		home = new SinatraHomePage (driver);
		songs = new SinatraSongsPage (driver);
		addSongs = new SinatraAddNewSong(driver);
		infoSongs = new SinatraSongInfo(driver);

	}

	@Test
	public void addNewSongTestCase() {

	}

	@After
	public void closePage() {
		driver.quit ();

	}


}
