package com.sedat.Abstract;

public class MuzikCalar implements IOynatabilir {
	
	private String sarki;
	
	public MuzikCalar(String sarki) {
		this.sarki = sarki;
		
	}

	@Override
	public void oynat() {
		System.out.println("Sarki oynatiliyor....: " + sarki);
		
	}
	

}
