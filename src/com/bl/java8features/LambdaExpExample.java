package com.bl.java8features;

interface Calculator {
	
	int sum(int num1, int num2); 
}

public class LambdaExpExample {
	
public static void main(String[] args) {
	
	Calculator addition = (n1,n2) -> n1 + n2;
	
	System.out.println("Sum = " + addition.sum(78, 32));
	
}
}