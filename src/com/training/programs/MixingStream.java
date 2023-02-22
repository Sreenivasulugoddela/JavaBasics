package com.training.programs;

import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MixingStream 
{
   public static void main(String[] args) 
   {
	
	
	List<Integer> elements=Arrays.asList(3,2,1,4,5,8);
	
	// summing the array using streams
	
	int add=elements.stream().mapToInt(Integer::intValue).sum();
    
	
	// find avarage of an array using streams
	OptionalDouble avg=elements.stream().mapToDouble(d->d).average();
	
	System.out.println(add);
	
	//to find count of an array
	
	long count=elements.stream().mapToInt(m->m).count();
	
	//using int stream to find summary statistics
	
	IntStream intstream=IntStream.of(1,2,3,3,4,6,5);
	
	IntSummaryStatistics stats=intstream.summaryStatistics();
	
	System.out.println("summaryStatistics"+stats);
	
	
	//  to find minimum value
	OptionalInt lowValue=elements.stream().mapToInt(m-> m).min();
	
	
	// to find maximum value
	OptionalInt highestValue=elements.stream().mapToInt(m->m).max();
	
	System.out.println("Highest value is "+highestValue);
	
	System.out.println("Lowest value"+lowValue);
	
	List<Double> findFirst=Arrays.asList(657.99,800.00,100.00,456.00,589.00,800.00);
	//to find first value
	Optional<Double> result1=findFirst.stream().findFirst();
	 //System.out.println();
	
      // to find any value
	  Optional<Double> result2=findFirst.stream().findAny();
	
      System.out.println("Find first"+result1);
      
      System.out.println(result2);
      
      //to find first value with using filters concept
      int one=elements.stream().peek(num->System.out.println("numbers is"+num))
    		  .filter(x->x<2)
    		  .findFirst()
    		  .get();
      
      
      System.out.println(one);
    
      //using flatMap method 
      List coutry=Stream.of(Arrays.asList("A","B","C","D","E"),Arrays.asList("A","G","H","I","J"),Arrays.asList("K","L","M","N","O","P")
    		  ).flatMap(List::stream).distinct().collect(Collectors.toList());
      System.out.println(coutry);
    		  
   }	
	
}
