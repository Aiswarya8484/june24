package Assignment;

import java.util.Scanner;

public class LargestArr {

	public static void main(String[] args) {
		int i,n; 
		System.out.print("Enter numbers in an array = "); 
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt(); 
		int arr[]=new int[n]; 
		System.out.print("Enter elements of array = "); 
		for(i=0;i<n;i++) 
		{ 
		arr[i]=sc.nextInt(); 
		} 
		int lar=arr[0]; 
		for(i=0;i<n;i++) 
		{ 
		if(arr[i]>lar) 
		lar=arr[i]; 
		} 
		
		System.out.print("Largest number in the array = "+ lar);
	}

}
