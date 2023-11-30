package com.app.core;

import java.time.LocalDate;


public class StyleWithPens {
	private static int Id;
	private int penId;
	private Brand penBrand;
	private Type penType;
	private InkColor penInkColor;
	private int penStock;
	private LocalDate penListingDate;
	private double penPrice;
	static {
		Id = 0;
	}

	public StyleWithPens(int penId,Brand penBrand, Type penType, InkColor penInkColor, int penStock, double penPrice,
			LocalDate penListingDate) {
		super();
		this.penId=++Id;
		this.penBrand = penBrand;
		this.penType = penType;
		this.penInkColor = penInkColor;
		this.penStock = penStock;
		this.penPrice = penPrice;
		this.penListingDate = penListingDate;
	}

	@Override
	public String toString() {
		return "StyleWithPens [penBrand=" + penBrand + ", Pen meterial type=" + penType + ", penInkColor=" + penInkColor
				+ ", penStock=" + penStock + ", penListingDate=" + penListingDate + ", penPrice=" + penPrice + "]";
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("In equals method...");
		if (obj instanceof StyleWithPens) {
			StyleWithPens id = (StyleWithPens) obj;
			if (penId == id.penId)
				return true;
		}
		return false;
	}
//	public int compareTo(StyleWithPens newPen) {
//		return this.getPenListingDate().compareTo(newPen.getPenListingDate());
//	}

	public StyleWithPens(int penId) {
		super();
		this.penId = penId;
	}

	public int getPenStock() {
		return penStock;
	}

	public void setPenStock(int penStock) {
		this.penStock = penStock;
	}

	public int getPenId() {
		return penId;
	}

	public void setPenId(int penId) {
		this.penId = penId;
	}

	public double getPenPrice() {
		return penPrice;
	}

	public void setPenPrice(double penPrice) {
		this.penPrice = penPrice;
	}

	public static int getId() {
		return Id;
	}

	public static void setId(int id) {
		Id = id;
	}

	public Brand getPenBrand() {
		
		return penBrand;
	}

	public void setPenBrand(Brand penBrand) {
		this.penBrand = penBrand;
	}

	public Type getPenType() {
		return penType;
	}

	public void setPenType(Type penType) {
		this.penType = penType;
	}

	public InkColor getPenInkColor() {
		return penInkColor;
	}

	public void setPenInkColor(InkColor penInkColor) {
		this.penInkColor = penInkColor;
	}

	public LocalDate getPenListingDate() {
		return penListingDate;
	}

	public void setPenListingDate(LocalDate penListingDate) {
		this.penListingDate = penListingDate;
	}
	
}