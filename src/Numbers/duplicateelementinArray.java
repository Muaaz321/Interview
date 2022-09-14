package Numbers;

import java.util.HashSet;
import java.util.Set;

public class duplicateelementinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// put the array in to Hashset
		// and make a condition whether it is already added
		
		String names [] = {"Java","Javascript","C" ,"Java"};
		
		Set<String> store = new HashSet<String>();
		
		for(String name  : names) {
			if(store.add(name)==false) {
				System.out.println("Duplicate is " + name);
			}
		}
			
	}

}
