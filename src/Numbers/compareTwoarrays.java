package Numbers;

public class compareTwoarrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int first[] = {10,20,30,40,50,60};
		int second[] = {10,20,30,40,50,60,60};
		
		if (compareArray(first, second))
			System.out.println("Same");
		else
			System.out.println("Not Same ");
		
		
		
	}
	
	
	public static boolean compareArray(int a[],int b[]) {
		// checking the length , if length not match return false
		if(a.length!=b.length)
			return false;
		
		// iterate a array
		// checking the elements of 'a' array and 'b' array
		// if not match return false
		// if match return true
		
		for(int x=0;x<a.length;x++) {
			if(a[x] !=b[x])
				return false;
		}
		
		return true;
	
	}
	
	

}
