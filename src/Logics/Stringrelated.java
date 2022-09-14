package Logics;

public class Stringrelated {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// String reverse
		String mystring = "this is my interview project";
		StringBuffer sf = new StringBuffer(mystring);
		System.out.println("This is reverse " + sf.reverse());
		
		//remove junk string
		String myJunktexts = "#### @@ seleniumTest $## %$%**";
		myJunktexts = myJunktexts.replaceAll("[^a-zA-Z0-9]", "");
		System.out.println(myJunktexts);
		
		//reverse integer
		long Number = 123456789;
		System.out.println(new StringBuffer(String.valueOf(Number)).reverse());
		
		

	}

}
