package com.umme.phase1.app.onFiles;

	import java.util.Scanner;
	import java.util.List;

	public class operationsOnHandlingTheFile {
	public static void welcomeScreenHandling1()
	{
	boolean running = true;
	Scanner sc = new Scanner(System.in);
	do
	{
	try
	{
	optionsForMenu.displayMenu();
	int input = sc.nextInt();

	switch (input) {

	case 1:
	operationsOnFiles.AllFilesShouldDisplay("main");
	break;

	case 2:
	operationsOnHandlingTheFile.optionsforfilemenuHandling();
	break;

	case 3:
	System.out.println("Program exited successfully.");
	running = false;
	sc.close();
	System.exit(0);
	break;

	default:
	System.out.println("Please select a valid option from above.");
	}
	} 
	catch (Exception e) {
	System.out.println(e.getClass().getName());
	welcomeScreenHandling1();
	}
	}
	while (running == true);//terminate here..
	}



	public static void optionsforfilemenuHandling()
	{
	boolean running = true;
	Scanner sc = new Scanner(System.in);
	do 
	{
	try
	{
	optionsForMenu.displayingFileMenueOptions();
	operationsOnFiles.ifMainFolderNotPresentCreateIt("main");

	int input = sc.nextInt();
	switch (input) 
	{
	case 1:

	System.out.println("Enter File nameto be added from \"main\" folder");
	//add a particular file here
	String fileToAdd = sc.next();
	operationsOnFiles.FileCreating1(fileToAdd, sc);
	break;

	case 2:
	System.out.println("Enter File name  to be deleted from \"main\" folder");
	//delete particular file or folder from here
	String fileToDelete = sc.next();

	operationsOnFiles.ifMainFolderNotPresentCreateIt("main");
	List<String> filesToDelete = operationsOnFiles.fileLocationShouldDisplay(fileToDelete, "main");

	String deletionPrompt = "\nSelect index of which file to delete?"
	+ "\n(Enter 0 if you want to delete all elements)";
	System.out.println(deletionPrompt);

	int file12n = sc.nextInt();

	if (file12n != 0) {
	operationsOnFiles.fileDeletion(filesToDelete.get(file12n - 1));
	} 
	else 
	{
	for (String path : filesToDelete) {
	operationsOnFiles.fileDeletion(path);
	}
	}
	break;

	case 3:
	System.out.println("Enter the name of the file to be searched from \"main\" folder");
	//search your file or folder here
	String fileName = sc.next();
	operationsOnFiles.ifMainFolderNotPresentCreateIt("main");
	operationsOnFiles.fileLocationShouldDisplay(fileName, "main");
	break;

	case 4:
	return;//previous menu

	case 5:
	System.out.println("Program exited successfully.");//Exit from program
	running = false;
	sc.close();
	System.exit(0);

	default:
	System.out.println("Please select a valid option from above.");
	}
	} 

	catch (Exception e)
	{
	System.out.println(e.getClass().getName());
	optionsforfilemenuHandling();
	}
	}
	while (running == true);//termination
	}
	}
