package com.dsa.strings;

import java.util.Scanner;

//Print all Palindrome Substring
//Logic 1:-
//Print all the Substring
//e.g:- i/p:- "abcd" 
//    o/p:- { a,ab,abc,abcd,b,bc,bcd,c,cd,d}
/*01 a
  02 ab      12 b
  03 abc     13 bc    23 c
  04 abcd    14 bcd   24 cd   34 d
*/
//Logic 2:-
//Print Palindrome => Palindrome is the pattern where the string is same from front and at the back.
//e.g:- i/p:- bcd
//      o/p:- true
//e.g:- i/p:- "abcd" 
//      o/p:- { a,b,c,d }
//      i/p:- "abccbc"  o/p:- { a,b,bccb,c,cc,c,cbc,b,c }
/* 01 a
 * 02 ab       12 b      
 * 03 abc      13 bc     23 c
 * 04 abcc     14 bcc    24 cc    34 c
 * 05 abccb    15 bccb   25 ccb   35 cb   45 b
 * 06 abccbc   16 bccbc  26 ccbc  36 cbc  46 bc  56 c
 */

public class PalindromeSubstring {
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		
		for(int i=0;i<str.length();i++)
		{
			for(int j=i+1;j<=str.length();j++)
			{
				String ss=str.substring(i, j);
				if(isPalindrome(ss)==true)
				{
					System.out.println(ss);
				}
			}
		}
	}
	
	public static boolean isPalindrome(String ss)
	{
		int i=0;
		int j=ss.length()-1;
		while(i<=j)
		{
			char ch1=ss.charAt(i);
			char ch2=ss.charAt(j);
			
			if(ch1 !=ch2)
			{
				return false;
			}
			else
			{
				i++;
				j--;
			}
		}
		
		return true;
		
	}

}
