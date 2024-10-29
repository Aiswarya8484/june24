package Assignment;

public class Prime {

	public static void main(String[] args) {
     int a=7,count=0;
     for(int i=2;i<a-1;i++)
     {
    	 if(a%i==0)
    	 {
    		 count++;
    	}
     }
     if(count==2)
     {
    	 System.out.println("number is not a prime");
     }
     else
     {
    	 System.out.println("number is prime"); 
     }
	
	}
}
