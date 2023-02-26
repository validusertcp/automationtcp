package com.javaproject.test;

import java.util.ArrayList;
import java.util.List;

public class ListFruits {

	public static void main(String[] args) {
		List<String> fruits = new ArrayList<String>();
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Grapes");
		fruits.add("Orange");
		System.out.println(fruits);
		for(String x:fruits){
			if(x.equals("Papaya")) {
				System.out.println("Banana is found");
			}
	}
	}
}
