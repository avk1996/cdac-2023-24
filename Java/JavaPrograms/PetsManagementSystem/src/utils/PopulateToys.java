package utils;

import java.util.ArrayList;
import java.util.List;

import static com.app.core.Brand.*;
//Foodie_Puppies,FutureKart;
import static com.app.core.Material.*;
//Plastic,Rubber;
import static com.app.core.Name.*;
//Squeaky_Ball,Solitaire_Stategy_Game;
import com.app.core.PetsToy;
import static java.time.LocalDate.*;

public class PopulateToys {
	public static List<PetsToy> populatedToys() {
		List<PetsToy> toyLists = new ArrayList<>();

		toyLists.add(new PetsToy(SQUEAKY_BALL, FUTUREKART, RUBBER, 500, parse("2022-10-10")));
		toyLists.add(new PetsToy(SQUEAKY_BALL, FUTUREKART, RUBBER, 500, parse("2022-10-27")));
		toyLists.add(new PetsToy(SOLITAIRE_STRATEGY_GAME, FOODIE_PUPPIES, PLASTIC, 500, parse("2023-12-08")));
		toyLists.add(new PetsToy(SOLITAIRE_STRATEGY_GAME, FOODIE_PUPPIES, PLASTIC, 500, parse("2023-05-06")));

		return toyLists;
	}
}