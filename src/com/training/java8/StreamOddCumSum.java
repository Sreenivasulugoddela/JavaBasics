package com.training.java8;

import java.util.Arrays;
import java.util.List;

public class StreamOddCumSum 
{
    
	public static void main(String[] args) {
		
		List<Integer> numbers=Arrays.asList(22,31,34,54,44,76,7,9);
	
		int n=numbers.stream().filter(i->i%2!=0)
		.mapToInt(Integer::intValue)
		.sum();

		System.out.println(n);
		
	}
 }
