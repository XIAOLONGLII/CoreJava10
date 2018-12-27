package com.xiaolongl.corejava;

import java.util.Date;

public class TestPrintf
{
	public static void main(String[] args)
	{
		System.out.println("1.");
		System.out.println("hello world!");
		System.out.printf("Hell0 world by printf");
		
		System.out.println("2.");
		
		int a = 10, b = 20;
		System.out.println("a: " + a + " b: " + b);
		System.out.printf("a: %d b: %d\n", a,b);
		
		System.out.println("3.");
		
		double x = 1000 / 3;
		System.out.println("x = "+ x);
		System.out.printf("%.8f", x);
		
		System.out.println("4.");
		System.out.printf("%tc", new Date());

	} 

}
