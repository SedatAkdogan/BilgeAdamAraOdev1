package com.sedat.Inheritance.entity;

public class Personel implements IPersonel {
	
	public long id;
	public String ad;
	public String adres;
	public String telefon;
	
	
	
	public Personel() {
		System.out.println("Personel default constructoru calisiyor...");
	}
	public Personel(long id,String ad) {
		this.id =id;
		this.ad=ad;
		System.out.println("Personel parametreli constructoru calisiyor.....");
	}


	public void kayit() {
		System.out.println("Personel kayit edildi.");
	}


	@Override
	public void save() {
		System.out.println("Personel kayit edildi.");
		
	}


	@Override
	public void update() {
		System.out.println("Personel update edildi.");
		
	}


	@Override
	public boolean delete(Long id) {
		System.out.println("Personel id si sistemden kaldırıldı.");
		return false;
	}


	

}
