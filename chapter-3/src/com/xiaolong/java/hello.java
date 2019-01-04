package com.xiaolong.java;
import java.util.*; 


//abcba
public class hello
{
	public static void main(String[] args)
	{
		System.out.println(1);
		String str = "abcba";
		int len = str.length();
		Boolean isEqual = null;
		
		//1. iterator each char of string
		for(int i = 0; i < len / 2; i++)
		{
			if(str.charAt(i) == str.charAt(len - 1))
			{
				isEqual = true;
			}

		}
		// 2. check if this is true
		System.out.println(2);
		if(isEqual == true)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
		
		// method2:
		
		
		System.out.println(3);
		String str2 = "abcbad";
		int len2 = str2.length();
		int i = 0;
		boolean Equal = false;
		while(len < i)
		{
			if(str2.charAt(i) == str2.charAt(len - 1))
			{
				Equal = true;
			}
		}
		
		if(Equal == true)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}
		
		System.out.println(str2);
		
		//method3
		
		System.out.println(4);
		Vector v = new Vector(); 
		String str3 = "abcba..";
		//str3.toCharArray();
		char[] temparray = str3.toCharArray();
		int len3 = str3.length();
		for(int j = 0; j < str3.length() / 2; j++)
		{
			char c = temparray[j];
			char c1 = temparray[len3 - 1];
			
			char temp = c;
			c = c1;
			c1 = temp;
	
		}
		
		System.out.println(str3.toCharArray());
		
		
		
		int k = 0;
		int le3 = str3.length();
		while( le3 < k)
		{
			char c = str3.charAt(k);
			char c1 = str3.charAt(str3.length() - 1);
			
			char temp = c;
			c = c1;
			c1 = temp;
			
			le3--;
			k++;
		}
		System.out.println(str3);
		
			


	}

}
