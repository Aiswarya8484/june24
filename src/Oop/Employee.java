package Oop;

public class Employee {
	String empName;
	int salary;
	String department;
	public void display()
	{
		System.out.println(empName);
		System.out.println(salary);
		System.out.println(department);
		}
	public static void main(String[] args) {
		Employee obj=new Employee();
		obj.empName="anusha";
		obj.salary=10000;
		obj.department="testing";
		obj.display();
		
	}

}
