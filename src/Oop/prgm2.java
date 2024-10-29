package Oop;

public class prgm2 {
	
	//without parameter and with return type
	
	public int mul()
	{
	   int d=10,c=2;
	   int a=d*c;
	   return a;
	}
	
	//with parameter and without return type
	
	public void dev(int a,int b)
	{
		int c=a/b;
		System.out.println(c);
		
	}
	
	

	public static void main(String[] args) {
		prgm2 o=new prgm2();
		System.out.println(o.mul());
		o.dev(20, 10);
	}

}
