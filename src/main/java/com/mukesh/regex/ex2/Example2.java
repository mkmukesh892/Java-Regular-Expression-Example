package com.mukesh.regex.ex2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Example2 {

	public static void main(String[] args) {
		//Matcher Example
		System.out.println("............match example...............");
		String text="This is the text which is to be searched "+" for occurrences of the word 'is'.";
		String regex="is";
		Pattern pattern=Pattern.compile(regex);
		Matcher matcher=pattern.matcher(text);
		int count=0;
		while(matcher.find()) {
			count++;
			System.out.println("found: "+count+" : "+matcher.start()+" - "+matcher.end());
		}
		//Beginning of Line (or String)
		System.out.println("........Beginning of line............");
		String text1="Line 1\nLine2\nLine3";
		Pattern pattern2=Pattern.compile("^");
		Matcher matcher2=pattern2.matcher(text1);
		while(matcher2.find()) {
			System.out.println("found match at: "+matcher2.start()+" to "+matcher2.end());
		}
		String text2 = "http://jenkov.com?http://";

		Pattern pattern3 = Pattern.compile("^http://");
		Matcher matcher3 = pattern3.matcher(text2);

		while(matcher3.find()){
		    System.out.println("Found match at: "  + matcher3.start() + " to " + matcher3.end());
		}
		//End of Line
		System.out.println("......End of Line.........");
		String text3 = "http://jenkov.com";

		Pattern pattern4 = Pattern.compile(".com$");
		Matcher matcher4 = pattern4.matcher(text3);

		while(matcher4.find()){
		    System.out.println("Found match at: "  + matcher4.start() + " to " + matcher4.end());
		}
		//word Boundaries
		System.out.println("----word Boundaries.......");
		String text4 = "Mary had a little lamb";

		Pattern pattern5 = Pattern.compile("\\b");
		Matcher matcher5 = pattern5.matcher(text4);

		while(matcher5.find()){
		    System.out.println("Found match at: "  + matcher5.start() + " to " + matcher5.end());
		}
	}

}
