package com.learning.simple;
import java.util.*;
public class DigitProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Long x=sc.nextLong();
		int k=sc.nextInt();
		String s=Long.toString(x);
		int len=s.length();
		char[] arr=s.toCharArray();
		int i=0,j=0;
		while(i<k && j<len)
		{
		if(arr[j]!='9')
		{
		arr[j]='9';
		i++;
		}
		j++;
		}
		System.out.println(arr);
		sc.close();
	}

}
