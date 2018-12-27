package com.xiaolongl.corejava;

import javax.swing.*;

public class InputSwing {
	public static void main(String[] args)
	{
		String name = JOptionPane.showInputDialog("What is your name?");
		String input = JOptionPane.showInputDialog("What is your age?");
		int age = Integer.parseInt(input);
		System.out.println("Hello " + name + "I am " + age);
		
	}
}
