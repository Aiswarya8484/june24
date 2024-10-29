package basics;

public class swap {

	public static void main(String[] args) {
    int a=25,b=23;
   /* int temp;
    temp=a;
    a=b;
    b=temp;
    System.out.println("a:"+a);
    System.out.println("b:"+b);*/
		
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println(a);
		System.out.println(b);
        
	}

}
