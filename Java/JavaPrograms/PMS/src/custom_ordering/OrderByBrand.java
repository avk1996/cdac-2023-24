package custom_ordering;

import java.util.Comparator;

import com.app.core.StyleWithPens;

public class OrderByBrand implements Comparator<StyleWithPens>{
	public int compare(StyleWithPens s1,StyleWithPens s2) {
		return s1.getPenBrand().name().compareTo(s2.getPenBrand().name());
	}
}