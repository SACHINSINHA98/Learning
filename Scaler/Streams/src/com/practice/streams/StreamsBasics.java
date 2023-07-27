package com.practice.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.function.Consumer;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamsBasics {

	public static void main(String[] args) {
		List<Integer> list = List.of(5, 10, 1, 1, 2, 4, 5, 6, 7, 8);
		list.forEach(i -> System.out.print(i + " "));
		System.out.println();
		System.out.println("-----------------------------------------");
		List<Integer> list2 = list.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
		System.out.println(list2);
		System.out.println("-----------------------------------------");
		list.stream().distinct().forEach(i -> System.out.print(i + " "));
		System.out.println();
		System.out.println("-----------------------------------------");
		list.stream().map(i -> i + 10).distinct().forEach(i -> System.out.print(i + " "));
		System.out.println();
		System.out.println("-----------------------------------------");
		Optional<Integer> max = list.stream().max((i, j) -> i.compareTo(j));
		System.out.println(max);
		System.out.println();
		System.out.println("-----------------------------------------");
		Object[] arr = list.stream().toArray();
		System.out.println(Arrays.toString(arr));
		System.out.println();
		System.out.println("-----------------------------------------");
		Set<Integer> collect = list.stream().collect(Collectors.toSet());
		System.out.println(collect);
		System.out.println();
		System.out.println("-----------------------------------------");
		list.stream().sorted(Comparator.reverseOrder()).forEach(i -> System.out.print(i + " "));

		list.forEach(new Consumer<Integer>() {

			@Override
			public void accept(Integer t) {
				Integer m= t+10;
				System.out.println(m);
			}

		});
		list.forEach(i->System.out.println(i+10));

	}

}
