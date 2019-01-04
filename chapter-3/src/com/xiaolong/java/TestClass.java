package com.xiaolong.java;

import java.util.ArrayList;
import java.util.List;



public class TestClass
{
	public static void main(String[] args)
	{
		List<String> items = new ArrayList<>();
		
		items.add("Box");
		items.add("Pen");
		items.add("Pencil");
		
		
		for(String i: items)
		{
			if(i.indexOf("P") == 0)
			{
				continue;
			}
			else
			{
				System.out.print(i + " ");
			}
		}
		
	}

}
