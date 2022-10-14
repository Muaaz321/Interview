package Abstract;

//to use abstract class use extends from Car
public class vehicle extends Car{
	
	void made() {
		System.out.println("vehicle made in Sri Lanka");
	}
	
	void Accerelator() {
			System.out.println("This is from Abstract Car");
	}

	void Break () {
		System.out.println("This is from Abstract Car");
	}

public static void main(String[] args) {
	
	vehicle vhc = new vehicle();
	vhc.made();
	
	
}
}
