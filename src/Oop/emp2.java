package Oop;

public class emp2 {
	int empid,salary;
	String designation;
	/*public void setvalue(int id,int sal,String desig)
	{
		empid=id;
		salary=sal;
		designation=desig;
		
	}*/
	
	public void setvalue(int empid,int salary,String designation)
	{
		this.empid=empid;
		this.salary=salary;
		this.designation=designation;
	}
	public void display()
	{
		System.out.println(empid);
		System.out.println(salary);
		System.out.println(designation);


	}

	public static void main(String[] args) {
		emp2 obj=new emp2();
		obj.setvalue(1, 20000, "developer");
		obj.display();

	}

}
