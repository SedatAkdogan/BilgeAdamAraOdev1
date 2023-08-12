package com.sedat.Abstract;

public class Runner_Soru1 {

	public static void main(String[] args) {
		/**
		 * Javada abstract class kavramı hem class olarak hem de interface olarak davranabilen
		 * bir sey olusturmak demektir.Bazen bir sınıf oluşturdugumuzda o sınıfı extend ettigimiz alt sınıflarda
		 * kullanılmasını ya da override edilmesini zorunlu tutmak istediğimiz methodlar olabilir.Bunu yapmak için 
		 * üst sınıfı interface'e çevirmek gerekir.Fakat eğer interface kullanımı bizim için tam olarak uygun olmazsa
		 * bu ikisinin de özelliklerini barındırabilen abstract class kullanırız.
		 * Abstract classlar kullanılırken istediğimiz degiskenleri initialize etmeden tanımlayabilir,
		 * istediğimiz methodları hem gövdeli hem de gövdesiz olarak tanımlayabiliriz.
		 * Burada gövdesiz methodlar interfaceteki gibi alt sınıflar tarafından override edilmek zorunda olur.
		 * Gövdeli methodlarda eger ihtiyac olursa eklenebilir.Yani abstract class iki amaca da hizmet etmiş olur.
		 */
		/*
		 * Simdi bunu acıklamaya calısmak için bir Geometrik sekil abstract classı ve bir alt sınıf olusturalım.
		 */
		
		GeometrikSekil dikdortgen = new Dikdortgen(5, 6);
		System.out.println("Dikdortgenin alani......: " + dikdortgen.alanHesapla());
		System.out.println();
		
		// burada alanhesapla methodunu abstract olarak tanımlayıp dikdortgen sınfıında override edilmesini zorunlu kıldık.
		
		dikdortgen.alaniEkranaYazdir(5, 6); // burada ise olusturdugmuz method abstract degildi kendimiz isteyerek override ettik 
		// soyut method degil istemeseydik kullanmazdık.
		
		// yani abstract class hem interface gibi hem de normal sınıf gibi kullanılabilir.
		

	}

}
