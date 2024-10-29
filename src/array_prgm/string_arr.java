package array_prgm;

import java.util.Scanner;

public class string_arr {

	public static void main(String[] args) {
		String arr[]=new String[5];
		Scanner sc= new Scanner(System.in);
		System.out.println("enter your name:");
		for(int i=0;i<4;i++)
		{
		arr[i]=sc.next();
		}
		System.out.println("names are:");
		for(int i=0;i<4;i++)
		{
			System.out.println(arr[i]);
		}

	}

}
