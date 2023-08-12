package com.sedat.Encapsullation;

public class Runner_Soru1 {

	public static void main(String[] args) {
		/**
		 * Kapsülleme (encapsulation), nesne yönelimli programlamanın temel prensiplerinden biridir.
		 * Java gibi nesne yönelimli dillerde büyük öneme sahiptir. Kapsülleme, verileri (alanları)
		 *  bu verilere erişim yöntemlerini (metotları) bir araya getirerek, 
		 * verilere sadece belirli yetkilerle ve güvenli bir şekilde erişim sağlanmasını amaçlar.
		 * Kapsüllemenin neden önemli olduguna dair bazı nedenleri sıralayalım.
		 * 		1-Gizlilik ve Güvenlik: Kapsülleme, sınıf içindeki verilerin (alanlar) doğrudan erişilemez olmasını sağlar.
		 * Bu, verilerin istenmeyen değişikliklerden veya dışardan erişimden korunmasını sağlar.
		 * Verilere sadece belirli metotlar aracılığıyla erişilebilir ve değiştirilebilir.
		 * Bu sayede verilerin güvenliği ve bütünlüğü sağlanır.
		 * 		2-Kod Bakımı ve Esneklik: Kapsülleme, sınıf içindeki veri yapısını gizleyerek,
		 *  sınıfın iç detaylarının dış dünyaya etkisi azaltır. Bu sayede sınıf içinde yapılan değişiklikler,
		 *  dışarıdaki kodları etkilemez. Bu durum, kodun daha esnek ve bakımı daha kolay hale gelmesini sağlar.
		 *  	3-Sınıf Arabirimi (Interface): Kapsülleme, sınıfların arayüzlerini (interfaces) oluşturmayı kolaylaştırır.
		 * Sınıfın iç detayları gizlenirken,sadece dış dünyayla etkileşime geçen metotlar arayüze eklenir.
		 * Bu, sınıfın kullanımını ve anlaşılabilirliğini artırır.
		 * 		4-Kod Okunabilirliği: Kapsülleme, sınıfın kullanımını daha anlaşılır hale getirir.
		 * Alanların doğrudan erişimi yerine, metotlar aracılığıyla erişim sağlandığında,
		 * kodun okunabilirliği artar çünkü metot isimleri genellikle daha anlamlı ve açıklayıcı olur.
		 *  Java'da kapsülleme, private, protected ve public gibi erişim belirleyicilerle desteklenir.
		 *   Bu belirleyiciler sayesinde sınıfın içindeki alanları ve metotları nasıl paylaşacağınızı kontrol edebilirsiniz.
		 */

		Ogrenci ogrenci = new Ogrenci("Sedat",26);
		
		System.out.println(ogrenci.getAd());
		System.out.println(ogrenci.getYas());
		System.out.println();
		
		ogrenci.setAd("Alperen");
		ogrenci.setYas(29);
		System.out.println(ogrenci.getAd());
		System.out.println(ogrenci.getYas());
		
		/**
		 * Bu örnekte, Ogrenci sınıfı kapsülleme örneğini temsil eder. 
		 * Sınıfın ad ve yas adında özel alanları (private fields) bulunur.
		 *  Bu alanlara doğrudan erişim engellenmiş,(private olarak tanımlanmış)
		 *  Ancak bu alanlara erişim sağlamak için getter ve setter metotları tanımlanmıştır. 
		 * Getter metotları verilere erişim sağlar, setter metotları ise verilerin güvenli bir şekilde değiştirilmesini sağlar.
		 */
		
		
		
		
		
		
		
		
	}

}
