package Oop;

public class withORwithout {
	
	//With parameter with return type
	
	public int sub(int a,int b)
	{
		int c=a-b;
		return c;
	}
	
	
    //without parameter without return type
	
	public void sum()
	{
		int a=20,b=20;
		int c=a+b;
		System.out.println(c);
	}
	
	
	public static void main(String[] args) {
		withORwithout ob=new withORwithout();
		//with
		System.out.println(ob.sub(50,20));
		//without
		ob.sum();

	}

}
