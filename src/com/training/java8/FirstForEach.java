package com.training.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FirstForEach 
{
    
	
	public static void main(String[] args) throws Exception {
		
		List<String> characters=Arrays.asList("sreenivas","abhiDas","ramDas");
		//Filtering with strating character 
		characters.stream().filter(s->s.startsWith("s"))
		                    .filter(s->s.endsWith("s"))
		                   .forEach(System.out::println);
	}
}
