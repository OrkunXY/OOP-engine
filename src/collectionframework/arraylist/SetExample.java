package collectionframework.arraylist;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {

		//Set
		//Benzersiz değelerin ya da Object'lerin bir yığın altında toplanması istenilen durumlarda kullanılır.
		//Set çalışma sisteminde anahtar ve değer vardır. Burada planda anahtarları kendisi oluşturur.
		//Tekrarlanan veriyi tek bir veri şeklinde yazdırır.
		
		//HashSet
		Set<String> hashSet = new HashSet<>();
		hashSet.add("Ankara");
		hashSet.add("İstanbul");
		hashSet.add("Zonguldak");
		hashSet.add("Zonguldak");
		//881293 --> "Ankara" değeri belli bir adrese setler bu nedenle aynı değerden iki tane bulundurmaz
		hashSet.add("Ankara");
		
		System.out.println(hashSet);
		
		//LinkedHashSet
		Set<String> linkedHashSet = new LinkedHashSet<String>();
		linkedHashSet.add("Ankara");
		linkedHashSet.add("İstanbul");
		linkedHashSet.add("Zonguldak");
		System.out.println(linkedHashSet);

	}

}
