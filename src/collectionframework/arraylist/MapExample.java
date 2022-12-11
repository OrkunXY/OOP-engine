package collectionframework.arraylist;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapExample {

	public static void main(String[] args) {
		
		//key-value çiftleri ile çalışırlar
		//06-Ankara
		//key ler unique(tektir), aynı key ikinci kez yazılırsa o key yeni değerleriyle set edilmiş olur
		//06-İstanbul
		
		//HashMap
		//Kendi algoritmasına göre sıralama yapar. Arka planda girilen key-value çiftlerini hash'ler ve karışık bir sırayla getirir
		//Örneğin 06-Ankara, 34-İstanbul, 01-Adana
		Map<String,Object> hashMap = new HashMap<>();
		
		hashMap.put("name", "Ali");
		hashMap.put("surname", "Bilir");
		hashMap.put("yaş", "26");
		
		System.out.println(hashMap);
		
		hashMap.put("name", "Ahmet");
		System.out.println(hashMap);
		
		System.out.println("----------------------------------------------------------------------");
		
		//LinkedHashMap
		//Sıralama algoritması önemli olduğu yerlerde kullanılır.
		Map<String,Object> linkedHashMap = new LinkedHashMap<>();
		linkedHashMap.put("name", "Ali");
		linkedHashMap.put("surname", "Bilir");
		linkedHashMap.put("yaş", "26");
		linkedHashMap.put("telefon", "055555555");
		linkedHashMap.put("cinsiyet", "Erkek");

		System.out.println(linkedHashMap);
	}

}
