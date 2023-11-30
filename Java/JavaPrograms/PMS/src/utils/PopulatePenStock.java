package utils;

import static com.app.core.Brand.*;
import static com.app.core.InkColor.*;
import static com.app.core.Type.*;
import static java.time.LocalDate.*;
import java.util.ArrayList;
import java.util.List;

import com.app.core.StyleWithPens;

public class PopulatePenStock {
	public static List<StyleWithPens> populatePens() {
		List<StyleWithPens> penLists = new ArrayList<>();
		penLists.add(new StyleWithPens(1,LEXI, PLASTIC, RED, 5, 15, parse("2023-10-10")));
		penLists.add(new StyleWithPens(2,TRIMAX, ALLOYMETAL, BLACK, 5, 50, parse("2012-09-10")));
		penLists.add(new StyleWithPens(3,CELLO, METAL, RED, 5, 20, parse("2017-08-10")));
		penLists.add(new StyleWithPens(4,REYNOLDS, PLASTIC, GREEN, 5, 20, parse("2017-08-10")));
		return penLists;
	}
}