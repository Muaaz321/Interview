package Numbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class CompareArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> arrOne = new ArrayList<String>(Arrays.asList("A","B","C","D","E"));
		ArrayList<String> arrTwo = new ArrayList<String>(Arrays.asList("F","G","H","I"));
		ArrayList<String> arrThree = new ArrayList<String>(Arrays.asList("F","G","H","I"));
		
		Collections.sort(arrOne);
		Collections.sort(arrTwo);
		
		System.out.println(arrOne.equals(arrTwo));
		System.out.println(arrTwo.equals(arrThree));
		
		
		ArrayList<String> lang1 = new ArrayList<String>(Arrays.asList("JAVA","PYTHON","RUBY","I"));
		ArrayList<String> lang2 = new ArrayList<String>(Arrays.asList("JAVA","PYTHON","RUBY"));
		
		System.out.println(lang1.remove(lang2));
		//System.out.println(lang1.retainAll(lang2));
		
	}

}
