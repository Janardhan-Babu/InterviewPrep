package com.learning.java;
import java.util.Scanner;
public class MonkTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int[] a = new int[n];
			int[] b = new int[n];
			int temp;

			for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
			}
			for (int i = 0; i < n; i++) {
			b[i] = sc.nextInt();
			}
			
			int count = 0, i = 0;
			
			while(i<n){
				if(a[i]==b[i]){
					i = i+1;
					count++;
				} else {
					for(int j=i;j<n-1;j++){
						temp = a[j];
						a[j]= a[j+1];
						a[j+1]=temp;
					}
					count++;
				}
			}
			System.out.println(count);
	}

}
