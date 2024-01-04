package com.dsa.strings;

import java.util.Scanner;

//Print all the Substring
//e.g:- i/p:- "abcd" 
//      o/p:- { a,ab,abc,abcd,b,bc,bcd,c,cd,d}
/*01 a
  02 ab      12 b
  03 abc     13 bc    23 c
  04 abcd    14 bcd   24 cd   34 d
*/
public class Substring {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		
		for(int i=0;i<str.length();i++)
		{
			for(int j=i+1;j<=str.length();j++)
			{
				System.out.println(str.substring(i, j));
			}
		}
	}

}
