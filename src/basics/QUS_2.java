package basics;

public class QUS_2 {

	public static void main(String[] args) {
		int x=5,y=10;
		int z;
		char op='%';
		switch(op)
		{
		case '+':
			z=x+y;
			System.out.println("sum is:"+z);
			break;
		case '-':
			z=x-y;
			System.out.println("diff:"+z);
			break;
		case '*' :
			z=x*y;
			System.out.println("mult:"+z);
			break;
		case '/' :
			z=x/y;
			System.out.println("div:"+z);
			break;
		case '%' :
			z=x%y;
			System.out.println("mod:"+z);
			break;
		default :
			System.out.println("invalid");
	
	
	

			
		}
    
	}

}
