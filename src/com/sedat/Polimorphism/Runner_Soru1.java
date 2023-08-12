package com.sedat.Polimorphism;

public class Runner_Soru1 {

	public static void main(String[] args) {
		/**
		 * Java'da polimorfizm, farklı sınıfların veya veri tiplerinin 
		 * aynı arayüz veya üst sınıf altında birleştirilmesi ve
		 *  bu sınıfların nesnelerinin aynı yöntem adıyla farklı davranışlar sergilemesi anlamına gelir. 
		 *  Yani aynı isme sahip metodun farklı alt sınıflar tarafından farklı şekillerde uygulanabilmesini ifade eder.
		 *   Bu, kodun daha esnek ve genişletilebilir olmasını sağlar.
		 *   Polimorfizmi kullanarak, bir üst sınıf veya arayüzün referansını kullanarak alt sınıfların nesnelerine erişebilir
		 *   bu nesnelerin farklı şekillerde davranış sergilemesini sağlayabilirsiniz.
		 *   Bu sayede, kodunuz daha modüler hale gelir ve yeni sınıflar eklediğinizde veya
		 *   mevcut sınıfları değiştirdiğinizde diğer kod parçalarınız üzerinde minimum etki yaratır.	
		 */
		/**
		 * Simdi bunu acıklamak için bir kedi,köpek ve hayvan sınıfları olusturalım.
		 */
		
		Hayvan hayvan1 = new Kopek(); // normalde simdiye kadar hangi tipte nesne üretiyorsak o sınıfı kullanıyorduk.
		Hayvan hayvan2 = new Kedi();  // polimorphismde parent sınıfın referansıyla alt sınıfın nesnesi oluşturulabilir.
		
		hayvan1.sesCikar();			// Hayvan isimli sınıfa ait ses cikar methodu alt sınıfları tarafından override edildi.
		System.out.println();		// Hayvan sınıfının referanslarıyla olusturulan bu kedi ve köpek nesneleri
		hayvan2.sesCikar();			// ses cikar methodlarına ulasmıs ve farklı davranıslar göstermistir.!!!!
		
		

	}

}
