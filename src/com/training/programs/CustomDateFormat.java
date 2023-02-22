package com.training.programs;

import java.text.SimpleDateFormat;
import java.time.Clock;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.time.*;  

public class CustomDateFormat
{
   
	public static void main(String[] args) 
    {
		ZoneId zoneId =ZoneId.of("Asia/Kolkata");
		
    	Clock clock=Clock.system(zoneId);
    	LocalDate localDate=LocalDate.now(clock);
    	
    	LocalTime localTime=LocalTime.now(zoneId);
    	
    	
    	LocalDateTime localDateTime=LocalDateTime.of(LocalDate.now(), LocalTime.MAX);
    	
//    	System.out.println(localDate);
//    	System.out.println(localTime);
    	System.out.println(localDateTime);
    	
//    	String dateTime = "2012-02-22T02:06:58.147Z";
//    	ZonedDateTime d = ZonedDateTime.parse(dateTime);
//    	System.out.println(d);
    
    }
	 
}
