package com.training.programs;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LocationMain 
{
    
	
	public static void main(String[] args) 
	{
		
	     Location location=new Location();
	     
	     location.setLocationDistance(79.990);
	     location.setLocationDistance(81.990);
	     location.setLocationDistance(69.990);    
	     location.setLocationDistance(379.990);
	     Map<String,Location> locationMap=new HashMap<String, Location>();
	     
	     //locationMap.put("nearLoacation",);
	     //final Double nearestLocation=findNearestLocationDistance(location);
	     //System.out.println(findNearestLocationDistance(location));
	   
	}
	
	public static Double findNearestLocationDistance(Collection<Location> locations)
	{
		List<Location> sortedLocations=new ArrayList<>(locations);
		Collections.sort(sortedLocations,Comparator.comparing(Location::getLocationDistance));
		Double nearestLocationDistance = sortedLocations.stream().findFirst().get().getLocationDistance();
        return nearestLocationDistance;	
    
	}
	}


class Location 
{
	private String locationName;
	
	private int locationId;
	
	private double locationDistance;

	public String getLocationName() {
		return locationName;
	}

	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}

	public int getLocationId() {
		return locationId;
	}

	public void setLocationId(int locationId) {
		this.locationId = locationId;
	}

	public double getLocationDistance() {
		return locationDistance;
	}

	public void setLocationDistance(double locationDistance) {
		this.locationDistance = locationDistance;
	}

	@Override
	public String toString() 
	{
		return "Location [locationName=" + locationName + ", locationId=" + locationId + ", locationDistance="
				+ locationDistance + "]";
	}
}
