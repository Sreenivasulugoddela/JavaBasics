package com.training.programs;
import java.util.*;
public class SampleTwo
{
   public static void main(String[] args) {
	
	   
	   Map<String,Object> map=new HashMap<>();
	   String name="StoreName";
	   String add="3";
	   String add1="3";
	   StringBuilder ab=new StringBuilder("I am software developer");
	   
	   StringBuilder cd=ab.append(" in techouts company");
	   
	   System.out.println(cd);
	   
       String sum=AB.list(add,add1);
   
	   map.put(name, sum);
	   
	   System.out.println(map);
	  
   }
}
class AB
{
	public static String list(String ab,String bc)
	{
		
		return ab+","+bc;
	}
}

