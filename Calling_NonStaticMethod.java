package assignment;

public class Calling_NonStaticMethod {
	
	public void nonstaticmethod() {
		System.out.println("This is non static method 1");
	}

	public static void main(String[] args) {
		Calling_NonStaticMethod c1= new Calling_NonStaticMethod();
        c1.nonstaticmethod();
	}

}
