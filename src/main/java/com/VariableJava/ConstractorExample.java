package com.VariableJava;

public class ConstractorExample {

	public ConstractorExample () {
			divide();
			//System.out.println("This is the constractor");
	}
	
	static void subtract() {
		System.out.println("This is result for subtract"+(7-2));
	}
	
	static void divide() {
		System.out.println("This is result for divide"+(4/2));
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		subtract();
	}

}
