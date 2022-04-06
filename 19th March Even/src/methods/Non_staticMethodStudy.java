package methods;

public class Non_staticMethodStudy {

	public static void main(String[] args) 
	{
		//classname objename= new classname();
		// to non static method--> objname.methodname();
		//creating object
		Non_staticMethodStudy obj= new Non_staticMethodStudy();

		obj.display();// calling non static method from same class using object
		
		MyClass m= new MyClass();// created object of another class
		m.running();// calling non static method from another class using object of that class
		
	}

	public void display()
	{
		System.out.println("Hi this is non static Display method");
	}
	
}
