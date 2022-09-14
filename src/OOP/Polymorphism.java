package OOP;

class Bird {
	public void sing() {
		System.out.println("tweet tweet tweet");
	}
	
}

class Robin extends Bird {
	// overriding from Bird class
	public void sing(String song) {
		System.out.println("robin robin robin" + song);
	}
}

class Raven extends Bird{
	
	// overriding from Bird class
	
	// overloading
	public void sing() {
		System.out.println("kakak kakak kakak");
	}
	
	// overloading
	public void sing(String s,String s1) {
		System.out.println(s + s1);
	}
	
	// overloading
	// for overloading return type doesnt count
	public int sing(int a , int b) {
		return b;
	}
}

public class Polymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Robin b = new Robin();
		b.sing("ffdfff fdf ");
		
		
	}

}
