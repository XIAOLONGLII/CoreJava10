package com.xiaolongl.corejava;

import java.util.Scanner;

public class LotteryOdds
{
	/*
	 * n*(n-1)*(n-2)*(n-3)... / 1 * 2 * 3 * 4...
	 * 
	 */
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		System.out.println("What is the highest number of n you can draw: ");
		double n = input.nextDouble();
		
		System.out.println("How many numbers: ");
		double k = input.nextDouble();
		
		double sum = 1;
		for(int i = 1; i <= k; i++)
		{
			sum = sum * ((n - i + 1) / i);
			//10 
			//10-1 / 2 = 4.5
			// 10 x 4.5 = 45 
			
		}
		System.out.println("sum= " +sum);
	}
	
}
