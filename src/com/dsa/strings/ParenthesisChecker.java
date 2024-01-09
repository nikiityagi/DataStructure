package com.dsa.strings;

import java.util.Stack;

public class ParenthesisChecker {

	public static boolean ispar(String x)
    {
        // add your code here
        
       Stack<Character> st=new Stack<>();
        
        for(int i=0;i<x.length();i++)
        {
            char character=x.charAt(i);
            if(character=='{' || character=='(' || character=='[')
            {
              st.push(character);
            }
            else if(character=='}'&& !st.isEmpty() && st.peek()=='{')
            {
              st.pop();   
            }
            else if(character==')'&& !st.isEmpty() && st.peek()=='(')
            {
                st.pop();
            }
            else if(character==']'&& !st.isEmpty() && st.peek()=='[')
            {
                st.pop();
            }
            else
            {
                return false;
            }
        }
        
       return st.isEmpty();
    }
	
	public static void main(String[] args) {
		
		String str="{[()]}";
		System.out.println(ispar(str));

	}

}
