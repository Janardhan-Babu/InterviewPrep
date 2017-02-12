package com.learning.simple;
import java.util.*;
public class TheGreatKian {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		Scanner s1 = new Scanner(System.in);
        int N = s.nextInt();
        long arr[] = new long[N+1];
        for (int i = 1; i <= N; i++) {
            arr[i]=s1.nextLong();
        }
        s.close();
        s1.close();
        long sum1=0,sum2=0,sum3=0;
        for(int i=1;i<=N;i=i+3)
        {   if(i<=N)
        	sum1 = sum1 + arr[i];
        	
        }
        
        for(int i=2;i<=N;i=i+3)
        {	if(i<=N)
        	sum2 = sum2 + arr[i];
        	
        }
        
        for(int i=3;i<=N;i=i+3)
        {	if(i<=N)
        	sum3 = sum3 + arr[i];
        	
        }
        
        System.out.print(sum1);
        System.out.print(" ");
        System.out.print(sum2);
        System.out.print(" ");
        System.out.print(sum3);
        
	}

}
