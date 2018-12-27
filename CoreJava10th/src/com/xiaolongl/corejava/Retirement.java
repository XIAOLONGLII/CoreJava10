package com.xiaolongl.corejava;

import java.util.*;;

public class Retirement
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.print("How much you contribute each year? $: ");
		double contribute = input.nextDouble();
		
		System.out.print("Interest rate is: ");
		double rate = input.nextDouble();
		
		double balance = 0;
		int year = 0;
		
		
		String in = null;
		System.out.println("Before anything happens, your balance is "+ balance);
		do
		{
			balance = balance + contribute;
			double interest = balance * rate;
			balance = balance + interest;
			
			year++;
			System.out.printf("After year %d, your balance is %,.2f%n",	year, balance);
			
			
			System.out.println("Ready to retired? (Y/N)");
			in = input.next();
		}
		while(in.equals("N"));
		System.out.println("Good work!!! ");	
	}

}
