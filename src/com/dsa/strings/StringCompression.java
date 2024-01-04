package com.dsa.strings;

import java.util.Scanner;

//StringCompression
//e.g:-i/p:-aaabbcccddaeef
//     o/p:-compression1=>abcdaef
//    		compression2=>a3b2c3d2ae2f
public class StringCompression {
	
	public static String compression1(String str)
	{
		String s1=str.charAt(0)+"";
		
		for(int i=1;i<str.length();i++)
		{
			char curr=str.charAt(i);
			char prev=str.charAt(i-1);
			
			if(curr!=prev)
			{
				s1+=curr;
			}
		}
		
		return s1;
	}
	
	public static String compression2(String str)
	{
         String s2=str.charAt(0)+"";
         int count=1;
		
		for(int i=1;i<str.length();i++)
		{
			char curr=str.charAt(i);
			char prev=str.charAt(i-1);
			
			if(curr==prev)
			{
				count++;
			}
			else
			{
				if(count>1)
				{
					s2+=count;
					count=1;
				}
				s2+=curr;
			}
		}
		
		if(count>1)
		{
			s2+=count;
			count=1;
		}
		
		return s2;
	}
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		System.out.println(compression1(str));
		System.out.println(compression2(str));
	}

}
