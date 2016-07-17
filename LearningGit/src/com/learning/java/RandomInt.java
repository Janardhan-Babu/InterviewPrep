package com.learning.java;
import java.util.*;
public class RandomInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n;
		n = sc.nextInt();
		sc.close();
		double r = Math.random();
		int value = (int)(r*n);
		System.out.println(value);
		
	}

}
