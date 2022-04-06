package methods;

public class UniversityResult {

	public static void main(String[] args) 
	{
	
		UniversityResult ur= new UniversityResult();
		ur.studentInfo();// calling method without parameters
		ur.studentInfo1("Pune", 123, 'B', 123.23d);// calling method with parameters
		ur.studentInfo1("Katraj", 110, 'A', 888.98d);// calling method with parameters

		ur.studentInfo1("Mumbai", 897, 'B', 99.99d);
	}
	
	public void studentInfo()// method without parameters
	{
		//name, rollNum,grade, totalMarks
		
		String StudentName="Velocity";//1+2
		int RollNum=1234;
		char grade='A';
		float totalMarks=280.88f;
		System.out.println("==============================");
		System.out.println("Student name is "+StudentName);
		System.out.println("Student roll number is "+RollNum);
		System.out.println("Student Grade is "+grade);
		System.out.println("Student's marks are "+totalMarks);
		System.out.println("==============================");
		
	}
	
	//name, rollNum,grade, totalMarks
	//method with parameters
	public void studentInfo1(String studentName,int RollNum, char grade,double totalMarks)
	{
		
		System.out.println("=========================");
		System.out.println("Student name is "+studentName);
		System.out.println("Student roll num is "+RollNum);
		System.out.println("Students grade is "+grade);
		System.out.println("Student marks are "+totalMarks);
		System.out.println("=========================");
	}

}
