package com.learning.java;
import java.util.Scanner;
public class Binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n;
		n = sc.nextInt();
		sc.close();
		int i=1;
		while ( i<= n/2){
			i = i*2;
		} 
		
		while (i>0){
			if(n<i){
				System.out.print(0);
			} else {
				System.out.print(1);
				n=n-i;
			}
			i = i/2;
		}
		System.out.println();
	}

}
