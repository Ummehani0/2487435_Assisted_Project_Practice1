package com.umme.strings.lesson2;

public class WorkingOnStrings {

	   public static void main(String[] args)
		     {
				
				System.out.println("Strings Method");
				String firstString=new String("Java is Fun");
				System.out.println(firstString.length());
			
				String sub=new String("Namaste");
				System.out.println(sub.substring(2));
			
				String string1="java";
				String string2="Hola";
				System.out.println(string1.compareTo(string2));
				
				String string3="";
				System.out.println(string3.isEmpty());
	
				String string4="Hola";
				System.out.println(string1.toLowerCase());

				String string5="Hola";
				String replace=string2.replace('d', 'l');
				System.out.println(replace);
				//equals
				String firstOne="Welcome to Java";
				String y="jaVa FolloWs WoRa";
				System.out.println(firstOne.equals(y));
				System.out.println("\n");
				System.out.println("Creating StringBuffer");
				
				StringBuffer s=new StringBuffer("Welcome to Java!");
				s.append(", Java isplatform independent");
				System.out.println(s);
			
				s.insert(0, 'f');
				System.out.println(s);
			
				StringBuffer sb=new StringBuffer("Back End");
				sb.replace(0, 2, "BeC");
				System.out.println(sb);
		
				sb.delete(0, 1);
				System.out.println(sb);
				
				System.out.println("\n");
				System.out.println("Creating StringBuilder");
				StringBuilder sb1=new StringBuilder("java is");
				sb1.append("fun!");
				System.out.println(sb1);
				System.out.println(sb1.delete(0, 1));
				System.out.println(sb1.insert(1, "Welcome"));
				System.out.println(sb1.reverse());
			
				System.out.println("\n");
				System.out.println("Conversion of Strings to StringBuffer and StringBuilder");
				String str = "java is"; 
				 
				
				 StringBuffer sbr = new StringBuffer(str); 
				 sbr.reverse(); 
				 System.out.println("String to StringBuffer");
				 System.out.println(sbr); 
				 
				 StringBuilder sbl = new StringBuilder(str); 
				 sbl.append("fun"); 
				 System.out.println("String to StringBuilder");
				 System.out.println(sbl); 
     }
}

