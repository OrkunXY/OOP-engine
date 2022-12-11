package collectionframework.arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample2 {

	public static void main(String[] args) {

		//Bazı şehirlerin olduğu bir liste olsun
		//Bu listede ilk iki harfi 'an' ile başlayanlar var ise bu şehir 'xxx' ile değişsin
		
		
		List<String> arrayList = new ArrayList<>(); //Obje türü yani her türden eklenebilir
		
		arrayList.add("Ankara");
		arrayList.add("Bursa");
		arrayList.add("İstanbul");
		arrayList.add("Trabzon");
		arrayList.add("Zonguldak");
		
		for(int i=0; i < arrayList.size(); i++) {
			if(arrayList.get(i).toLowerCase().startsWith("an")) {
				arrayList.set(i,"xxx");
			}
		}
		for(String array : arrayList) {
			System.out.println(array);
		}

	}

}
