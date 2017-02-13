package com.learning.simple;
import java.util.*;
public class Printhackerearth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		sc.close();
		char[] arr=s.toCharArray();
		int count = 0;
		int h = 0 , a = 0 , c = 0, k = 0, e = 0 , r = 0 , t =0 ;
		if(n < 11)
			count =0;
		else {
			for(int i=0;i<n; i++)
			{
				switch(arr[i]){
				case 'h':
					h++;
					break;

					case 'a':
					a++;
					break;

					case 'c':
					c++;
					break;

					case 'k':
					k++;
					break;

					case 'e':
					e++;
					break;

					case 'r':
					r++;
					break;

					case 't':
					t++;
					break;

					default:

					break;

				}
			}
				
		}
		while(h>=2 && a>=2 && c>=1 && k>=1 && e>=2 &&r>=2&&t>=1) 
		{
		h-=2; // keep subtracting till it condition become false
		a-=2; // and at the end if whole subtract then it will be counted as one 
		c-=1; // and so on 
		k-=1;
		e-=2;
		r-=2;
		t-=1;
		count++;
		}
		System.out.print(count);
	}

}
