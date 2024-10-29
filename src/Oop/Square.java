package Oop;

public class Square {
	public int Area()
	{
		int s=10;
		int a=s*s;
		return a;
	}

	public static void main(String[] args) {
		Square obj=new Square();
		System.out.println(obj.Area());

	}

}
