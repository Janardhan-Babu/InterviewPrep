package com.learning.simple;
import java.util.*;
public class Psychic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner obj=new Scanner(System.in);
        String str;
        str=obj.next();
        int len=str.length();
        int i;
        int flag=1;
        int count=0;
        for(i=0;i<len-1;i++){
        if(str.charAt(i)==str.charAt(i+1))
        count+=1;
        else
        count=0;
        if(count>=5){
        flag=0;
        break;
        }
        }
        if(flag==0){
        System.out.println("Sorry, sorry!");
        }
        else
        System.out.println("Good luck!");
        obj.close();
	}

}
