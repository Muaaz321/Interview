package Numbers;

import java.util.Iterator;
import java.util.stream.IntStream;

public class print1to100 {

	public static void main(String[] args) {
		// Print from 1 to 100 without using any numbers in your code
		
		int one = 'A' / 'A';
		System.out.println(one);
		
		// ASCII Value d = 100;
		for(int i=one;i<'d';i++) {
			System.out.println(i);
		}
		
		// Print from 1 to 100 without using for while do-while loop
		IntStream.range(1, 101).forEach(e->System.out.println(e));

	}

}
