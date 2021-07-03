package com.VariableJava;

public class variableJava {

	static int b = 20;
	
	static int c = 30;
	
	public static void main(String[] args) {
		ConstractorExample obj = new ConstractorExample ();
		obj.subtract();
	}

	protected static void number () {
		int a = 10;
		
		System.out.println("Adding three numbers : " +(a + b+c));
	}
}
