package com.sedat.Polimorphism;

public class Daire implements IGeometrikSekil {
	
	
	private double yaricap;
	
	public Daire(double yaricap) {
		this.yaricap = yaricap;
	}

	@Override
	public double alanHesapla() {
		
		return Math.PI * yaricap*yaricap;
	}
	

}
