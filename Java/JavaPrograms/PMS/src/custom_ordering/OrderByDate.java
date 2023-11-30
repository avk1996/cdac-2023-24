package custom_ordering;

import com.app.core.*;
import java.util.Comparator;

public class OrderByDate implements Comparator<StyleWithPens> {
	public int compare(StyleWithPens p1, StyleWithPens p2) {
		return p1.getPenListingDate().compareTo(p2.getPenListingDate());
	}
}