package Numbers;

public class largestsmallestnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Loop the array
		// inside the array assign largest number by looking greater than
		// inside the array assign smallest number by looking smaller than
		
		int numbers [] = {1,2,3,4,5,6,7,8,8};
		int largest = numbers[0];
		int smallest = numbers[0];
		
		for(int i=0;i<numbers.length;i++) {
			
			if(numbers[i]>largest) {
				largest = numbers[i];			
			} 
			else if (numbers[i]<smallest) {
				smallest = numbers[i];
				
			}			
	}
		System.out.println("Largest number is " + largest);
		System.out.println("Smallest number is " + smallest);
	}

}
