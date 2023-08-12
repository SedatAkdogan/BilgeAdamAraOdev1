package com.sedat.Abstract;

public class Dikdortgen extends GeometrikSekil{
	private double taban;
	private double yukseklik;
	
	
	public Dikdortgen(double taban,double yukseklik) {
		this.taban = taban;
		this.yukseklik = yukseklik;
		
	}

	@Override
	public double alanHesapla() {
		
		return taban*yukseklik;
	}

	@Override
	public void alaniEkranaYazdir(double taban,double yukseklik) {
		System.out.println("Dikdortgenin alani......: " + taban*yukseklik);
	}
	
	

}
