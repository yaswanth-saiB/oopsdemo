package collections.demo;

import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;

//Set is a Unordered group of elements which stores unique elements only
public class HashSetDemo {

	public static void main(String[] args) {
		
		Set<String> programmingLanguages = new HashSet<>();
		
		 programmingLanguages.add("C");
	        programmingLanguages.add("C++");
	        programmingLanguages.add("Java");
	        programmingLanguages.add("Python");
	        programmingLanguages.add("PHP");
	        programmingLanguages.add("Ruby");
	        
	        programmingLanguages.add("Java");
	        programmingLanguages.add(null);
	        programmingLanguages.add(null);
	        
	       
	        
	        System.out.println("=== Iterate over a HashSet using iterator() ===");
	        Iterator<String> programmingLanguageIterator = programmingLanguages.iterator();
	        while (programmingLanguageIterator.hasNext()) {
	            String programmingLanguage = programmingLanguageIterator.next();
	            System.out.println(programmingLanguage);
	        }
	        
	        System.out.println("=== Iterate over a HashSet using simple for-each loop ===");
	        for(String programmingLanguage: programmingLanguages) {
	            System.out.println(programmingLanguage);
	        }

	        HashSet<String> pl = new HashSet<>(programmingLanguages);
	        
	        System.out.println(pl);
	        
	        HashSet<String> clonepl = new HashSet<>();// empty hash set
	        
	        // clone the Hashset
	        clonepl=(HashSet<String>) pl.clone();
	        
	        //display new set after cloning
	        System.out.println(clonepl);
	}

}
