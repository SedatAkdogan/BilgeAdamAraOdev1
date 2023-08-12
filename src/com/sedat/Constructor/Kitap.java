package com.sedat.Constructor;

public class Kitap {
	
	private String ad;
	private String yazar;
	private int sayfaSayisi;
	
	public Kitap() {
		this.ad = "Suc ve Ceza";
		this.yazar = "Dostoyevski";
		this.sayfaSayisi = 687;
	}
	
	public Kitap(String ad ,String yazar) {
		this.ad = ad;
		this.yazar = yazar;
		this.sayfaSayisi =258;
		
	}
	
	public Kitap(String ad ,String yazar,int sayfaSayisi) {
		this.ad =ad;
		this.yazar = yazar;
		this.sayfaSayisi = sayfaSayisi;
	}
	
	public void bilgileriYazdir() {
		System.out.println("Kitabin adi...: " + ad);
		System.out.println("Kitabin yazari...: " + yazar);
		System.out.println("Kitabin sayfa sayisi...: " + sayfaSayisi);
	}
	

}
