package com.sedat.Abstract;

public class Runner_Soru3 {

	public static void main(String[] args) {
		
		/*
		 * Daha öncelerde soyut sınıfların hem normal sınıflar gibi hem de interfaceler gibi kullanılabildiğini söylemiştik.
		 * Soyut sınıflar bu ikisi arasında bir yerlerde gibi düsünülebilir.
		 * Soyut sınıflar ve interfaceler arasında bazı farklar vardır bunlar su sekildedir;
		 *1- Soyut sınıflar, içlerinde soyut metotlar (abstract methods) ve normal methodlar bulundurabilen sınıflardır.
		 * Interfaceler, yalnızca soyut metotlar ve sabit (static final) değişkenler içeren yapılardır. 
		 * 2-Bir sınıf, en fazla bir tane soyut sınıfı genişletebilir (extends).
		 * Fakat interfaceler için bir sınıf birden fazla interface'i uygulayabilir.(implements)
		 * 
		 * Genel olarak, soyut sınıflar daha fazla yapı ve davranış içerebilirken, arayüzler daha soyut ve genel bir şablondur
		 * Hangisini kullanacağınız, tasarım gereksinimlerinize ve projenizin yapısına bağlıdır.
		 */
		
		/*
		 * Simdi bunlara örnek olusturmak için hem soyut sınıf ve alt sınıflarını hem de interface ve alt sınıflarını olusturalım.
		 * Soyut sınıf için soru-1 de kullandıgımız geometrik sekil soyut sınıfını kullanalım.
		 * 
		 * interface için ise Oynatabilir isimli bir arayüz sonra da müzikcalar ve videoOynatici isimli iki sınıf olusturalım.
		 */
		
		
		
		GeometrikSekil dikdortgen = new Dikdortgen(7, 8);
		System.out.println("Dikdortgenin alani......: " + dikdortgen.alanHesapla());
		System.out.println();
		// burada alanhesapla methodunu abstract olarak tanımlayıp dikdortgen sınfıında override edilmesini zorunlu kıldık.
		dikdortgen.alaniEkranaYazdir(10, 8); // burada ise olusturdugmuz method abstract degildi kendimiz isteyerek override ettik 
		// soyut method degil istemeseydik kullanmazdık.
		
		// yani abstract class hem interface gibi hem de normal sınıf gibi kullanılabilir.
		
		System.out.println("---------------------------------------------------------------------------------------------------------------");
		
		IOynatabilir muzikCalar = new MuzikCalar("I Want It That Way");
		muzikCalar.oynat();
		IOynatabilir videoOynatici = new VideoOynatici("Fighting Monkeys");
		videoOynatici.oynat();
		
		/**
		 * IOynatabilir arayüzünde olusturdugumuz oynat methodu implement edilen müzikcalar ve videooynatici sınıflarında
		 * override edilmeye mecbur bırakılmıstır.Arayüzün içinde soyut olmayan method bulunamaz.
		 */
		

	}

}
