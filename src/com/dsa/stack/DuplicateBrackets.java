package com.dsa.stack;

import java.util.Scanner;
import java.util.Stack;

//e.g:-
//((a+b)+(c+d))-> false { No, this is not duplicate that's why it is returning false }
//(a+b)+((c+d))->true { Yes , this is duplicate }
//This question is solve from Stack

public class DuplicateBrackets {
	
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		
		Stack<Character> st=new Stack<>();
		
		for(int i=0;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch==')')
			{
				if(st.peek() == '(')
				{
					System.out.println(true);
					return;
				}
				else
				{
					while(st.peek() !='(')
					{
						st.pop();
					}
					
					st.pop();
				}
			}
			else
			{
				st.push(ch);
			}
		}
		
		System.out.println(false);
	}

}
