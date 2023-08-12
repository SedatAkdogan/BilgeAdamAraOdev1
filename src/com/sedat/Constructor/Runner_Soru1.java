package com.sedat.Constructor;

public class Runner_Soru1 {

	public static void main(String[] args) {
		
		/**
		 * Java'da parametre almayan (default) bir constructor,
		 *  bir sınıfın nesnesi oluşturulduğunda otomatik olarak çağrılır.
		 *  Eğer bir sınıf içinde hiç constructor tanımlamazsanız,
		 *   Java derleyicisi varsayılan bir parametresiz constructor ekler.
		 *   1 tane"araba" sınıfı oluşturduk içine default constructor yazdık.
		 *   Simdi araba sınıfından nesne oluşturdugumuzda otomatik olarak çağırılacak.
		 *   Ve ekrana o default constructorda yazdıgımız bilgiyi verecek.	
		 */
		Araba araba = new Araba();
		

	}

}
