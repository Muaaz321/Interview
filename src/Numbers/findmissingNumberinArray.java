package Numbers;

public class findmissingNumberinArray {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// loop the array with missing number
		// add to a variable x
		// loop the array with correct number order
		// add to a variable y
		// deduct y - x
		
		int a[] = {1,2,3,5};
		int sum = 0;
		
		for(int i=0;i<a.length;i++) {
			sum= sum + a[i];
			//System.out.println(sum);
		}
		
		int sum1=0;
		for(int x=0;x<=5;x++) {
			sum1 = sum1 + x;
			System.out.println(sum1);
		}
		
		System.out.println("Missing Number : " + (sum1 - sum));
	}

}
