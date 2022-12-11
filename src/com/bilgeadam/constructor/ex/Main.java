package com.bilgeadam.constructor.ex;

public class Main {

	public static void main(String[] args) {
		
		
		OgretimGorevlisi og = new OgretimGorevlisi("Ogorevlisi","Ogorevlisioglu",65566,"blabal@sadas.com","Fen","Ogretim Gorevlisi",12);
		System.out.println(og);
		og.derseGir();
		og.sinavYap();
		og.yemekhaneyiKullan();
		System.out.println();
		
		
		Asistan as = new Asistan("Asistan","Asistanoglu",231321,"blabal@jdads.com","Fen","Asistan",12);
		System.out.println(as);
		
		as.derseGir();
		as.sinavYap();
		as.yemekhaneyiKullan();
		System.out.println();

		
		LabAsistanı la = new LabAsistanı("LabAsistanı","LabAsistanıoglu",321321,"bakuetkwe@sdakda.com","Fen","LabAsistanı",12);
		System.out.println(la);
		
		la.labDersineGir();
		la.deneyYap();
		la.yemekhaneyiKullan();

	}

}
