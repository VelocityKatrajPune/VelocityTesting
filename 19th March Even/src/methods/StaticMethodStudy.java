package methods;

public class StaticMethodStudy {

	public static void main(String[] args) 
	{
		myMethod();// calling static regular method form same class
		method1();//calling static regular method from same class
		Testing.display();// calling static regular method from another class
		Testing.calculation();//calling static regular method from another class
		
	}

	
	public static void myMethod()
	{
		System.out.println("HI THIS IS MYMETHOD");
	}
	
	public static void method1()
	{
		System.out.println("Hi this is method1");
	}
	
}
