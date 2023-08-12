package com.sedat.Inheritance.entity;

public class Muhendis implements IPersonel,IPersonel2 {
	public long id;

	@Override
	public void save() {
		System.out.println("Muhendis bilgileri kayıt edildi.");
		
	}

	@Override
	public void update() {
		System.out.println("Muhendis bilgileri guncellendi.");
		
	}

	@Override
	public boolean delete(Long id) {
		System.out.println("Muhendis id si sistemden kaldırıldı.");
		return false;
	}

	@Override
	public void hareket() {
		System.out.println("Muhendis hareket ediyor.");
		
	}

	@Override
	public void arabaKullan() {
		System.out.println("Muhendis araba kullaniyor.");
		
	}

}
