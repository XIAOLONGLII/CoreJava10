package com.xiaolongl.corejava;
import java.util.*;


/*
 * 
 * Why string inputs after integer input gets skipped in Java? [duplicate]
 */

// Problem: the nextInt method doesn't read the newline character of your input,
public class InputTest
{
	public static void main(String[] agrs)
	{
		System.out.println("What is your name and age: ");
		Scanner input = new Scanner(System.in);
		String name = input.nextLine();
		int age = input.nextInt();
		input.nextLine(); // skip the new line character 
		String greetings = input.nextLine();
		System.out.println(greetings + "I am " + name + "and I am "+age + " this year.");
		
	}

}
