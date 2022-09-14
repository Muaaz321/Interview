package OOP;

interface DogInterface {
	
	// we can implement what need to be done like following
	//public void bark() {System.out.println("barks .....");}
	
	void poop(); // implements in interface 
	
}

abstract class Dog {
	
	public void bark() {
		System.out.println("Bark......");
	}
	
	// abstract enforces user to implement following method
	public abstract void poop();
	
	/*
	 * 
	 * 
	 * make sure relevant method is need to implement
	 * also 
	 * user can define what those method can do eg: bark()
	 * not like interface 
	 * interface we cant say how method should work
	 * 
	 * 
	 * */
}

class Chihuaha extends Dog {
	
	public void poop() {
		System.out.println("Dog Pooped");
	}
	
}

public class abstractTutorial {

	public static void main(String[] args) {
	
		/*
		 * "bark" method  cannot be called by initializing 
		 * this is abstract class
		 * 
		 * */
		//Dog myDog = new Dog();
		//myDog.bark();
		
		/*
		 * "bark" method can be called via chihuaha class
		 * because this extends the abstract class
		 * 
		 * */
		Chihuaha myChi = new Chihuaha();
		myChi.bark();
		myChi.poop();
	}
}
