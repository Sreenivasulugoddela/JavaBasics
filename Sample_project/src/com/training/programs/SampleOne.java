package com.training.programs;
import java.util.*;
public class SampleOne 
{
     public static void main(String[] args) 
     {
    	
		int a[]= {1,1,3,2,4,2};
		for(int i=0;i<a.length;i++) 
		{
			int b=a[i];
			for(int j=i+1;j<a.length;j++)
			{
				if(b==a[j]&&b!=5) 
				{
					System.out.println(b);
					a[j]=5;
					break;
				}
				
			}
		}
	}
}
