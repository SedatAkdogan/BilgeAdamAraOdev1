package com.sedat.Abstract;

public class VideoOynatici implements IOynatabilir {
	private String video;
	
	public VideoOynatici(String video) {
		this.video = video;
		
	}

	@Override
	public void oynat() {
		System.out.println("Video oynatiliyor......: " + video);
		
	}
	

}
