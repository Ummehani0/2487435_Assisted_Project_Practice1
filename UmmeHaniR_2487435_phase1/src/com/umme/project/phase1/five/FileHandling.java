package com.umme.project.phase1.five;
	import java.util.StringTokenizer;
	import java.util.Scanner;
	import java.io.File;
	import java.io.FileReader;
	import java.io.FileWriter;
	import java.io.IOException;
	import java.io.BufferedReader;
	import java.io.BufferedWriter;
	public class FileHandling {

		public static void main(String[] args) {
		Scanner scanner1 = new Scanner(System.in);
		String choice,likeToContinue = "yes";

		while( likeToContinue.equalsIgnoreCase("yes") ) {
		System.out.println("         <     DATA OF EMPLOYEES     >\n");
		System.out.println("__________________________________________________________________________");
	System.out.println('\n');
		System.out.println("1] You Can Add New Employee Record Here -");
		System.out.println("2] You Can View All Employee Record Here - ");
		System.out.println("3] You Can Delete Any Employee Record Here -");
		System.out.println("4] You Can Search Particular Record Here -");
		System.out.println("5] You Can Update Particular Record Here -\n");
		System.out.println("__________________________________________________________________________");
		
		System.out.println("YOU CAN ENTER YOUR CHOICE NOW :) - ");
//		System.out.println("__________________________________________________________________________");
		choice = scanner1.nextLine();
		System.out.println("__________________________________________________________________________");
		if( choice.equals("1") ) {
		try {
		AddParticularRecord();
		} 
		catch (IOException e) {
		e.printStackTrace();
		}
		} 
		else if( choice.equals("2") ) {
		try 
		{
		displayEveryRecord();
		} 
		catch (IOException e) {
		e.printStackTrace();
		}
		} else if( choice.equals("3") ) {
		try {
		useIdToDeleteRecord();
		} 
		catch (IOException e) {
		e.printStackTrace();
		}
		} else if( choice.equals("4") ) {
		try {
		UseIdToSearchRecord();
		} 
		catch (IOException e) {
		e.printStackTrace();
		}
		} else if( choice.equals("5") ) {
		try {
		updateRecordbyID();
		} 
		catch (IOException e) {
		e.printStackTrace();
		}
		}

		System.out.println("Would you like to continue now......? YES/NO");
		likeToContinue = scanner1.nextLine();

		}

		}

		public static void AddParticularRecord() throws IOException {

		BufferedWriter bw = new BufferedWriter( new FileWriter("records.txt",true) );
		Scanner string = new Scanner(System.in);

		String ID, name, age, addr;

		System.out.print("You can Enter Employee ID now : ");
		ID = string.nextLine();
		System.out.print("You can Enter Employee Name now : ");
		name = string.nextLine();
		System.out.print("You can Enter the Employee Age now : ");
		age = string.nextLine();
		System.out.print("You can Enter the Employee Address now : ");
		addr = string.nextLine();

		bw.write(ID+","+name+","+age+","+addr);
		bw.flush();
		bw.newLine();
		bw.close();

		}
		public static void displayEveryRecord() throws IOException {
		BufferedReader br = new BufferedReader( new FileReader("records.txt") );

		String record;

//		System.out.println("__________________________________________________________________________");
		System.out.println("      : ID Name Age Address :");
		System.out.println("__________________________________________________________________________");

		while( ( record = br.readLine() ) != null ) {

		StringTokenizer stringTokenizer = new StringTokenizer(record,",");

		System.out.println("[ "+stringTokenizer.nextToken()+" "+stringTokenizer.nextToken()+" "+stringTokenizer.nextToken()+" "+stringTokenizer.nextToken()+" ]");

		}

//		System.out.println("[ ]");
		System.out.println("__________________________________________________________________________");
		br.close();//buffer reader

		}



		public static void useIdToDeleteRecord() throws IOException {
		Scanner strInput = new Scanner(System.in);
		String ID, record;


		File tempDB = new File("records_temp.txt");
		File baseDelete = new File("records.txt");


		BufferedReader br = new BufferedReader( new FileReader( baseDelete ) );
		BufferedWriter bw = new BufferedWriter( new FileWriter( tempDB ) );


		System.out.println("You Can Delete Employee Record now -");
		System.out.println("__________________________________________________________________________");
		System.out.println("Please Enter Employee ID Should Be Deleted: ");
		ID = strInput.nextLine();
		System.out.println("__________________________________________________________________________");

		while( ( record = br.readLine() ) != null ) {


		if( record.contains(ID) )
		continue;

		bw.write(record);//buffer writer
		bw.flush();//buffer writer
		bw.newLine();//buffer writer

		}

		br.close();//buffer reader
		bw.close();

		baseDelete.delete();

		tempDB.renameTo(baseDelete);

		}


		public static void UseIdToSearchRecord() throws IOException {
		String ID,record;
		Scanner strInput = new Scanner(System.in);

		BufferedReader br = new BufferedReader( new FileReader("records.txt") );

		System.out.println("You Can Search Employee Record now -\n");
		System.out.println("__________________________________________________________________________");

		System.out.println("You Can Enter the Employee ID now -\n ");
		ID = strInput.nextLine();

		System.out.println("__________________________________________________________________________");
		System.out.println("| ID Name Age Address |");
		System.out.println("__________________________________________________________________________");

		while( ( record = br.readLine() ) != null ) {

		StringTokenizer st = new StringTokenizer(record,",");
		if( record.contains(ID) ) {
		System.out.println("| "+st.nextToken()+" "+st.nextToken()+" "+st.nextToken()+" "+st.nextToken()+" |");
		}



		}

		System.out.println("| |");
		System.out.println("__________________________________________________________");

		br.close();



		}


		public static void updateRecordbyID() throws IOException {
		String newName, newAge, newAddr, firstdata, ID,secondData;

		File db = new File("records.txt");
		File tempDB = new File("records_temp.txt");

		BufferedReader bufferreader = new BufferedReader( new FileReader(db) );
		BufferedWriter bw = new BufferedWriter( new FileWriter(tempDB) );

		Scanner strInput = new Scanner(System.in);

		System.out.println("You Can Update Employee Record here -\n");
		/****/
		System.out.println("You Can Enter Employee ID now - ");
		ID = strInput.nextLine();
		System.out.println(" ------------------------------------------------------------- ");
		System.out.println("| ID Name Age Address |");
		System.out.println(" ------------------------------------------------------------- ");

		while( ( firstdata = bufferreader.readLine() ) != null ) {

		StringTokenizer st = new StringTokenizer(firstdata,",");
		if( firstdata.contains(ID) ) {
		System.out.println("| "+st.nextToken()+" "+st.nextToken()+" "+st.nextToken()+" "+st.nextToken()+" |");
		}

		}
		System.out.println("| |");
		System.out.println(" ------------------------------------------------------------- ");

		bufferreader.close();
		/****/
		System.out.println("You Can Enter new Name now - ");
		newName = strInput.nextLine();
		System.out.println("You Can Enter the new Age now - ");
		newAge = strInput.nextLine();
		System.out.println("You Can Enter the new Address now -");
		newAddr = strInput.nextLine();

		BufferedReader bufferreader1 = new BufferedReader( new FileReader(db) );

		while( (secondData = bufferreader1.readLine() ) != null ) {
		if(secondData.contains(ID)) {
		bw.write(ID+","+newName+","+newAge+","+newAddr);
		} else {

		bw.write(secondData);
		}
		bw.flush();
		bw.newLine();
		}

		bw.close();
		bufferreader.close();
		db.delete();
		boolean Accomplishment = tempDB.renameTo(db);
		System.out.println(Accomplishment);

		}


		}

