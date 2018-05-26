package com.herokuapp.sinatra.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SinatraSongsPage {
	private WebDriver driver;
	public SinatraSongsPage (WebDriver driver2) {
		this.driver = driver2;

	}

	//Elements:
	WebElement songsLbl;//xpath("//h1[text()='Songs']")
	WebElement songList;//id ("songs")
	WebElement createSongLnk; //linkText: Create a new song

	//Methods:
	public void validateSongExists (String songName) {

	}
	public void createSong(String songName, int length, String date, String lyrics) {
		driver.findElement(By.xpath("//a[@href='/songs']")).click();
		driver.findElement(By.xpath("//a[@href='/songs/new']")).click();
		driver.findElement(By.id("title")).sendKeys(songName);
		driver.findElement(By.id("length")).sendKeys(length + "");//se castea el campo
		driver.findElement(By.id("released_on")).sendKeys(date);
		driver.findElement(By.id("lyrics")).sendKeys(lyrics);
		driver.findElement(By.xpath("//input[@value='Save Song']")).click();
	}
	public void login (String user, String pass) {

	}
	public void logout() {

	}

}
