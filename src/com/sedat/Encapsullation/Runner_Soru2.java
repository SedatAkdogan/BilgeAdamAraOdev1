package com.sedat.Encapsullation;

public class Runner_Soru2 {

	public static void main(String[] args) {
		/**
		 * Java programlama dilinde private, public ve protected kelimeleri, "Erişim Belirleyiciler" olarak kullanılır.
		 *Sınıfların alanları (fields) ve metotları (methods) için erişim düzeyini kontrol etmek için kullanılır.
		 *Bu belirleyiciler, nesne yönelimli programlamanın temel prensiplerinden biri olan kapsüllemeyi (encapsulation) uygulamayı sağlar.
		 *  
		 *		1-private : private Erişim belirleyici,bir alanın veya metotun sadece aynı sınıf içinden erişilebilir olduğunu belirtir.
		 * Bu durum, alanın veya metotun dış dünyadan gizlenmesini sağlar.
		 * 		
		 * 		2-public : public erişim belirleyici, bir alanın veya metotun herhangi bir yerden erişilebilir olduğunu belirtir.
		 * Bu, sınıfın dışındaki kodlar tarafından da erişim sağlanabileceği anlamına gelir.
		 *  
		 *  	3- protected : erişim belirleyici, bir alanın veya metotun aynı sınıf içinden,
		 * aynı paketten ve alt sınıflardan erişilebilir olduğunu belirtir. protected kullanımı,
		 * özellikle kalıtım (inheritance) durumlarında alt sınıfların üst sınıfın korumalı üyelerine erişimini sağlar.
		 *  
		 */
		
		/**
		 * Bir araba sınıfı olusturup bunlara örnekler verelim.
		 */
		
		Araba araba = new Araba();
		araba.marka ="Mercedes";     // public field
		System.out.println("Arabanin markasi....." + araba.marka);
		
		araba.calistir(); // public method
		System.out.println();
		
		// araba.hiz = 100 --> private field oldugu için erisilemez hata verir.
		// araba.hiziAyarla(); --> private method oldugu için erisilemez hata verir
		
		 araba.hiziGoster(); // protected method aynı pakette erisim var
		 araba.motorCalisiyor = false; // protected field aynı pakette erisim var.
		System.out.println(araba.motorCalisiyor);

	}

}
