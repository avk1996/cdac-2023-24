package com.app.core;
import java.util.List;

public interface Company {
	public Company addItem(List<Company> newCompany);
	public Company updateItem(Company newCompany);
	public double setDiscount(double item,List<Company> newCompany);
	public void removeItems(List<Company> company);
	public void checkItemAvailability(List<Company> company);
	public void itemAddedDate(List<Company> company);
}