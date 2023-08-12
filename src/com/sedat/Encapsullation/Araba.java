package com.sedat.Encapsullation;

public class Araba {
	
		public String marka;
		private int hiz;
		protected boolean motorCalisiyor;
		
		public void calistir() {
			motorCalisiyor = true;
			System.out.println("Araba calisiyor.....");
		}
		
		private void hiziAyarla(int hiz) {
			System.out.println("Hiz ayarlandi.....");
		}
		
		protected void hiziGoster() {
			hiz = 120;
			System.out.println("Arabanin hizi...: " + hiz);
		}

}
