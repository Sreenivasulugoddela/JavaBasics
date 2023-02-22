package com.training.programs;

import java.util.ArrayList;
import java.util.List;

public class CustomPurpose 
{
   private String name;
   
   private String age;
   
   private String email;

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getAge() {
	return age;
}

public void setAge(String age) {
	this.age = age;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

@Override
public String toString() {
	
	return "CustomPurpose [name=" + name + ", age=" + age + ", email=" + email + "]";
}


        public static void main(String[] args) {
			
        	List<String> one=new ArrayList<String>();
        	
        	
        	List<Integer> two=new ArrayList<Integer>();
        	
        	one.add("Oned");
        	two.add(01);
        	
        	for(String s: one)
        	{
        		for(Integer i: two)
        		{
        			System.out.println(s+" "+i);
        		}
        	}
        	
		}
}
