package com.herokuapp.sinatra.tests;

import org.junit.Test;

public class SinatraTestCasePOM extends SinatraTestBasePOM {
	@Test

	public void addNewSongTestCase() {
		home.login("frank","sinatra");
		addSongs.addNewSong("NewSong", 35,"05/26/2018","This is my new song..");
	}

}
