package utils;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeParseException;
import java.util.Iterator;
import java.util.List;

import com.app.core.Brand;
import com.app.core.Material;
import com.app.core.Name;
import com.app.core.PetsToy;

import custom_exception.ToyHandlingException;

public class ToyValidationRules {
	public static PetsToy validateToys(String toyNames, String toyBrand, String toyMaterial, double toyPrice,
			String toyListingDate, List<PetsToy> toyList) throws ToyHandlingException, IllegalAccessException {
		Name name = Name.valueOf(toyNames.toUpperCase());
		Brand brand = Brand.valueOf(toyBrand.toUpperCase());
		Material material = Material.valueOf(toyMaterial.toUpperCase());
		validateToyNames(toyNames, toyList);
		validateToyBrand(toyBrand, toyList);
		validateToyMaterial(toyMaterial, toyList);
		LocalDate newToyDate = LocalDate.parse(toyListingDate);
		return new PetsToy(name, brand, material, toyPrice, newToyDate);
	}

	public static Name validateToyNames(String toyNames, List<PetsToy> toyList) throws IllegalAccessException {
		return Name.valueOf(toyNames.toUpperCase());
	}

	public static Brand validateToyBrand(String toyBrand, List<PetsToy> toyList) throws IllegalAccessException {
		return Brand.valueOf(toyBrand.toUpperCase());
	}

	public static Material validateToyMaterial(String toyMaterial, List<PetsToy> toyList)
			throws IllegalAccessException {
		return Material.valueOf(toyMaterial.toUpperCase());
	}

	public static void checkToyAvailability(int toyId, List<PetsToy> toyLists) throws ToyHandlingException {
		for (PetsToy pt : toyLists) {
			if (pt.getPetId() == toyId) {
				System.out.println("Toy Available: ");
				System.out.println(pt);
			}
		}
	}

	public static void updateToyDate(int toyId, String updateToyListingDate, List<PetsToy> toyLists)
			throws ToyHandlingException, DateTimeParseException {
		for (PetsToy pt : toyLists) {
			if (pt.getPetId() == toyId) {
				pt.setToyListingDate(LocalDate.parse(updateToyListingDate));
			}
		}
	}

	public static void applyDiscountToToy(int toyId, double toyDiscount, List<PetsToy> toyLists) {
		for (PetsToy pt : toyLists) {
			if (pt.getPetId() == toyId) {
				if (pt.getToyPrice() > toyDiscount) {
					pt.setToyPrice(pt.getToyPrice() - toyDiscount);
				}
			}
		}
	}

	public static void removeOldToys(List<PetsToy> toyLists) {
		LocalDate currentDate = LocalDate.now();
		Iterator<PetsToy> i = toyLists.iterator();
		while (i.hasNext()) {
			PetsToy pt =i.next();
			if(Period.between(pt.getToyListingDate(),currentDate).toTotalMonths()>9)
			{
				i.remove();
			}
			
		}
		
	}
	public static void applyDiscountToOneYearToys(List<PetsToy> toyLists) {
		LocalDate currentDate = LocalDate.now();
		for(PetsToy pt: toyLists) {
			if(Period.between(pt.getToyListingDate(), currentDate).getYears() == 1) {
				pt.setToyPrice(pt.getToyPrice()*0.25);
			}
		}
	}
}