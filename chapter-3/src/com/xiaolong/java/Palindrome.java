package com.xiaolong.java;

import java.util.Arrays;

public class Palindrome
{
	public static void main(String[] args)
	{
		String string = "New york11";
		char[] t = string.toCharArray();
		
		for(int i = 0; i < string.length()/ 2; i++)
		{
			char temp = t[string.length() - i - 1];
			t[string.length() - i - 1] = t[i];
			t[i] = temp;
		}

	for(char c: t)
	{
		System.out.print(c);
	}
	
		
	
//		
//		
//		
//		int le = string.length();
//		int j = 0;
//		
//		while( le < j)
//		{
//			char temp = t[string.length() - j - 1];
//			t[string.length() - j - 1] = t[j];
//			t[j] = temp;
//			le--;
//			j++;
//		}
//		//System.out.println(Arrays.toString(t));
//
////		
////		for(char c: t)
////		{
////			System.out.print(c);
////		}
		
		
		
	}

}
