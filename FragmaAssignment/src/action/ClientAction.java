package action;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.service.MovieService;

public class ClientAction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MovieService service = new MovieService();
		Action action = new Action(service);
		System.out.println("Top 10 Viewed Movies By views: >>>>>>>>>>>>>>>>>>>>> ");
		action.getTopTenViewedMovies();
		System.out.println("\n\nTop Twenty Rated Movies>>>>>>>>>>>>>>>>>>>>");
		action.getTopTwentyRatedMovies();
		System.out.println("\n\nGenre Ranking>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
		action.getGenreRanks();
		
			
		
		
		
	}

}
