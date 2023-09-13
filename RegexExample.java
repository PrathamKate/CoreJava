package com.tns.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample {

	public static void main(String[] args) {
		//First Way
		Pattern p = Pattern.compile(".s");
		Matcher m=p.matcher("as");//throws error as the string doesn't matches.
		boolean b=m.matches();
		System.out.println(b);
		
		//Second Way
		boolean b2=Pattern.compile(".s").matcher("as").matches();
		System.out.println(b2);
		
		//Third Way
		boolean b3=Pattern.matches(".s","as");
		System.out.println(b3);
		
		
		System.out.println("\nChecking");
		System.out.println(Pattern.matches(".s","as"));
		System.out.println(Pattern.matches(".s","mk"));
		System.out.println(Pattern.matches(".s","mst"));
		System.out.println(Pattern.matches(".s","amms"));
		System.out.println(Pattern.matches(".s","mas"));
		
		
	}

}
