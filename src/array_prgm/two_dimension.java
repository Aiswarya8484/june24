package array_prgm;

import java.util.Scanner;

public class two_dimension {
	public static void main(String[] args) {
		String arr[][]=new String [3][2];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your name:");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<2;j++)
			{
				arr[i][j]=sc.next();
			}
		}
		System.out.println("names are:");
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<2;j++)
			{
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
	}

}
