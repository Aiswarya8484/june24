package Oop;

public class Triangle {
	public void area(int b,int h)
	{
		int a=(b*h)/2;
		System.out.println(a);
	}

	public static void main(String[] args) {
		Triangle obj=new Triangle();
		obj.area(3, 2);
		

	}

}
