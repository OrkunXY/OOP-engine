package com.bilgeadam.constructor.ex;

public class Calisan {
	//Calisan adında bir sınıf olacak --> ad, soyad,telefon, eposta özellikleri olacak
	//ve 4 parametreyi tanımlamak zorunlu olacak.
	
	
	//Akademisyen abstract sınıfı Calisan sınıfını inherit edecek
	//ve özellik olarak --> bölüm, ünvan, kapıNo olacak
	
	//-Metot olarak labDersineGir, yemekhaneyiKullan, deneyYap gibi metotlar alacak
	

	//IAkademisyenFonksiyonları adında bir interface olacak
	// ve içerisinde herkes için zoruynlu olan derseGir, quizYap, sınavYap metotları olacak
	

	//ÖğretimGörevlisi, Asistan, LabAsistanı alt sınıfları olacak
	//Bunlar abstract class ve interfaceleri inherit ve implement edecek
	
	//Gövdesiz metotların gövdeleri doldurulacak.Metotların dönüş tipi olmasına gerek yok.
	//Yalnızca konsola çıktı verecek.
	
	//Main'de ÖğretimGörevlisi, Asistan Lab Asistanı classlarından nesne üretilip çağrılacak
	
	public String ad;
	public String soyad;
	public int telefon;
	public String eposta;
	
	public Calisan(String ad, String soyad, int telefon, String eposta) {
		this.ad = ad;
		this.soyad = soyad;
		this.telefon = telefon;
		this.eposta = eposta;
	}
	
}
