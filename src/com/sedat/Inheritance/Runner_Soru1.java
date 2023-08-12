package com.sedat.Inheritance;

import com.sedat.Inheritance.entity.Ustabasi;

public class Runner_Soru1 {
	
	/**Javada bir sınıfın baska bir sınıftan kalıtım almasını saglayan anahtar kelime "extends" dir.
	 * Bu kelime anlam olarak genişletmek,yaymak gibi anlamlar içerir.
	 * Extend işlemi, bir üst sınıfın (ebeveyn sınıfın)
	 * özelliklerini alt sınıfa (çocuk sınıfa) aktarır. 
	 * 
	 * @param args
	 */

	public static void main(String[] args) {
		
		Ustabasi ustabasi = new Ustabasi();
		ustabasi.id=4546;
		ustabasi.ad ="Sedat";
		ustabasi.adres ="Istanbul";
		ustabasi.telefon ="0 555 555 5555";
		
		System.out.println(ustabasi.id);
		System.out.println(ustabasi.ad);
		System.out.println(ustabasi.adres);
		System.out.println(ustabasi.telefon);
		
		ustabasi.kayit();
		/*
		 * Bu uygulamada yazdıgımız kodda, normalde ustabası sınıfında herhangi bir properties olmamasına ragmen
		 * personel sınıfı extend edildigi yani miras alındıgı için personel sınıfındaki propertiesler ve methodlar
		 * ustabası sınıfından nesne olusturdugumuz takdirde çağrılıp kullanılabilir.
		 */

	}

}
