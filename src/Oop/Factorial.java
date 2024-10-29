package Oop;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		int n,fact=1,i;
		System.out.println("enter a number=");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		for (i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println("the factorial of the number is:"+fact);

	}

}
