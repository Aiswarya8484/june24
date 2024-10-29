package array_prgm;

import java.util.Scanner;

public class number_arr {

	public static void main(String[] args) {
		int arr[]=new int[4];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the num:");
		for(int i=0;i<4;i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("numbers are:");
		for(int s:arr)
		{
			System.out.println(s);
		}

	}

}