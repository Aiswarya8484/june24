package basics;

import java.util.Scanner;

public class Scanne_prg {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter your name");
		String name=sc.next();
		System.out.println("enter your age");
		int age=sc.nextInt();
		System.out.println("enter your character");
		char character=sc.next().charAt(0);
		System.out.println(name);
		System.out.println(age);
		System.out.println(character);



	}

}
