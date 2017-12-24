package com.service;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import com.model.GenreRank;
import com.model.Movie;
import com.model.Rating;
import com.model.User;
import com.util.SortUtility;

import factory.AgeFactory;

public class MovieService {
		
	public HashMap<Integer,Integer> getViewedMovies(List<Rating> ratingList){
		  HashMap<Integer, Integer> hm1= new HashMap<Integer,Integer>();
		  int key;
		  int val;
		  for(Rating r:ratingList) {
			   key=r.getMovieId();
			  if(hm1.containsKey(key)) {
				  val=hm1.get(key);
				  val++;
				  hm1.put(key,val);
			  }
			  else
				  hm1.put(key,1);
		  }
		  return hm1;
		  
	  
	  }
	public HashMap<Integer,Integer> getRatedMovies(List<Rating> ratingList){
		  HashMap<Integer, Integer> hm2= new HashMap<Integer,Integer>();
		  for(Rating r:ratingList) {
			  int key=r.getMovieId();
			  int rate=r.getRating();
			  int rating;
		  if(hm2.containsKey(key)) {
			  rating = hm2.get(key);
			  rating+=rate;
			  hm2.put(key,rating);
			  
		  }
		  else
			  hm2.put(key,rate);

	  }
		  return hm2;
	  }

	
	public HashMap<Integer,String> getMovies(List<Movie> movieList){
		  HashMap<Integer,String> hm= new HashMap<Integer,String>();
		  for(Movie m : movieList) {
			  hm.put(m.getMovieId(),m.getTitle());
		  }
		  return hm;
		  
	  }
	public List<Map.Entry<String,Integer>> getTopTenViewedMoviesByName(HashMap<Integer,String> hm,HashMap<Integer,Integer> hm2){
		ArrayList<Map.Entry<Integer,Integer>> al =SortUtility.sortMap(hm2);
		  HashMap<String,Integer> tm = new HashMap<>();
		  int key,val;
		  String newkey;
		 // Iterator<Map.Entry<Integer,Integer>> it=al.iterator();
		  for(Map.Entry<Integer,Integer> m:al) {
		 // while(it.hasNext()) { 
			key = m.getKey();
			val=m.getValue();
			newkey=hm.get(key);
			tm.put(newkey, val);
			if(tm.size()==10)
				break;
			
		  }
		  ArrayList<Map.Entry<String,Integer>> topMovies = SortUtility.sortMapByKey(tm);
		  return topMovies;
	  }
	public List<Map.Entry<String, Integer>> getTopTenViewedMoviesByViews(HashMap<Integer,String> hm,HashMap<Integer,Integer> hm2)
	{
		ArrayList<Map.Entry<Integer,Integer>> al =SortUtility.sortMap(hm2);
		  HashMap<String,Integer> tm = new HashMap<>();
		  int key,val;
		  String newkey;
		  for(Map.Entry<Integer,Integer> m:al) { 
			key = m.getKey();
			val=m.getValue();
			newkey=hm.get(key);
			tm.put(newkey, val);
			if(tm.size()==10)
				break;
			
		  }
		  ArrayList<Map.Entry<String,Integer>> topMovies = SortUtility.sortMapByValue(tm);
		  return topMovies;

			
		}
	
	
	public HashMap<String,Integer> getTopTwentyRatedMovies(HashMap<Integer,Integer> ViewedMovies,HashMap<Integer,Integer> movieRating,
			HashMap<Integer,String>  movies){
		  HashMap<String,Integer>  hm4 = new HashMap<>();
		  ArrayList<Map.Entry<Integer, Integer>> al=SortUtility.sortMap(movieRating);
		  int key;
		  for(Map.Entry<Integer, Integer> m:al) {
			  key=m.getKey();
			  if(ViewedMovies.get(key)>=40) {
				  hm4.put(movies.get(key),movieRating.get(key));
			  }
			  if(hm4.size()==20)
				  break;
			  
		  } 
		  return hm4;
		  
	  }
	
	public HashMap<Integer,String> getIdOccAgeRat(List<User> users,List<Rating> rating){
		Properties prop = new Properties();
		 InputStream is = getClass().getClassLoader().getResourceAsStream("Com/properties/Occupation.properties");
		try{
			if(is != null) {
		          prop.load(is);
		     }
		else {
			throw new FileNotFoundException("property file not found");
			}
		} 
	    catch(IOException e) {
		e.printStackTrace();
	
	    }
		
		String occupation;
		HashMap<Integer,String> idOccupationAge = new HashMap<>();
		for(User u:users) {
			String ageRange=AgeFactory.getAge(u.getAge());
			if(ageRange != null) {
				occupation=prop.getProperty(u.getOccupation());
				idOccupationAge.put(u.getUserId(),occupation + "::"+ageRange);
			}
		}
		HashMap<Integer,String> MovieIdOARating = new HashMap<>();
		for(Rating r:rating) {
			if(idOccupationAge.get(r.getUserId())!=null )
				MovieIdOARating.put(r.getMovieId(), idOccupationAge.get(r.getUserId())+"::"+r.getRating());
		}
		return MovieIdOARating;
		
	}
	
	public HashMap<String,GenreRank> getOccAgeGenRat(List<Movie> movies,HashMap<Integer,String> MovieIdOARating){
		HashMap<String ,GenreRank> rat = new HashMap<>();
		String[] genre,keys=null;
		String key;
		int rate;
		String mId;
		for(Movie m: movies) {
			genre=m.getGenre();
			for(String g:genre) {
				if(g != null) {
					try {
				mId=MovieIdOARating.get(m.getMovieId());
				if(mId != null) {
				keys=MovieIdOARating.get(m.getMovieId()).split("::");	
				if(keys != null && keys.length>2) {
				key=keys[0]+"::"+keys[1]+"::"+g;
				rate=Integer.parseInt(keys[2]);
				if(rat.containsKey(key)) {
					GenreRank gR =rat.get(key);
					gR.setCount(gR.getCount()+1);
					gR.setSum(gR.getSum()+rate);
					
				}
				else {
					GenreRank gR= new GenreRank();
					gR.setGenre(key);
					gR.setCount(1);
					gR.setSum(rate);
					rat.put(key, gR);
					
				 }
				}
				 }
				} catch(Exception e) {
					e.printStackTrace();
				}
				}
				
				     }
			}	return rat;	
		}
	


	 
	 public HashMap<String,String> getGR(HashMap<String,GenreRank> hm){
		 GenreRank genreRank;
		 double avg;
		 HashMap<String,Double> hm1 = new HashMap<>();
		 for(Map.Entry<String,GenreRank> gr:hm.entrySet()) {
			 genreRank = gr.getValue();
			 avg=genreRank.getSum()/genreRank.getCount();
			 hm1.put(gr.getKey(),avg);
			 
		 }
		ArrayList<Map.Entry<String,Double>> al= SortUtility.sortMapByDValue(hm1);
		 HashMap<String,String> fmap= new HashMap<>();
		 String[] data;
		 String key,value,val;
		for(Map.Entry<String, Double> m: al) {
			if(m.getKey()!=null) {
			data=m.getKey().split("::");
			key=data[0]+"::"+data[1];
			value=data[2];
			if(fmap.containsKey(key)) {
				if(fmap.get(key).split("::").length<5) {
					val=fmap.get(key);
					fmap.put(key, val+"::"+value);
					
				}
				else {
					continue;
				}
			}
			else {
				fmap.put(key, value);
			}
			}
		}
		return fmap;
	 }
		
		
	

	}
	
	
	


