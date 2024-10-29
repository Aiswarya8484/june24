package Oop;

public class Rectangle {
	
	public int area(int l,int b)
	{
		int a=l*b;
		System.out.println(a);
		return a;
	}

	public static void main(String[] args) {
		Rectangle obj= new Rectangle();
		obj.area(5, 5);

	}

}
