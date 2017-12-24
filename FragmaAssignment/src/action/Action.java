package action;

import java.util.ArrayList;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


import com.model.GenreRank;
import com.model.Movie;
import com.model.Rating;
import com.model.User;
import com.service.MovieService;
import com.util.DataReadUtility;
import com.util.SortUtility;

public class Action {
	List<Movie> movies =null;
	List<User> users = null;
	List<Rating> movieRatings =null;
	MovieService service;
	Action(MovieService service){
		this.service=service;
	}
	
		public void getTopTenViewedMovies() {
		if(movieRatings == null)
			movieRatings=DataReadUtility.getMovieRating();
		HashMap<Integer,Integer> viewedMovies=service.getViewedMovies(movieRatings);
		if(movies == null)
			movies=DataReadUtility.getMovies();
		HashMap<Integer,String> movieTitleMap = service.getMovies(movies);
		List<Map.Entry<String,Integer>> topMovies = service.getTopTenViewedMoviesByViews(movieTitleMap,viewedMovies);
		System.out.println("Movie Title                     Views " );
		for(Map.Entry<String, Integer> m: topMovies) 
			 System.out.println(m.getKey()+ "    >>>>    "+m.getValue());
		//return topMovies;
		
	}
	public void getTopTwentyRatedMovies(){
		if(movieRatings == null)
			movieRatings=DataReadUtility.getMovieRating();
		HashMap<Integer,Integer> viewedMovies=service.getViewedMovies(movieRatings);
		HashMap<Integer,Integer> ratings = service.getRatedMovies(movieRatings);
		if(movies == null)
			movies=DataReadUtility.getMovies();
		HashMap<Integer,String> movieTitleMap = service.getMovies(movies);
		HashMap<String,Integer> rtmovies = service.getTopTwentyRatedMovies(viewedMovies, ratings, movieTitleMap);
		List<Map.Entry<String,Integer>> topRatedList = new ArrayList<>(rtmovies.entrySet());
		System.out.println("Movie Title                    Rating");
		for(Map.Entry<String, Integer> m: topRatedList)
			System.out.println(m.getKey()+ " >>>> "+m.getValue());
		//return rtmovies;
		
	}
	public void getGenreRanks() {
		if(users == null)
			users=DataReadUtility.getUsers();
		if(movieRatings == null)
			movieRatings=DataReadUtility.getMovieRating();
		HashMap<Integer,String> idAgeOccRat = service.getIdOccAgeRat(users,movieRatings);
	    if(movies == null)
	    	movies=DataReadUtility.getMovies();
	    HashMap<String,GenreRank> hm=service.getOccAgeGenRat(movies,idAgeOccRat);
	    HashMap<String,String> hms=service.getGR(hm);
	    ArrayList<Map.Entry<String, String>> m1= SortUtility.sortMapBySKey(hms);
			//new ArrayList<>(hms.entrySet());
	    System.out.println("Occupation   Age Range              GenreRanking 1 --> 5   ");
	    for(Map.Entry<String, String> m:m1)
		System.out.println(m.getKey()+"  >>>>    "+m.getValue());
	
	}
	public MovieService getService() {
		return service;
	}

	public void setService(MovieService service) {
		this.service = service;
	}
    


}
