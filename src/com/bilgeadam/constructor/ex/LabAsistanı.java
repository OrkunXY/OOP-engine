package com.bilgeadam.constructor.ex;

public class LabAsistanı extends Akademisyen implements IAkademisyenFonksiyolari{


	

	public LabAsistanı(String ad, String soyad, int telefon, String eposta, String bolum, String unvan, int kapiNo) {
		super(ad, soyad, telefon, eposta, bolum, unvan, kapiNo);
		
	}

	@Override
	public void derseGir() {
		System.out.println("Derse girildi...");
		
	}

	@Override
	public void quizYap() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void sinavYap() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String toString() {
		return "LabAsistanı [bolum=" + bolum + ", unvan=" + unvan + ", kapiNo=" + kapiNo + ", ad=" + ad + ", soyad="
				+ soyad + ", telefon=" + telefon + ", eposta=" + eposta + "]";
	}
	
	

}
