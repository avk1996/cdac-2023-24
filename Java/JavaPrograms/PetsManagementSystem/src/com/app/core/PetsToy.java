package com.app.core;

import java.time.LocalDate;

public class PetsToy {
	private static int petNumber;
	static {
		petNumber = 0;
	}
	private int petId;
	private Name toyNames;
	private Brand toyBrand;
	private Material toyMaterial;
	private double toyPrice;
	private LocalDate toyListingDate;

	public PetsToy(Name toyNames, Brand toyBrand, Material toyMaterial, double toyPrice, LocalDate toyListingDate) {
		super();
		this.petId = ++petNumber;
		this.toyNames = toyNames;
		this.toyBrand = toyBrand;
		this.toyMaterial = toyMaterial;
		this.toyPrice = toyPrice;
		this.toyListingDate = toyListingDate;
	}

	public static int getPetNumber() {
		return petNumber;
	}

	public static void setPetNumber(int petNumber) {
		PetsToy.petNumber = petNumber;
	}

	public int getPetId() {
		return petId;
	}

	public void setPetId(int petId) {
		this.petId = petId;
	}

	public Name getToyNames() {
		return toyNames;
	}

	public void setToyNames(Name toyNames) {
		this.toyNames = toyNames;
	}

	public Brand getToyBrand() {
		return toyBrand;
	}

	public void setToyBrand(Brand toyBrand) {
		this.toyBrand = toyBrand;
	}

	public Material getToyMaterial() {
		return toyMaterial;
	}

	public void setToyMaterial(Material toyMaterial) {
		this.toyMaterial = toyMaterial;
	}

	public double getToyPrice() {
		return toyPrice;
	}

	public void setToyPrice(double toyPrice) {
		this.toyPrice = toyPrice;
	}

	public LocalDate getToyListingDate() {
		return toyListingDate;
	}

	public void setToyListingDate(LocalDate toyListingDate) {
		this.toyListingDate = toyListingDate;
	}

	@Override
	public String toString() {
		return "PetsToy [petId=" + petId + ", toyNames=" + toyNames + ", toyBrand=" + toyBrand + ", toyMaterial="
				+ toyMaterial + ", toyPrice=" + toyPrice + ", toyListingDate=" + toyListingDate + "]";
	}

}