package com.xiaolong.java;

public class CommandLine
{
	public static void main(String[] args)
	{
		if(args.length == 0 || args[0].equals("-h"))
		{
			System.out.print("Hello");
		}
		else if(args[0].equals("g"))
		{
			System.out.println("Goodbye");
		}
		for(String item: args)
		{
			System.out.print(item);
		}
		for(int i = 0; i < args.length;i++)
		{
			System.out.print(" " + args[i]);
		}
		System.out.println("!");
		
	}

}
