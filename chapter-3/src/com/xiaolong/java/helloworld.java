package com.xiaolong.java;

public class helloworld
{
	public static void main(String[] args)
	{
		//System.out.println("Hello world!");
		//1. ASCII
		int num  = 97;
		char c = (char) num;
		System.out.println(c);
		
		//2. Unicode
		
		int num2 = 0x3425;
		char c2 = (char)num2;
		System.out.println(c2);
		
		//3 
		short a = 0;
		//short int a1 = 1;
		System.out.println(a);
	
		
		int n = -8;
		System.out.println(n%3);
		
		int n2 = 11_0;
		int m = Math.floorMod(n2, 3);
		System.out.println(m);
		
		
		char c1 = '㐥';
		int c3 = (int)c1;
		
		System.out.println(c3);
		
		double c4 = 9.97;
		int c5 = (int) c4;
		
		
		
		
		
	
		
		
	}
	
	


}
