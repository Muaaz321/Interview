package Abstract;

public abstract class Car {

	
	abstract void Accerelator();
	abstract void Break();
	
	void eat() {
		System.out.println("This is a normal method");
	}

	// we cant create object in abstract
	public static void main(String[] args) {
		//Car myCar = new Car();
	}
}
