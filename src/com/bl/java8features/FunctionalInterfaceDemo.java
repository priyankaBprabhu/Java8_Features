package com.bl.java8features;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class FunctionalInterfaceDemo {
	public static void main(String[] args) {

		Predicate<Integer> isEven =(n)->n%2==0;
		System.out.println("Result = "+ isEven.test(59));
		
		List<Integer> numbers = new ArrayList<>();
		numbers.add(4);
		numbers.add(5);
		numbers.add(6);
		numbers.add(7);
		numbers.add(8);
		
		numbers.stream().filter(isEven).forEach(n->System.out.println("Even = "+ n));
	}

}
