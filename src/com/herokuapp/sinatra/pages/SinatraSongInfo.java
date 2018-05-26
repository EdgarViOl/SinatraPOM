package com.herokuapp.sinatra.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SinatraSongInfo {
	private WebDriver driver;

	public SinatraSongInfo (WebDriver driver2) {
		this.driver = driver2;		
	}
	//Elements:
	WebElement songNameLbl;//xpath: //section[@class='main content']/h1
	WebElement songAddedLbl;//xpath: //div[@class = 'flash notice']
	WebElement releaseDateLbl;//xpath: //p[contains(text(), 'Release Date:')]
	WebElement lengthLbl;//xpath: //p[contains(text(), 'Length:')]
	WebElement lyricsLbl;//xpath: //pre
	WebElement likeCountLbl;//xpath: //p[contains(text(),'This song has been liked')]
	WebElement editSongLnk;//xpath: //a[text()='edit this song']
	WebElement deleteSongBtn;//xpath: //input[@value='delete this song']

	//methods:
	public void validateSongInformation(String songName, int length, String date, String lyrics) {

	}
	public void validateSongNotLiked() {

	}
	public void validateSongLiked() {

	}
	public void editSong(String newSongName, int newLength, String newDate, String newLyrics) {

	}
	public void deleteSong() {

	}
}
