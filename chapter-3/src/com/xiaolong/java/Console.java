package com.xiaolong.java;
import java.lang.System;


public class Console
{
	public static void main(String[] args)
	{	
		java.io.Console c = System.console();
		String username = c.readLine("user name: ");
		char[] password = c.readPassword("Password: ");
		
		
	}

}
