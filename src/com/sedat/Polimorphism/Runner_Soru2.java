package com.sedat.Polimorphism;

public class Runner_Soru2 {

	public static void main(String[] args) {
		/**
		 * Bir arayüz (interface), Java'da polimorfizmi uygulamanın güçlü bir yoludur.
		 * Arayüzler, farklı sınıflar arasında benzer davranışları tanımlamak için kullanılabilir ve
		 * bu da kodun daha esnek ve genişletilebilir olmasını sağlar.
		 * Arayüzler, farklı sınıfların aynı arayüzü uygulayarak, aynı isme sahip metotları farklı şekillerde gerçekleştirebilmelerini sağlar.
		 */

		/**
		 * Simdi bunu uygulamak icin geometrik sekil interface'i daire ve dikdortgen sınıflarını olusturup nasıl calıstıgına bakalım.
		 */
		
		IGeometrikSekil daire = new Daire(5); // burda olusturulan daire sınıfının nesnesi oldugu için ordaki constructor parametreli o yüzden 5 girdik.
		IGeometrikSekil dikdortgen = new Dikdortgen(6, 5);
		
		System.out.println("Dairenin alanı..... : " + daire.alanHesapla());
		System.out.println();
		System.out.println("Dikdortgenin alanı.....: " + dikdortgen.alanHesapla());
		
		/*
		 * Burada gordugunuz gibi geometrik sekil interface'inin alanhesapla methodu diger sınıflar tarafından override edildi
		 * Interface'in referansıyla olusturulan sınıf nesneleri alan hesapla methoduna ulasarak farklı sekillerde davranmıslardır.
		 * 
		 */
		
		
		
		
		
		
		
	}

}
