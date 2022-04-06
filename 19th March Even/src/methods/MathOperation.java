package methods;

public class MathOperation {

	public static void main(String[] args) 
	{
	MathOperation mo= new MathOperation();// object created
	
	mo.add();// calling non static method form same class
	sub();//calling static method from same class
	mo.add();
	Sample.mul();// calling static method form another class
	
	Sample s= new Sample();// created object of another class
	s.div();// calling non-static method from another class
	s.div();
	s.div();
	sub1(90, 80);

	}
	
	public void add()// without parameter
	{
		int a;// variable declaration
		int b;
		int addition;
		a=100;// assign value
		b=200;
		
		addition=a+b;
		
		System.out.println("addition is "+addition);
		
	}
	
	public static void sub1(int a, int b)
	{
		int subs=a-b;
		System.out.println("The substraction is "+subs);
	}
	
	public static void sub()
	{
		int a=100;// 1+2 variable declaration+assign
		int b=50;
		int sub=a-b;
		System.out.println("Substraction is "+sub);
		
	}
	
	

}
