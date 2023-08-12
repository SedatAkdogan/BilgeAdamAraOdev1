package com.sedat.Inheritance;

import com.sedat.Inheritance.entity.Isci;
import com.sedat.Inheritance.entity.Mudur;
import com.sedat.Inheritance.entity.Muhendis;
import com.sedat.Inheritance.entity.Ustabasi;

public class Runner_Soru2 {

	public static void main(String[] args) {
		/*
		 * Çoklu kalıtımın desteklenmesi durumunda,
		 * bir sınıfın birden fazla üst sınıftan özellik ve davranış miras alabileceği durumlar ortaya çıkar.
		 * Bu durum, özellikle farklı üst sınıfların aynı isimde metot veya özelliklere
		 * sahip olması durumunda karışıklıklara ve çakışmalara yol açabilir. 
		 * Çoklu kalıtım, kod karmaşıklığını artırabilir.
		 *  Bir sınıf birden fazla üst sınıftan özellikler ve davranışlar miras alıyorsa
		 *   sınıfın işlevselliği ve yapısı daha zor anlaşılır olur.
		 *   Javada bu tip durumların önüne gecen daha kontrollü bir miras alma mekanizması olan 
		 *   Interface kullanılabilir.Interface sınıflara belli metotları kullanma zorunlulugu getirir.
		 *   Aynı zamanda da coklu kalıtımın yarattıgı belirsizliklere yol açmaz.
		 */
		/**
		 * Interface ler sözleşmeler olarak nitelendirilir.
		 * Yazılım geliştirirken belli kurallara uymak,
		 * Yazılım düzenini korumak için kullanılırlar.
		 * Ayrıca sınıfların referanslarını taşıyabilirler.
		 * 1- Interfacelerde method tanımları erişim belirteci içermez!!.
		 * 2- Methodların gövdeleri yoktur..
		 */
		
		Isci isci = new Isci();
		isci.save();
		isci.update();
		isci.delete(isci.id);
		System.out.println();
		
		Ustabasi ustabasi = new Ustabasi();
		ustabasi.save();
		ustabasi.update();
		ustabasi.delete(ustabasi.id);
		System.out.println();
		/**
		 * Burda gözüktüğü üzere eğer bir sınıfın extend edildiği bir sınıf var,ayrıca da implements 
		 * edildiği ayrı bir interface varsa extend edilen personel sınıfını interface'e implement etmek
		 * cocuk sınıfların kullanması için yeterli ve gereklidir.
		 * parent sınıf olan personel sınıfına giderseniz IPersonel isimli 
		 * interface'in içinde olan methodların yazılmak zorunda oldugunu görürsünüz.
		 *
		 */
		
		/**
		 * Mudur ve muhendis sınıflarını personel sınıfında extend etmeyip sadece Ipersonel
		 * interface'ine implement edelim ve kullanım sekline bakalım.
		 * Burada mudur ve muhendis sınıfları ilk implement edildiğinde hata verecektir
		 * Çünkü interface icindeki methodların implement edilen alt sınıflarda override edilmesi gerekmektedir.
		 */
		
		Mudur mudur = new Mudur();
		mudur.save();
		mudur.update();
		mudur.delete(mudur.id);
		mudur.hareket();
		mudur.arabaKullan();
		System.out.println();
		
		Muhendis muhendis = new Muhendis();
		muhendis.save();
		muhendis.update();
		muhendis.delete(muhendis.id);
		muhendis.hareket();
		muhendis.arabaKullan();
		/**
		 * Burada hem mudur hem de muhendis için son 2 satırlardaki
		 * hareket et ve araba kullan methodları IPersonel2 implementsinden gelerek
		 * kendi sınıfları içinde methodları override edilerek kullanılmıstır.
		 * Buradan anlayacagımız Java da Interfaceler kullanılarak sınıflara  birden fazla
		 * tipte özellikler kazandırılabilir.Bu interface kullanılarak çoklu kalıtım simülesidir.
		 * Not : Hocam ödevi yapmaya baslarken bunu bir tekrar calısması olarak gördüğüm için 
		 * interfacein her türlü uygulamasına bakmaya calıstım.
		 * Bu sebeple cevapta fazlalıklar var.
		 */
		

	}

}
