package com.learning.simple;
import java.util.*;
public class War {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0;i<n;i++){
               int sum1=0,sum2=0,m=0,temp=0;
               m=sc.nextInt();
               int f1=0,f2=0;
               for(int j=0;j<m;j++){
                     temp = sc.nextInt();
                     if(f1==0)
                     {
                            f1 = 1;
                            sum1=temp;
                     }
                     if(sum1<temp)
                            sum1=temp;
               }
              
               temp =0;
               for(int j=0;j<m;j++){
                     temp = sc.nextInt();
                     if(f2==0)
                     {
                            f2 = 1;
                            sum2=temp;
                     }
                     if(sum2<temp)
                            sum2=temp;
               }
              
               if(sum1 == sum2){
                     System.out.println("Tie");
                    
               } else if(sum1 < sum2){
                     System.out.println("Alice");
                    
               } else{
                     System.out.println("Bob");
               }
              
        }
        sc.close();
	}

}
