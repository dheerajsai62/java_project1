package assignment;

public class Assignment_11 {
	public  static  void samemethod(int a) {
		System.out.println(a);
	}
	public  static  void samemethod(double d) {
		System.out.println(d);
	}
	public  static  void samemethod(char a) {
		System.out.println(a);
	}
       public void samemethod(boolean b)
       {
    	   System.out.println(b);
       }
       public void samemethod(String a)
       {
    	   System.out.println(a);
       }
	public static void main(String[] args) {
		System.out.println("this is static method");
		Assignment_11 a4= new Assignment_11();
		samemethod(10);
		samemethod(20.1);
		samemethod('c');
		
		System.out.println("This is non-static");
		
		a4.samemethod(false);
	    a4.samemethod("dheeraj");
	    
		

	}

}
