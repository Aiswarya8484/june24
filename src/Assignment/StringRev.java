package Assignment;

public class StringRev {

	public static void main(String[] args) {
    String n="ABC";
    String rev="";
    for(int i=n.length()-1;i>=0;i--)
    {
    	rev=rev+n.charAt(i);
    }
    System.out.println(rev);
	}

}
