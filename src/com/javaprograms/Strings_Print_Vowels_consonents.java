package com.javaprograms;

public class Strings_Print_Vowels_consonents {

	public static void main(String[] args) {

		String s="balachandraie";
		String a=s.replaceAll("[^aeiouAEIOU]","");
	    System.out.println("vowels"+a);	
	    String aa=s.replaceAll("[aeiouAEIOU]","");
	    System.out.println("consonents"+aa);	

	}

}
