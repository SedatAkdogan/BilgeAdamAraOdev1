package com.sedat.Constructor;

public class Runner_Soru2 {

	public static void main(String[] args) {
		
		Kitap kitap1 = new Kitap();
		kitap1.bilgileriYazdir();
		System.out.println();
		
		Kitap kitap2 = new Kitap("Beyaz Diş" , "Jack London");
		kitap2.bilgileriYazdir();
		System.out.println();
		
		Kitap kitap3 = new Kitap("İnsan Ne İle Yaşar","Tolstoy",112);
		kitap3.bilgileriYazdir();
		
		/**
		 * Kitap sınıfında overload ettiğimiz constructorlarımız 3 farklı nesne ile cagırılmıstır.
		 * Hepsi içine farklı parametreler almıstır.
		 */
		
		

	}

}
