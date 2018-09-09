package com.mukesh.regex.ex1;

import java.util.regex.Pattern;

public class Example1 {

	public static void main(String[] args) {
		//Pattern Example
		String text="This is the text to be searched "+"for occurrences of the http:// pattern.";
		String regex=".*http://.*";//(.*)->one or more characters
		boolean matches=Pattern.matches(regex, text);
		System.out.println("matches = "+matches);
	}

}
