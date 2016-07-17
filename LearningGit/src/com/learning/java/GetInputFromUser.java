package com.learning.java;
import java.util.Scanner;
public class GetInputFromUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a;
		float b;
		String s;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string");
		s = sc.nextLine();
		System.out.println("Entered String is"+s);
		System.out.println();
		System.out.println("Enter a Integer");
		a = sc.nextInt();
		System.out.println("Entered Integer is"+a);
		System.out.println();
		b = sc.nextFloat();
		System.out.println("Entered Float is"+b);
		
		
	}

}
