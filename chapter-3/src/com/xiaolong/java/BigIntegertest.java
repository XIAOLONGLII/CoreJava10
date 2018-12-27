package com.xiaolong.java;

import java.math.BigInteger;
import java.util.Scanner;


public class BigIntegertest
{
	public static void main(String[] args)
	{	
		Scanner keyboard = new Scanner(System.in);
		System.out.println("How many numbers do you need to draw? :");
		int k = keyboard.nextInt();
		
		System.out.println("Highest number :");
		int n = keyboard.nextInt();
		
		BigInteger lotteryOdds = BigInteger.valueOf(1);
		
		for(int i = 1; i <= k;i++)
		{
			lotteryOdds = lotteryOdds.multiply(BigInteger.valueOf(n -i - + 1).divide(BigInteger.valueOf(i)));
		}
		System.out.println("Your odds are 1 in " + lotteryOdds + ".Good luck!");

		
	}

}
