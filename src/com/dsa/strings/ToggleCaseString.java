package com.dsa.strings;

import java.util.Scanner;

//ToggleCase of Characters in a String
//e.g:-i/p=pepCODing
//      o/p=PEPcodING
//Logic:-{ lc='a'+uc-'A' },{ uc='A'+lc-'a' }

public class ToggleCaseString {
	
	public static String ToggleChange(String str)
	{
		StringBuilder sb=new StringBuilder(str);
		
		for(int i=0;i<sb.length();i++)
		{
			char ch=sb.charAt(i);
			
			if(ch>='a' && ch<='z')
			{
				char uch=(char) ('A'+ch-'a');
				sb.setCharAt(i,uch);
			}
			else if(ch>='A' && ch<='Z')
			{
				char lch=(char) ('a'+ch-'A');
				sb.setCharAt(i, lch);
			}
		}
		
		return sb.toString();
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		System.out.println(ToggleChange(str));
	}

}
