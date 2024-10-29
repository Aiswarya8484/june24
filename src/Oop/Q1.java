package Oop;
class Member
{
	String name,address;
	int age,salary;
	public void printdetails()
	{
		System.out.println(name);
		System.out.println(age);
		System.out.println(salary);
		System.out.println(address);

	}
}
class worker extends Member
{
	String specialization;
}
class manager extends Member
{
	String department;
}
public class Q1 {

	public static void main(String[] args) {
    
		worker w=new worker();
		w.name="anu";
		w.age=30;
		w.salary=30000;
		w.address="fvgjnk";
		w.printdetails();
		System.out.println(w.specialization="react");
		
		manager m=new manager();
		m.name="ammu";
		m.age=25;
		m.salary=50000;
		m.address="fffffsd";
		m.printdetails();
		System.out.println(m.department="btech");
	}

}
