package com.learning.simple;
import java.util.*;
public class Final_Destination {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
        String str;
        str=sc.next();
        int len=str.length();
        int x=0,y=0;
        for(int i=0;i<len;i++)
        {
               char s = str.charAt(i);
               if(s == 'L')
               {
                     x--;
               }
               else if(s == 'R')
               {
                     x++;
               }
               else if(s == 'D')
               {
                     y--;
               }
               else if(s == 'U')
               {
                     y++;
               }
              
        }
       
        System.out.print(x);
        System.out.print(" ");
        System.out.print(y);
        sc.close();

	}

}
