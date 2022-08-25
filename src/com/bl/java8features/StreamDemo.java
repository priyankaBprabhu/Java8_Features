package com.bl.java8features;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamDemo {

	public static void main(String[] args) {
		
		List<String> names = new ArrayList<>();
		
		names.add("James");
		names.add("Joel");
		names.add("Peter");
		names.add("Kennedy");
		names.add("Mac");

		names.stream().forEach(n -> System.out.println(n));
		names.stream().filter(t -> t.startsWith("J")).forEach(System.out :: println);
		names.stream().sorted().forEach(System.out :: println);
		names.stream().sorted(Comparator.reverseOrder()).forEach(System.out :: println);

		Map<Integer, String> map = new HashMap<>();
		
		map.put(1, "James");
		map.put(2, "Joel");
		map.put(3, "Peter");
		map.put(4, "Kennedy");
		map.put(5, "Mac");

		map.forEach((k, v) -> System.out.println(k + " : " + v));
		map.entrySet().stream().forEach(n -> System.out.println(n));
		map.entrySet().stream().filter(n -> n.getKey() % 2 == 0).forEach(System.out :: println);
		map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out :: println);
		List<Integer> numbers = map.entrySet().stream().map(n -> n.getKey()).collect(Collectors.toList());
		System.out.println(numbers);
		int sum = map.entrySet().stream().map(n -> n.getKey()).reduce(0, (a, b) -> a + b);
		System.out.println(sum);
		int max = map.entrySet().stream().map(n -> n.getKey()).reduce(0, (a, b) -> a > b ? a : b);
		System.out.println(max);
	}
}