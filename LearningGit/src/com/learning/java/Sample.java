package com.learning.java;
import java.util.*;
public class Sample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int m = sc.nextInt();
		int n = sc.nextInt();
		sc.close();
		int [] perm = new int[n];
		for(int i =0;i<n;i++){
			perm[i]=i;
		}
		
		for (int i=0;i<m;i++){
			int r =i+(int)(Math.random()*(n-i));
			int t = perm[r];
			perm[r]=perm[i];
			perm[i]=t;
		}
		
		for(int i=0; i < m; i++ ){
			System.out.print(perm[i]+" ");
		}
			System.out.println();
		
	}

}
