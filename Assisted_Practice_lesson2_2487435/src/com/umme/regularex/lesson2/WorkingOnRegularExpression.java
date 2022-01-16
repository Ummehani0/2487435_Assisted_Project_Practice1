package com.umme.regularex.lesson2;
import java.util.regex.*;
public class WorkingOnRegularExpression {
	public static void main(String[] args) 
	{
	String pattern = "[a-z]+";
	String check = "Regular Expressions";
	Pattern pattern1 = Pattern.compile(pattern);
	Matcher matcher = pattern1.matcher(check);
	while (matcher.find())
	 System.out.println( check.substring( matcher.start(), matcher.end() ) );
	}
	}