package Assignment;

import java.util.Scanner;

public class ReverseArr {
	public static void main(String[] args) {
	 Scanner sc=new Scanner(System.in);
	 System.out.println("enter numbers in an array");
	int n=sc.nextInt();
	int a[]=new int[n];
	System.out.println("enter elements in an array");
	 for(int i=0;i<n;i++)
	 {
	 a[i]=sc.nextInt();
	 }
	 int i=0,j=n-1,temp;
	while(i<j)
	{
	temp=a[i];
	a[i]=a[j];
	a[j]=temp;
	i++;
	j--;
	}
	 System.out.println("reversig an array");
	 for(i=0;i<n;i++)
	 {
	 System.out.println(a[i]);
	 }
	 

	
	
	}
}
