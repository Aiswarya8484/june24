package Oop;

public class palindrome {

	public static void main(String[] args) {
		 int n=121,rev=0,temp=n;
	     while(n!=0)
	     {
	    	 int r=n%10;
	    	 rev=rev*10+r;
	    	 n=n/10;
	     }
	     if(rev==temp)
	     {
	    	 System.out.println("num is  palindrome");
	     }
	     else
	     {
	    	 System.out.println("number is not palindrome");
	     }
	}

}
