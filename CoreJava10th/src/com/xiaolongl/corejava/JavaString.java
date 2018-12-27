package com.xiaolongl.corejava;
/**
 * length() returns the number of code units 
 *  whereas codePointCount returns the number of code points.
**/

public class JavaString
{
	public static void main(String[] args)
	{
		String s = "Hello_World!";
		int length = s.length();
		int length2 = s.codePointCount(0, s.length());
		System.out.println(s + ": length is " + length);
		System.out.println(s + ": TRUE length is " + length2);
		
		int a = 3, b = 6;
		String s2 = s.substring(a, b);// b - a = 6 - 0 = 6
		System.out.println("3. SUbstring of s is s2 = " + s2);
		
		String d = "Hello", e = "World!",g = "Hello";
		boolean f = d.equals(e), h = d.equals(g);
		System.out.println(d+e + f + " "+ h);
		

		
	}

}
