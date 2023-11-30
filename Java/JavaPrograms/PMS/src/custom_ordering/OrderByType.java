package custom_ordering;

import java.util.Comparator;

import com.app.core.StyleWithPens;

public class OrderByType implements Comparator<StyleWithPens> {
	public int compare(StyleWithPens s1, StyleWithPens s2) {
		return s2.getPenType().name().compareTo(s1.getPenType().name());
	}
}
