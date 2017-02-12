package com.learning.simple;
import java.util.Scanner;
public class Min_Max {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		
		int A[] = new int[N];

		for(int i=0;i<N;i++) {
		A[i] = in.nextInt();
		}
		
		int temp;

		for(int i=0;i<N;i++) {
		for(int j=1;j<(N-i);j++) {
		if(A[j-1] > A[j]) { 
		temp = A[j-1]; 
		A[j-1] = A[j]; 
		A[j] = temp; 
		} 
		}
		}
		int flag=1;
		int count=0;
		int min=A[0],max=A[N-1];
		for(int i=0;i<N-1;i++){
			
			if((A[i+1]-A[i]) == 1 || (A[i+1]-A[i]) == 0) {
				count++;
			
		}
			
		}
		if(count==N-1) {
			System.out.println("YES");
			}

			else {
			System.out.println("NO");
			}
		in.close();
	}

}
