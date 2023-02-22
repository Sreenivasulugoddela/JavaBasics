package com.training.programs;

public class TwoMapsPurpose 
{
   public static void main(String[] args) 
   {
	   
   }
}
class MapOne
{
	private String retailerName;
	
	private int retailerId;
	
	private String parentCompany;

	public MapOne()
	{
		
	}
	
	public MapOne(String retailerName, int retailerId, String parentCompany) {
		super();
		this.retailerName = retailerName;
		this.retailerId = retailerId;
		this.parentCompany = parentCompany;
	}

	public String getRetailerName() {
		return retailerName;
	}

	public void setRetailerName(String retailerName) {
		this.retailerName = retailerName;
	}

	public int getRetailerId() {
		return retailerId;
	}

	public void setRetailerId(int retailerId) {
		this.retailerId = retailerId;
	}

	public String getParentCompany() {
		return parentCompany;
	}

	public void setParentCompany(String parentCompany) {
		this.parentCompany = parentCompany;
	}

	@Override
	public String toString() {
		return "MapOne [retailerName=" + retailerName + ", retailerId=" + retailerId + ", parentCompany="
				+ parentCompany + "]";
	}
	
}
class MapTwo
{
	private String ProductName;
	
	private double amount;
      
	public MapTwo()
	{
		
	}
	public MapTwo(String productName, double amount) {
		super();
		ProductName = productName;
		this.amount = amount;
	}

	public String getProductName() {
		return ProductName;
	}

	public void setProductName(String productName) {
		ProductName = productName;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "MapTwo [ProductName=" + ProductName + ", amount=" + amount + "]";
	}
	
	
}