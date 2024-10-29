package Assignment;

import java.util.Scanner;

public class ArrayAsc {

	public static void main(String[] args) {
		int b[]=new int[5];
		int i;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter numbers");
		for(i=0;i<b.length-1;i++)
		{
		b[i]=sc.nextInt();
		}
		for(i=0;i<b.length-1;i++)
		{
		for(int j=0;j<b.length-1;j++)
		{
		if(b[i]>b[j])
		{
		int temp=b[i];
		b[i]=b[j];
		b[j]=temp;
		}
		}
		}
		System.out.println("sorted array");
		for(i=0;i<b.length-1;i++) {
		System.out.println(b[i]);
		}

	}

}
