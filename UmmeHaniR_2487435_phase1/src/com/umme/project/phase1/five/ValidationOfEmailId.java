package com.umme.project.phase1.five;
import java.util.regex.Pattern;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;

	public class ValidationOfEmailId {

	static String [] dataBase= {"abrarahmedsheikh@gmail.com","Hussain@gmail.com","Umme@io.com","Hani@gmail.com","Bebo@gmail.com"
	};


	public static void main(String[] args) {
	System.out.println("<----- Email ID Verfication App-----> ");
	System.out.println("__________________________________________________");
	Scanner inp= new Scanner(System.in);
	String userID;
	while (true){
	System.out.println(" Please Enter your email ID ");
	userID = inp.next();
	System.out.println("__________________________________________________");
	while(theFormat(userID))
	{
	System.out.println("Oops...:(, Please enter valid User Id ");
	System.out.println("__________________________________________________");
	userID = inp.next();
	}

	VerfiyID(userID);


	System.out.println("");

	}

	}

	private static void VerfiyID(String ID)
	{
	boolean accessFlag= false;
	for(String id : dataBase)
	{
	if(ID.equalsIgnoreCase(id))
	{
	accessFlag=true;
	System.out.println("Access Granted to email id : "+ ID );
	System.out.println("__________________________________________________");
	break;
	}

	}

	if(accessFlag==false)
	{
	System.out.println("Oops.. Access Denied "+ ID );
	System.out.println("__________________________________________________");
	}


	}

	private static boolean theFormat(String ID)
	{
	String regex = "^[A-Za-z0-9+_.-]+@(.+)$";

	Pattern pattern = Pattern.compile(regex);
	Matcher matcher = pattern.matcher(ID);

	if(!matcher.matches())
	{
	return true;

	}else
	{
	return false;

	}

	}

	}
