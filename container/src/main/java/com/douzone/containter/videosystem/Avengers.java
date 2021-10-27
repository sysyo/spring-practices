package com.douzone.containter.videosystem;

public class Avengers implements DigitalViedoDisc {
	private String title = "Avengers";
	private String studio = "MARVEL";
	
	@Override
	public void play() {
		System.out.println("Playing Movie " + studio + title);

	}

}
