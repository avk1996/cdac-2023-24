package custom_exceptions;

import java.time.LocalDate;
import java.time.Period;
import java.util.Iterator;
import java.util.List;

import com.app.core.Brand;
import com.app.core.InkColor;
import com.app.core.StyleWithPens;
import com.app.core.Type;

import custom_handling.PenHandlingException;

public class PenValidationRules {
	public static void validateDuplicatePens(int penId, List<StyleWithPens> penList) throws PenHandlingException {
		StyleWithPens pen = new StyleWithPens(penId);
		if (penList.contains(pen)) {
			throw new PenHandlingException("DENIED: duplicates...");
		}
	}

	public static Brand validateBrand(String penBrand) throws IllegalArgumentException {
		return Brand.valueOf(penBrand.toUpperCase());
	}

	public static Type validateType(String penType) throws IllegalArgumentException {
		return Type.valueOf(penType.toUpperCase());
	}

	public static InkColor validateInkColor(String penInkColor) throws IllegalArgumentException {
		return InkColor.valueOf(penInkColor.toUpperCase());
	}

	public static void updatePenStock(int penId, int penStock, List<StyleWithPens> penList)
			throws PenHandlingException {
		int index = penChecker(penId, penList);
		StyleWithPens updatedPen = penList.get(index);
		updatedPen.setPenStock(updatedPen.getPenStock() + penStock);
	}

	public static int penChecker(int penId, List<StyleWithPens> penList) throws PenHandlingException {
		StyleWithPens pen = new StyleWithPens(penId);
		int index = penList.indexOf(pen);
		if (index == -1) {
			throw new PenHandlingException("Pen doesn't exist...");
		}
		return index;
	}

	public static StyleWithPens specificPenStock(int penId, List<StyleWithPens> penList) throws PenHandlingException {
		int index = penChecker(penId, penList);
		return penList.get(index);
	}

	public static void applyDiscountToPens(List<StyleWithPens> penList) throws PenHandlingException {
		LocalDate currentDate = LocalDate.now();
		penList.stream().filter(p -> Period.between(p.getPenListingDate(), currentDate).toTotalMonths() > 3L)
				.forEach(p -> {
					p.setPenPrice(p.getPenPrice() + p.getPenPrice() * 0.8);
					System.out.println(p);
				});
	}

	public static void removeOldPens(List<StyleWithPens> penList) throws PenHandlingException {
		LocalDate currentDate = LocalDate.now();
		System.out.println("Records deleted: ");
		Iterator<StyleWithPens> i = penList.iterator();
		while (i.hasNext()) {
			StyleWithPens i1 = i.next();
			if (Period.between(i1.getPenListingDate(), currentDate).toTotalMonths() > 9L)
				i.remove();
		}
	}

	public static StyleWithPens validatePens(int penId, String penBrand, String penType, String penInkColor,
			int penStock, double penPrice, String penListingDate, List<StyleWithPens> penList)
			throws PenHandlingException {
		Brand brand = validateBrand(penBrand);
		Type type = validateType(penType);
		InkColor inkColor = validateInkColor(penInkColor);
		validateDuplicatePens(penId, penList);
		LocalDate penDate = LocalDate.parse(penListingDate);
		penPrice = penStock * penPrice;
		return new StyleWithPens(penId, brand, type, inkColor, penStock, penPrice, penDate);
	}
}