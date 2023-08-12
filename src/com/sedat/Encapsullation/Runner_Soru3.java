package com.sedat.Encapsullation;

public class Runner_Soru3 {

	public static void main(String[] args) {
		/**
		 * Getter ve setter metodları, sınıfın private alanlarına (fields) 
		 * dışarıdan güvenli bir şekilde erişmek ve bu alanları değiştirmek için kullanılır.
		 *  Bu metodlar, kapsülleme (encapsulation) prensibini uygulayarak 
		 * verilerin (alanların) doğrudan erişimine karşı koruma sağlar ve sınıfın iç yapısının dış dünyaya gizlenmesini sağlar.
		 * Getter ve setter metodlarının amacı şunlardır:
		 * 
		 * 		1- Veri Erisim Kontrolü :Getter ve setter metodları, alanlara sınırlı ve güvenli bir erişim sağlar.
		 *  Alanlara doğrudan erişimin engellenmesiyle, alanların istenmeyen şekillerde değiştirilmesi ve kullanılması önlenir. 
		 * Sınıf yazarı, hangi alanların erişilebilir ve değiştirilebilir olacağını kontrol eder.
		 * 		2- Veri Doğrulama : Setter metodları, alanlara veri girilirken doğrulama ve kontroller yapmak için kullanılabilir.
		 *  Bu sayede geçersiz veya istenmeyen verilerin atanması önlenebilir.
		 *  Örneğin, yaş gibi bir alan için negatif bir değerin atanmasını engellemek mümkündür.
		 *  	3- Esneklik ve Bakım Kolaylıgı : Getter ve setter metodları, alanların iç yapısını değiştirmeden,
		 *   dışarıdaki kodun aynı şekilde çalışmasını sağlar.
		 *   Bu, sınıfın iç yapısında değişiklik yapılmasının, sınıfın dışındaki kodlara minimum etkisi olmasını sağlar.
		 *   Bu da kodun bakımını ve geliştirilmesini kolaylaştırır.
		 */
		
		/**
		 * Runner Soru 1 de kapsüllemenin nasıl uygulandıgını islerken olusturdugumuz "ogrenci" sınıfındaki 
		 * Getter ve setter methodlarını burada da kullanalım.
		 * 
		 */
		Ogrenci ogrenci = new Ogrenci("Sedat", 26);
		
		System.out.println(ogrenci.getAd()); // burada olusturdugumuz ogrenci nesnesine ilk basta atadıgımız degerleri bize
		System.out.println(ogrenci.getYas()); // donmesi için getter methodlarını kullandık.
		System.out.println();
		
		ogrenci.setAd("Ercüment");
		ogrenci.setYas(19);
		System.out.println(ogrenci.getAd()); // burada da setter methodunu kullanarak bu verilerin degerlerini degistirdik.
		System.out.println(ogrenci.getYas()); // eger istersek bu setter methodlarından bir tanesini ogrenci sınıfında sileriz.
		// Eğer bunu yaparsakta o fieldin buradan degistirilmesini engelleriz.
		
		
		
	}

}
