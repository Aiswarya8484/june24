package Oop;

public class Parametercon {
	int empid ;
	int salary;
	String designation ;
	
	public Parametercon(int id,int sal,String desig)
	{
		//this.empid=empid;
	empid=id;
	salary=sal;
	designation=desig;
	}

	public static void main(String[] args) {
         Parametercon obj=new Parametercon(101,555555,"developer");
		 System.out.println(obj.empid);
		 System.out.println(obj.salary);
		 System.out.println(obj.designation);
		
		
				

	}

}
