
public class School implements Student{

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("from interface");
	}

	@Override
	public void drink() {
		// TODO Auto-generated method stub
		System.out.println("from interface");
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("from interface");
	}

	
	public static void main(String[] args) {
		
		// create object on interface
		Student schoolObj = new School();
		System.out.println(schoolObj.number);
		schoolObj.number = 40; // we cant access interface variable it is final
	}
}
