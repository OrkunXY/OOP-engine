package collectionframework.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {

		//Collection interface'inden List, Map, Set vb. yapılar türüyor.
		List<Object> arrayList = new ArrayList<>(); //Obje türü yani her türden eklenebilir
		
		arrayList.add("Ankara");
		arrayList.add("Bursa");
		arrayList.add("İstanbul");
		arrayList.add("Trabzon");
		arrayList.add("Zonguldak");
		arrayList.add("Ankara");
		
		List<Object> arrayList2 = new ArrayList<>();
		arrayList2.add("Türkiye");
		arrayList2.add("Almanya");
		
		//add(index, value) --> 2 index arasına değer ekleme
		arrayList.add(1,"Antalya");
		System.out.println(arrayList);
		
		//clear --> Listedeki elemanları siler
	/*	arrayList.clear();
		System.out.println(arrayList);
	*/		
		
		//arrayList.remove("Zonguldak");
	/*	arrayList.remove(0);
		System.out.println(arrayList);
	*/	
		//set --> indexe verilen değeri değiştirir
		arrayList.set(2, "Bolu");
		System.out.println(arrayList);
		
		//isEmpty --> listenin içeriğini kontrol eder
	/*	if(!arrayList.isEmpty()) {
			System.out.println("Liste dolu");
		}
	*/	
	/*	get --> seçilen index'e karşılık gelen değeri gösterir
		System.out.println("Listenin " + arrayList.get(3));
	*/	
	/*	indexOf --> liste içerisindeki değerin ilk index numarasını gösterir
		System.out.println(arrayList.indexOf("Ankara"));
	*/	
	/*	lastindexOf --> liste içerisindeki değerin son index numarasını gösterir
		System.out.println(arrayList.lastIndexOf("Ankara"));
	*/
	/*	addAll --> verilen index değerinden başlayarak yeni bir koleksiyon ekler
		arrayList.addAll(arrayList2);
		System.out.println(arrayList2);
	*/
	/*	contains --> belirtilen nesneyi dizi de arar, varsa true yoksa false döndürür
		boolean varMi = arrayList.contains("Çanakkale");
		System.out.println(varMi);
	*/
		arrayList.forEach(item -> System.out.println(item));
		
		
		
	}

}
