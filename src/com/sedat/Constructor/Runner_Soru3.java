package com.sedat.Constructor;

public class Runner_Soru3 {

	public static void main(String[] args) {
		/**
		 * Java'da copy constructor, bir sınıfın mevcut bir nesnesinin kopyasını almak için kullanılan bir constructor türüdür. 
		 * Copy constructor, bir nesneyi başka bir nesneye kopyalarken, kopyalanan nesnenin aynı verilere sahip olmasını sağlar.
		 *  Bu kopyalama işlemi, nesne üzerinde değişiklik yaparken orijinal nesneyi etkilemeden çalışmayı kolaylaştırabilir.
		 *  Copy constructor, verilerin güvenli bir şekilde kopyalanmasını sağlar ve nesneler arasında bağımsızlığı korur.
		 */
		
		
		Musteri musteri1 = new Musteri("Sedat",26);
		Musteri musteri2 = new Musteri(musteri1);
		
		musteri1.bilgileriYazdir();
		System.out.println("------------------------------");
		musteri2.bilgileriYazdir();
		
		
		/**
		 * Bu örnekte müsteri sınıfının copy constructorunu tanımladık.Müsteri sınıfının propertiesleri olan
		 * ad ve yas copy constructor içinde kopyalama islemiyle aktarıldı.
		 */
		

	}

}
