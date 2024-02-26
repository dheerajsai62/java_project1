package assignment;

public class assignment_15 {
	//constructor
	public assignment_15() {
		System.out.println("This sis constructor");
	}
	//SIB
	static {
		System.out.println("This is static block");
	}
	//IIB
	{
		System.out.println("this is IIB");
	}

	public static void main(String[] args) {
		
      new assignment_15();
     
	}

}
