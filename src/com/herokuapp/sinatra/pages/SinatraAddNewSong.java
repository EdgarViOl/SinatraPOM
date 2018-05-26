package com.herokuapp.sinatra.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SinatraAddNewSong {
	private WebDriver driver;
	public SinatraAddNewSong (WebDriver driver2) {
		this.driver = driver2;		
	}
	//Elements:
	WebElement addNewSongLbl;
	WebElement titleTxt; {
		titleTxt = driver.findElement(By.id("title"));
	}
	WebElement lengthTxt;{
		lengthTxt = driver.findElement(By.id("length"));
	}
	WebElement dateTxt;{
		dateTxt = driver.findElement(By.id("released_on"));
	}
	WebElement lyricsTxt;{
		lyricsTxt = driver.findElement(By.id("lyrics"));
	}
	WebElement saveSongBtn;{
		saveSongBtn = driver.findElement(By.xpath("//input[@value='Save Song']"));
	}

	//Methods:
	public void addNewSong (String songName, int length, String date, String lyrics) {

		driver.findElement(By.xpath("//a[@href='/songs']")).click();
		driver.findElement(By.xpath("//a[@href='/songs/new']")).click();		
		titleTxt.sendKeys(songName);		
		lengthTxt.sendKeys(length + "");//se castea el campo
		dateTxt.sendKeys(date);
		lyricsTxt.sendKeys(lyrics);
		saveSongBtn.click();
	}

}
