package com.learning.java;
import java.util.Scanner;
public class LeapYear {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int year;
		year = sc.nextInt();
		sc.close();
		boolean flag;
		flag = (year%4 == 0);
		flag = flag && (year % 100 != 0);
		flag = flag || (year % 400 == 0);
		System.out.println(flag);
		
		
	}

}
