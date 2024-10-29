package exam;

public class q2 {

	public static void main(String[] args) {
    int arr[]= {2,3,4,5,6};
  int n=arr[0];
    for(int i=1;i<4;i++)
    {
    	if(arr[n]%2==0)
    	{
    		System.out.println("even");
    		System.out.println(arr[n]);
    		n++;
    	}
    	else
    	{
    		System.out.println("odd");
    		System.out.println(n);
    		n++;
    	}
    	
    }
	}

}
