package com.bilgeadam.constructor.ex;

public class OgretimGorevlisi extends Akademisyen implements IAkademisyenFonksiyolari {





	public OgretimGorevlisi(String ad, String soyad, int telefon, String eposta, String bolum, String unvan,
			int kapiNo) {
		super(ad, soyad, telefon, eposta, bolum, unvan, kapiNo);
	
	}

	@Override
	public void derseGir() {
		// TODO Auto-generated method stub
		
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
		return "OgretimGorevlisi [bolum=" + bolum + ", unvan=" + unvan + ", kapiNo=" + kapiNo + ", ad=" + ad
				+ ", soyad=" + soyad + ", telefon=" + telefon + ", eposta=" + eposta + "]";
	}
	
	
	

}
