package com.training.programs;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class PredicateStream 
{
    
	// this class represents allMatch method in streams API
	
	public static void main(String[] args) 
	{
         
		Predicate<Employee>  empAgeAbove23=e->e.getAge()>21;
		Predicate<Employee> empSalAbove15k=s->s.getEmpSal()>15_00;
		Predicate<Employee> combinedBoth=empAgeAbove23.and(empSalAbove15k);
		
		
		boolean result=getEmployeeDetails().allMatch(combinedBoth);
		System.out.println(result);
		System.out.println("-------------");
		
		boolean result1=getEmployeeDetails().anyMatch(combinedBoth);
		System.out.println(result1);
	}
    public static Stream<Employee> getEmployeeDetails()
	{
		List<Employee> details=new ArrayList<Employee>();
		
		details.add(new Employee("Sreenivas","1912",15000,20));
		details.add(new Employee("Sreenu","1914",18000,25));
		details.add(new Employee("vas","1902",19000,22));
		details.add(new Employee("nivas","1908",10000,23));
  
		 return details.stream();
	}
}
class Employee
{
	private String name;
   
	private String empId;
	
	private double empSal;

	private int age;
	
	public int getAge()
	{
		return age;
	}
	public void setAge(int age)
	{
		this.age=age;
	}
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmpId() {
		return empId;
	}

	public void setEmpId(String empId) 
	{
		this.empId = empId;
	}

	public double getEmpSal() 
	{
		return empSal;
	}

	public void setEmpSal(double empSal) 
	{
		this.empSal = empSal;
	}

	
    public Employee(String name,String empId,double empSal,int age)
    {
    	this.name=name;
    	this.empId=empId;
    	this.empSal=empSal;
    	this.age=age;
    }

	@Override
	public String toString() {
		return "Employee [name=" + name + ", empId=" + empId + ", empSal=" + empSal + "]";
	}
}