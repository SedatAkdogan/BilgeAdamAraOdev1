package com.sedat.Polimorphism;

public class Runner_Soru3 {

	public static void main(String[] args) {
		/**
		 * Javada polimorphism hem statik hem de dinamik olarak gerceklestirilebilir.
		 * 1- Statik(Compile-Time) Çok Biçimlilik : Statik çok biçimlilik, metot aşırı yüklemesi (method overloading) yoluyla gerçekleştirilir. 
		 * Aynı sınıf içinde veya farklı sınıflar arasında aynı isme sahip ancak farklı parametre listelerine sahip metotlar tanımlanabilir.
		 * Derleme anında, hangi metotun çağrılacağına verilen argümanların sayısı ve türüne göre karar verilir. 
		 * Statik çok biçimlilik, daha çok aynı işlevi yerine getiren farklı versiyonlarının kod tekrarı olmadan çağrılmasını sağlar.
		 * 
		 * 2- Dinamik(Run-Time) Çok Biçimlilik : Dinamik çok biçimlilik, sınıf hiyerarşisinde üst sınıfın veya arayüzün referansını kullanarak 
		 * alt sınıfların nesnelerine erişimi ifade eder.
		 * Alt sınıflar, aynı isme sahip ancak farklı davranışlara sahip metotları override ederler.
		 *  Bu sayede, nesnelerin davranışı çalışma zamanında belirlenir.
		 *  
		 * !!!!Farklı olan şey, statik çok biçimliliğin derleme zamanında, dinamik çok biçimliliğin ise çalışma zamanında gerçekleşmesidir.
		 *   Statik çok biçimlilik aşırı yükleme (overloading) ile ilgilidirken, dinamik çok biçimlilik aşırı yazma (overriding) ile ilgilidir.
		 */
		
		// Dinamik çok biçimliliğe bir örnek verecek olursak bu pakette olusturdugumuz geometrik sekil interfacesi ve dikdortgen,daire sınıfları 
		// ilişkisini verebiliriz.Override edilen alan hesapla methodunun main içerisinde cagırıp kullanılması dinamik çok biçimlilik ornegidir.
		
		IGeometrikSekil daire = new Daire(4);
		IGeometrikSekil dikdortgen = new Dikdortgen(5, 5);
		System.out.println("Dairenin alanı....: " + daire.alanHesapla());
		System.out.println("Dikdortgenin alani.....: " + dikdortgen.alanHesapla());
		System.out.println("*************************************************************************************************");
		
		/*
		 * Statik cok bicimlilik ornegi vermek adına bir hesaplama sınıfı olusturacagım.Bu sınfın içerisinde aynı isimde(topla)
		 * 2 method var bir tanesi integer parametrelerle calısıyor digeri ise double parametrelere calısıyor.
		 * Hangisini kullanacagımıza derleme zamanında karar vereceğiz.Bu da statik çok biçimliliğe bir örnektir.
		 * 
		 */
		Hesaplama hesaplama = new Hesaplama();
		
		
		System.out.println("İki integerin toplami......: " + hesaplama.topla(56, 43));
		System.out.println();
		System.out.println("İki double sayinin toplami.....: " + hesaplama.topla(56.0, 43.0));
		
		
		
		

	}

}
