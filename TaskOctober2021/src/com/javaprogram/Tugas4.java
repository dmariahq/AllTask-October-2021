package com.javaprogram;

import java.util.regex.Pattern;

public class Tugas4 {
	public static void main(String args[]){

	

		// string contains numbers
		String str = "The price of flights from Jakarta to Berlin is 33,537 INR";

		// extract digits only from strings
		Pattern pattern = Pattern.compile("[^0-9]");
		String numberOnly = pattern.matcher(str).replaceAll("");
		

		// print the digitts
		System.out.println(numberOnly);
		}
}
