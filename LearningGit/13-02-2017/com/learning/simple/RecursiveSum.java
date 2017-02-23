package com.learning.simple;
import java.util.*;
public class RecursiveSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner s = new Scanner(System.in);
	        int N = s.nextInt();

	        for (int i = 0; i < N; i++) {
	            int M = s.nextInt();
	             int sum=0,a=0,b=0;
	            for(int j=0;j<M;j++)  
	            {   a = s.nextInt();
	                b = s.nextInt();
	               
	                for(int k=1;k<=a;k++){
	                    sum = sum+b;
	                }
	            }
	            int res=0,digit;
	            while(sum > 0){
	                digit = sum%10;
	                res = res+digit;
	                sum/=10;
	            }
	            System.out.println(res);
	        }

	}

}
