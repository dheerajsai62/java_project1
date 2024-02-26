package assignment;

public class Assignment_8 {
	public Assignment_8() {
		System.out.println("This constructor has no arguments");
	}
	public Assignment_8(int a ,int b)
	{
		int sub=a-b;
		System.out.println(sub);//no need to put invited commas for Int datatype byte
	}
	public Assignment_8(String b) 
	{
		System.out.println("i am a string"); 
	}
	public Assignment_8(int a,int b,int c) 
	{
		int add =a+b+c;
		System.out.println(add);
	}
	
	
	public static void main(String[] args) {
		  new Assignment_8(50,30);
		  new Assignment_8(50,30,70);
		  new Assignment_8("i am string");
		 new Assignment_8(50,30);
         
	}

}
