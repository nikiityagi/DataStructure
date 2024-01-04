package com.dsa.stack;

import java.util.Scanner;
import java.util.Stack;

//e.g:-
//[ (a+b) + { (c+d) * (e/f) } ] -> true
//[ (a+b) + { (c+d) * (e/f) ] } -> false
//[ (a+b) + { (c+d) * (e/f) } -> false
//( [ (a+b) + { (c+d) * (e/f) } ] -> false
//this question is solved from STACK 

public class BalancedBrackets {
	
	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		String str=sc.nextLine();
		
		Stack<Character> stack=new Stack<>();
		
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			 
		}
	}
}
