package com.sedat.Constructor;

public class Musteri {
	
	private String ad;
	private int yas;
	
	public Musteri(String ad,int yas) {
		this.ad =ad;
		this.yas = yas;	
	}
	
	public Musteri(Musteri musteri2) {
		this.ad = musteri2.ad;
		this.yas =musteri2.yas;
		
	}
	
	public void bilgileriYazdir() {
		System.out.println("Musterinin adi.....: " + ad);
		System.out.println("Musterinin yasi.....: " + yas);
		
	}

}
