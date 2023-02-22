package com.training.programs;

import java.util.HashMap;
import java.util.Map;

public class ObjectCondition 
{
   public static void main(String[] args) 
   {
	  long one=9897l;
	  Map<String, Integer> map=new HashMap<String, Integer>();
	  double two=766.987;
	   int a=565;
	   if(a<map.getOrDefault("dsds",90))
	   {
	     two=(double)one/two;
	     System.out.println(two);
	     System.out.println("++++++");
	   }
	   else
		   System.out.println("=================");
   }
  
}

