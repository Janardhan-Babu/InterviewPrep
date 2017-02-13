package com.learning.simple;
import java.util.*;
public class Bob_Bomb {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
	       int test= sc.nextInt();
	       int arr[] = new int[test];
	       for(int i=0;i<test;i++){
	    	  
	       String plant= sc.next();
	       char [] c = plant.toCharArray();
	       int count=0;
	       int k=0;
	       while(k<c.length){
	    	      	
	    	       if(c[k]=='B'){
	           
	            	  
	                     if(k-1>=0){
	                    	
	                           if(c[k-1]=='W'){
	                                  count++;
	                                  c[k-1]='F';
	                                  if(k-2>=0){
	                                  if(c[k-2]=='W'){
	                                	  
	                                         count++;
	                                         c[k-2]='F';
	                                  }
	                            }
	                           }
	                        
	                     }
	                     
	                     if(k+1<c.length){
	                    	
	                           if(c[k+1]=='W'){
	                                  count++;
	                                  c[k+1]='F';
	                                  if(k+2<c.length){
	                                         if(c[k+2]=='W'){
	                                                count++;
	                                                c[k+2]='F';
	                                                k=k+2;
	                                         }
	                                  }
	                           }
	                           else{
	                                  k=k+1;
	                           }
	                     }
	                     if(c[0]=='B')
	                     {
	                    	 k++;
	                     }
	                     
	                     
	              }
	              
	              else{
	            	  
	                     k=k+1;
	              }
	            
	             
	       }
	       arr[i]=count;
	              }
	       
	       for(int i=0;i<test;i++){
	    	   
	    	   System.out.println(arr[i]);
	       }
	       sc.close();
	       
	}

}
