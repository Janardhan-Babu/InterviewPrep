package com.learning.simple;
import java.util.*;
public class Roy_Time {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        String arr[] = new String[n];
        for(int i=0;i<n;i++){
               arr[i] = sc.next();
        }
       
        for(int i=0;i<n;i++){
               int max=0,count=0;
               char[] ch = arr[i].toCharArray();
               for(int j=0;j<ch.length;j++){
                     if(ch[j]=='C')
                     {
                            count++;
                            if(count>max){
                                   max = count;
                            }
                     } else {
                            count = 0;
                     }
               }
               a[i]=max;
              
        }
       
        /*for(int i=0;i<n;i++){
               System.out.print(a[i]);
        }*/
       
        int high = a[0];
        for(int i=1;i<n;i++)
        {
               if(high<a[i]){
                     high = a[i];
        }
       
        }
       
        String sss = new String();
        for(int i=0;i<n;i++){
               sss = sss.concat(arr[i]);
        }
        int count1=0,max1=0;
        char[] ch1 = sss.toCharArray();
        for(int j=0;j<ch1.length;j++){
               if(ch1[j]=='C')
               {
                     count1++;
                     if(count1>max1){
                            max1 = count1;
                     }
               } else {
                     count1 = 0;
               }
        }
        System.out.print(high);
        System.out.print(" ");
        System.out.print(max1);
	}

}
