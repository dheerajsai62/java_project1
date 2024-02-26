package assignment;

public class Assignment_17_constructor_1IIB {
	
	 public Assignment_17_constructor_1IIB(int a) {
		 System.out.println("This is first constructor");
	 }
	 public Assignment_17_constructor_1IIB(int c, int b) {
		 System.out.println("This is second constructor");
	 }
	 public Assignment_17_constructor_1IIB(String a) {
		 System.out.println("This is  third constructor");
	 }
	 public Assignment_17_constructor_1IIB() {
		 System.out.println("This is fourth constructor");
	 }
	 {
		 System.out.println("IIB block");
	 }
	 
	

	public static void main(String[] args) {
		new Assignment_17_constructor_1IIB(20);
		new Assignment_17_constructor_1IIB(30,40);
		new Assignment_17_constructor_1IIB("a");
		new Assignment_17_constructor_1IIB();
		//when ever we are calling  IIB default it will call automatically 
		//When four constructors and 1 IIb there means four time constructor will call and four times IIB will call
		//Flow if we are having one constructor,one sib, oneIIb 
		//static Will call first
		//IIB block
		//constructor will call
	}

}
