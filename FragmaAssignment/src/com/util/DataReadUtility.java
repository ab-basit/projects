package com.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import com.model.User;
import com.model.Rating;
import com.model.Movie;


public class DataReadUtility {
	
	static String path="\\D:\\Downloads\\ml-1m\\";
	static String delim="::";

 
	public static List<User> getUsers(){
		ArrayList<User> users = new ArrayList<User>();
		FileReader fd=null;
		BufferedReader br=null;
		Scanner sc;
		String line;
		 try {
			 	fd=new FileReader(new File(path+"users.dat"));
			    br=new BufferedReader(fd);
				while((line=br.readLine())!=null) {
					User user=new User();
					sc = new Scanner(line);
					sc.useDelimiter(delim);
					while(sc.hasNext()) {
						user.setUserId(sc.nextInt());
						user.setGender(sc.next());
						user.setAge(sc.nextInt());
						user.setOccupation(sc.next());
						//System.out.println(sc.next());
						user.setZipcode(sc.next());
					}
					users.add(user);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			finally {
				  try {
				  fd.close();
				  br.close();
				  }
				  catch(IOException e) {
					  e.printStackTrace();
				  }
			  }
			
		return users;
		 

	}
	public static List<Movie> getMovies(){
		ArrayList <Movie> movies = new ArrayList<>();
		FileReader fd=null;
		BufferedReader br=null;
		Scanner sc;
		String line;
		try {
			fd=new FileReader(new File(path+"movies.dat"));
		    br=new BufferedReader(fd);
			while((line=br.readLine())!=null) {
				Movie movie=new Movie();
				sc = new Scanner(line);
				sc.useDelimiter(delim);
				while(sc.hasNext()) {
	               movie.setMovieId(sc.nextInt());
	               movie.setTitle(sc.next());
	               movie.setGenre(sc.next().split("\\|"));
				}
				movies.add(movie);
			}
	  }
	  catch(IOException e) {
		  e.printStackTrace();
		  
	  }
	  finally {
		  try {
		  fd.close();
		  br.close();
		  }
		  catch(IOException e) {
			  e.printStackTrace();
		  }
	  }
		return movies;
	
	
	}
	
	public static List<Rating> getMovieRating(){
		ArrayList<Rating> movieRatings = new ArrayList<>();
		FileReader fd=null;
		BufferedReader br=null;
		Scanner sc;
		String line;
		 try {
				fd=new FileReader(new File(path+"ratings.dat"));
			    br=new BufferedReader(fd);
				while((line=br.readLine())!=null) {
					Rating rating=new Rating();
					sc = new Scanner(line);
					sc.useDelimiter(delim);
					while(sc.hasNext()) {
						rating.setUserId(sc.nextInt());
						rating.setMovieId(sc.nextInt());
						rating.setRating(sc.nextInt());
						long time=sc.nextLong();
						//SimpleDateFormat sdf = new SimpleDateFormat();
				       // sdf.setTimeZone(TimeZone.getTimeZone("UTC"));
				        rating.setTimestamp(new Date(time));
					}
					movieRatings.add(rating);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
			finally {
				  try {
				  fd.close();
				  br.close();
				  }
				  catch(IOException e) {
					  e.printStackTrace();
				  }
			  }
		 return movieRatings;
		
	 
	}

}
