package assignment;

public class Assignment_10 {
	
	static void add() {
		int a=12;            
		int b=32;
		int add=a+b;
		System.out.println(add);
		}
	static void sub() {
		int a=43;
		int b=23;
		int sub=a-b;
		System.out.println(sub);
		}
	 public void  mul() {
		   int a=43;
		   int b=21;
		   int mul=a*b;
		   System.out.println(mul);
	}
	 public void  div() {
		   int a=31;
		   int b=20;
		   int div=a/b;
		   System.out.println(div);
	}

	public static void main(String[] args) {
		add();
		sub();
		Assignment_10 a3= new Assignment_10(); //two ways of calling method one we create object directly like"assignment1- 1=new assignment()
		a3.div();//another way by calling new and class name
		a3.mul();
		
		

	}

}

                 
