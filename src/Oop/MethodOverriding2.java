package Oop;

class Parent
{
	String name="abc";
	public void phone()
	{
		System.out.println("nokia");
	}
}
class Child extends Parent
{
	public void phone()
	{
		System.out.println(super.name);
		super.phone();
		System.out.println("iphone");
		
	}
}

public class MethodOverriding2 {

	public static void main(String[] args) {
		Child c=new Child();
		c.phone();

	}

}