package Oop;

public class Empconstructor {
	int empid ;
	int salary;
	String designation ;
	 
	public Empconstructor()
	{
		empid=100;
		salary=100000;
		designation ="designer";
	}

	public static void main(String[] args) {
		 Empconstructor obj=new  Empconstructor();
		 System.out.println(obj.empid);
		 System.out.println(obj.salary);
		 System.out.println(obj.designation);

	}

}
