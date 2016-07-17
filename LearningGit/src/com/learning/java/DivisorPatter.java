package com.learning.java;
import java.util.Scanner;
public class DivisorPatter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n;
		n = sc.nextInt();
		sc.close();
		for(int i = 1; i <= n; i++){
			for(int j=1;j<=n;j++){
				if(i%j==0||j%i==0){
					System.out.print("* ");
				}else {
					System.out.print(" ");
				}
			}
			
			System.out.println(i);
		}
	}

}
