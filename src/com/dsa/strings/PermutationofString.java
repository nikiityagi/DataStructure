package com.dsa.strings;

import java.util.Scanner;

//Permutation of a String
//e.g:-i/p=abc
//     o/p={abc,acb,bac,bca,cab,cba}
//Logic:- Use One Algorithm
/* For eg:- we have { abc } => abc have 6 permutation 3!
 * So , here we find out with the help of( 0, 1, 2, 3, 4, 5 )
 * 1.a0b1c2=> 3/0=>0-0=>remove(a) ,
 *   b0c1=>   2/0=>0-0=>remove(b) ,
 *   c0=>     1/0=>0-0=>remove(c) .=> (abc)
 * 2.a0b1c2=> 3/1=>0-1=>remove(b) ,
 *   a0c1=>   2/1=>0-0=>remove(a) ,
 *   c0=>     1/1=>0-0=>remove(c) .=> (bac)
 * 3.a0b1c2=> 3/2=>0-2=>remove(c) ,
 *   a0b1=>   2/2=>0-0=>remove(a) ,
 *   b0=>     1/2=>0-0=>remove(b) ,=> (cab)
 * 4.a0b1c2=> 3/3=>1-0=>remove(a) ,
 *   b0c1=>   2/3=>0-1=>remove(c) ,
 *   b0=>     1/3=>0-0=>remove(b) .=> (acb)
 * 5.a0b1c2=> 3/4=>1-1=>remove(b) ,
 *   a0c1=>   2/4=>0-1=>remove(c) ,
 *   a0=>     1/4=>0-0=>remove(a) .=> (bca)
 * 6.a0b1c2=> 3/5=>1-2=>remove(c) ,
 *   a0b1=>   2/5=>0-1=>remove(b) ,
 *   a0=>     1/5=>0-0=>remove(a) .=> (cba)  
 *     
 */
public class PermutationofString {
	
	public static void permutation(String str)
	{
		int n=str.length();
		int f=factorial(n);
		
		for(int i=0;i<f;i++)
		{
			StringBuilder sb=new StringBuilder(str);
			int temp=i;
			
			for(int div=n;div>=1;div--)
			{
				int q=temp/div;
				int r=temp%div;
				
				System.out.print(sb.charAt(r));
				sb.deleteCharAt(r);
				
				temp=q;
			}
			System.out.println();
		}
	}
	
	public static int factorial(int n)
	{
		int val=1;
		
		for(int i=2;i<=n;i++)
		{
			val*=i;
		}
		
		return val;
	}
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		permutation(str);
	}

}
