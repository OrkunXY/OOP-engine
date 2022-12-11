package com.bilgeadam.constructor.ex;

public abstract class Akademisyen extends Calisan{

	
	public String bolum;
	public String unvan;
	public int kapiNo;
	
	
	public Akademisyen(String ad, String soyad, int telefon, String eposta, String bolum,String unvan, int kapiNo) {
		super(ad, soyad, telefon, eposta);
		this.bolum = bolum;
		this.unvan = unvan;
		this.kapiNo = kapiNo;
	}
	
	public void labDersineGir() {
		System.out.println("Lab dersine girildi...");
	}
	
	public void yemekhaneyiKullan() {
		System.out.println("Yemekhane kullanıldı...");
	}
	
	public void deneyYap() {
		System.out.println("Deney yapıldı, patlama oldu...");
	}

	

}
