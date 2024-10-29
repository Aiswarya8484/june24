package Assignment;

public class Amstrong {

	public static void main(String[] args) {
     int n=17,temp=n,sum=0,r=0;
     while(n>0)
     {
    	 r=n%10;
    	 sum=sum+(r*r*r);
    	 n=n/10;
     }
     if(temp==sum)
     {
    	 System.out.println("amstrong number");
     }
     else
     {
    	 System.out.println("not an amstrong");
     }
	}

}
