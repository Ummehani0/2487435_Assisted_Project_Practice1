package com.umme.throw1.lesson3;
import java.io.*;
public class usingThrows2 {
	public static void findFile() throws IOException {
	    // code that may produce IOException
	    File newFile=new File("test.txt");
	    FileInputStream stream=new FileInputStream(newFile);
	  }

	  public static void main(String[] args) {
	    try{
	      findFile();
	    } catch(IOException e){
	      System.out.println(e);
	    }
	  }
	}
