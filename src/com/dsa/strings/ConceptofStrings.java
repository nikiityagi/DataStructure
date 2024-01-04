package com.dsa.strings;

////String////
//1.Memory=>String s1="hello";==200 String s2="hello"==200;{ Ek hi "hello" ko point krta hai }
//2.Interning=>Why??to optimize space
//3.(new)=>String s3=new String("hello");==300
//4.Immutability=>what?why?impact?
//what??no change of string(reference is mutable,instance is not){kahi or pe woh string bn jayegi ,lekin us same string mai koi bhi change nahin karegi}
//why??{ suppose that (s1)&(s2) dono pr same "hello" pada hai toh agar hm s1 mai koi bhi char add ya remove karenge toh s2 mai bhi ho jayega toh ye galt hai isiliye String immutable hoti hai.
//impact??{ performance slow }
//5.Performance
//6.Equals&(==)=>equals check char by char(for comparison use this ),this is first check address then check char by char,
// & (==) check the address
////StringBuilder////&&////StringBuffer////
//1.StringBuilder is Mutable


public class ConceptofStrings {
     public static void main(String[] args)
     {
    	 //This is done with String that take soo much time.
    	 int n=1000;
    	 String s="";
    	 long start=System.currentTimeMillis();
    	 for(int i=0;i<n;i++)
    	 {
    		 s+=i;
    	 }
    	 long end=System.currentTimeMillis();
    	 long duration=end-start;
    	 System.out.println(duration);
    	 
    	 //And This is done with StringBuilder that take less time.(becoz ye ussi string mai chnage krdega)
    	 int n1=1000;
    	 StringBuilder sb1=new StringBuilder();
    	 long start1=System.currentTimeMillis();
    	 for(int i=0;i<n;i++)
    	 {
    		 sb1.append(i);
    	 }
    	 long end1=System.currentTimeMillis();
    	 long duration1=end1-start1;
    	 System.out.println(duration1);
    	 
    	 
    	 //These are the method which are only used with StringBuilder.
    	 StringBuilder sb=new StringBuilder("hello");
    	 System.out.println(sb);
    	 
    	 char ch=sb.charAt(0);//get
    	 System.out.println(ch);
    	 
    	 sb.setCharAt(0,'d');//update
    	 System.out.println(sb);
    	 
    	 sb.insert(2,'y');//insert
    	 System.out.println(sb);
    	 
    	 sb.deleteCharAt(2);//remove
    	 System.out.println(sb);
    	 
    	 sb.append('g');//append
    	 System.out.println(sb);
    	 
    	 System.out.println(sb.length());//length
    	 
     }
}
