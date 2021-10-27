package com.douzone.container.videosystem;

public class DVDPlayer {
	private DigitalVideoDisc dvd;
	
	// 기본 생성자
	public DVDPlayer() {
		
	}
	
	public DVDPlayer(DigitalVideoDisc dvd) {
		this.dvd = dvd;
	}
	public void setDvd(DigitalVideoDisc dvd) {
		this.dvd = dvd;
	}

	public void play() {
		dvd.play();
	}
}