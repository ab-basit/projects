package com.util;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class SortUtility {
	
	 public static ArrayList<Map.Entry<Integer, Integer>> sortMap(HashMap<Integer, Integer> hm){
			ArrayList<Map.Entry<Integer, Integer>> al = new ArrayList<Entry<Integer, Integer>>(hm.entrySet());
			Collections.sort(al,new Comparator<Map.Entry<Integer,Integer>>(){
				   
				   public int compare(Map.Entry<Integer, Integer> o1, Map.Entry<Integer, Integer> o2) {
					   return o2.getValue().compareTo(o1.getValue());
				   }
			   });
			return al;
			}
	 
	 public static ArrayList<Map.Entry<String, Integer>> sortMapByKey(HashMap<String, Integer> hm){
			ArrayList<Map.Entry<String, Integer>> al = new ArrayList<Entry<String, Integer>>(hm.entrySet());
			Collections.sort(al,new Comparator<Map.Entry<String,Integer>>(){
				   
				   public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
					   return o1.getKey().compareTo(o2.getKey());//increasing order of key
				   }
			   });
			return al;
			} 

	 public static ArrayList<Map.Entry<String, Integer>> sortMapByValue(HashMap<String, Integer> hm){
			ArrayList<Map.Entry<String, Integer>> al = new ArrayList<Entry<String, Integer>>(hm.entrySet());
			Collections.sort(al,new Comparator<Map.Entry<String,Integer>>(){
				   
				   public int compare(Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2) {
					   return o2.getValue().compareTo(o1.getValue());// decreasing order order of value
				   }
			   });
			return al;
			} 
 
	 public static ArrayList<Map.Entry<String, Double>> sortMapByDValue(HashMap<String, Double> hm){
			ArrayList<Map.Entry<String, Double>> al = new ArrayList<Entry<String, Double>>(hm.entrySet());
			Collections.sort(al,new Comparator<Map.Entry<String,Double>>(){
				   
				   public int compare(Map.Entry<String, Double> o1, Map.Entry<String, Double> o2) {
					   return o2.getValue().compareTo(o1.getValue());// decreasing order order of value
				   }
			   });
			return al;
			} 
	 
	 public static ArrayList<Map.Entry<String, String>> sortMapBySKey(HashMap<String, String> hm){
			ArrayList<Map.Entry<String, String>> al = new ArrayList<Entry<String, String>>(hm.entrySet());
			Collections.sort(al,new Comparator<Map.Entry<String,String>>(){
				   
				   public int compare(Map.Entry<String, String> o1, Map.Entry<String, String> o2) {
					   return o1.getKey().compareTo(o2.getKey());//increasing order of key
				   }
			   });
			return al;
			} 


}
