package com.sedat.Inheritance.entity;

public class Mudur implements IPersonel , IPersonel2 {
	
	public long id;

	@Override
	public void save() {
		System.out.println("Mudur bilgileri kayit edildi.");
		
	}

	@Override
	public void update() {
		System.out.println("Mudur bilgileri güncellendi.");
		
	}

	@Override
	public boolean delete(Long id) {
		System.out.println("Mudur idsi sistemden kaldırıldı.");
		return false;
	}

	@Override
	public void hareket() {
		System.out.println("Mudur hareket ediyor.");
		
	}

	@Override
	public void arabaKullan() {
		System.out.println("Mudur araba kullaniyor.");
		
	}

}
