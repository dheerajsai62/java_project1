package assignment;

public class Assignment_6 {
	
	public void non_static() {
		System.out.println("This is method 1");
	}
	public void non_static1() {
		System.out.println("This is method 2");
	}
	public void non_static2() {
		System.out.println("This is method 3");
	}

	public static void main(String[] args) {
	
		Assignment_6 a1= new Assignment_6();
		a1.non_static();
		a1.non_static1();
		a1.non_static2();

	}

}
