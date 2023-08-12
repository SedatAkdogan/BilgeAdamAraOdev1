package com.sedat.Polimorphism;

public class Dikdortgen implements IGeometrikSekil{
	private double taban;
	private double yukseklik;
	
	public Dikdortgen(double taban,double yukseklik) {
		this.taban = taban;
		this.yukseklik = yukseklik;
	}

	@Override
	public double alanHesapla() {
		
		return taban * yukseklik;
	}

}
