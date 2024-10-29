package Assignment;

import java.util.Scanner;

public class MatrixAdd {

	public static void main(String[] args) {
		int a[][]=new int[3][3]; 
		int b[][]=new int[3][3]; 
		int c[][]=new int[3][3]; 
		int i,j; 
		Scanner sc=new Scanner(System.in); 
		System.out.print("Enter elements of First Matrix : "); 
		for(i=0;i<3;i++)
		{ 
		for(j=0;j<3;j++)
		{ 
		a[i][j]=sc.nextInt(); 
		} 
		}
		 System.out.print("Enter elements of Second Matrix :");
		 for(i=0;i<3;i++)
		 { 
		 for(j=0;j<3;j++){ 
		b[i][j]=sc.nextInt(); 
		} 
		} 
		System.out.println("First Matrix : "); 
		for(i=0;i<3;i++){ 
		
		for(j=0;j<3;j++){ 
		System.out.print(a[i][j]+ " "); 
		} 
		System.out.println(""); 
		} 
		System.out.println("Second Matrix : "); 
		for(i=0;i<3;i++) 
		{ 
		for(j=0;j<3;j++) 
		{ 
		System.out.print(b[i][j]+ " "); 
		} 
		System.out.println(""); 
		} 
		for(i=0;i<3;i++)
		{ 
		for(j=0;j<3;j++)
		{ 
		c[i][j]=a[i][j]+b[i][j]; 
		} 
		} 
		System.out.println("The sum is :"); 
		for(i=0;i<3;i++) 
		{ 
		for(j=0;j<3;j++) 
		{ 
		System.out.print(c[i][j]+ " "); 
		} 
		System.out.println(""); 
		} 

	}

}
