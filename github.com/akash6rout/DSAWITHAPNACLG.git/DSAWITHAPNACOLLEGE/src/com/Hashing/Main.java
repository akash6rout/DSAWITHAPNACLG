package com.Hashing;

import java.util.HashMap;
import java.util.Set;

public class Main {
	
	public static void main(String[] args) {
		HashMap<String, Integer> hm=new HashMap<>();
		hm.put("India", 100);
		hm.put("China", 150);
		hm.put("Italy", 100);
		hm.put("Taiwan", 50);
		
		//Iterate
		Set<String> keys=hm.keySet();
		System.out.println(keys);//prints only key
		
		for(String k:keys) {
			System.out.println("Key="+k+",value="+hm.get(k));
		}
		}

}
