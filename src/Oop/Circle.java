package Oop;

public class Circle {
	public void area()
	{
		int r=5;
		double  pi=3.14;
	    double a=pi*r*r;
		System.out.println(a);
		
		
	}

	public static void main(String[] args) {
		Circle obj=new Circle();
		obj.area();

	}

}
