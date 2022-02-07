package com.umme.phase1.app.onFiles;

	
	import java.util.Scanner;
	import java.util.stream.Collectors;
	import java.io.IOException;
	import java.nio.file.Files;
	import java.util.stream.IntStream;
	import java.nio.file.Paths;
	import java.util.Collections;
	import java.util.Arrays;
	import java.util.ArrayList;
	import java.util.List;
	import java.io.File;
	import java.nio.file.Path;

	public class operationsOnFiles {

	public static void ifMainFolderNotPresentCreateIt(String TheNameOfFolder) {
	File file = new File(TheNameOfFolder);

	// if Main Folder Not Present CreateIt
	if (!file.exists()) {
	file.mkdirs();
	}
	}

	public static void AllFilesShouldDisplay(String path) 
	{
//		All Files Should Display Here Depending On Folder
	operationsOnFiles.ifMainFolderNotPresentCreateIt("main");
	System.out.println("using directory structure, with ascending order displaying all files\n");

	List<String> ListNamesOfFiles = operationsOnFiles.listingFiles(path, 0, new ArrayList<String>());

	System.out.println("with ascending order displaying all files\n");
	Collections.sort(ListNamesOfFiles);

	ListNamesOfFiles.stream().forEach(System.out::println);
	}

	public static List<String> listingFiles(String path, int indentationCount, List<String> fileListNames) {
	File dir = new File(path);
	File[] files = dir.listFiles();
	List<File> listOfFiles = Arrays.asList(files);

	Collections.sort(listOfFiles);

	if (files != null && files.length > 0) {
	for (File file : listOfFiles) {

	System.out.print(" ".repeat(indentationCount * 2));

	if (file.isDirectory()) {
	System.out.println("`-- " + file.getName());

	// Recursively indent and display the files
	fileListNames.add(file.getName());
	listingFiles(file.getAbsolutePath(), indentationCount + 1, fileListNames);
	} 
	else {
	System.out.println("|-- " + file.getName());
	fileListNames.add(file.getName());
	}
	}
	} else {
	System.out.print(" ".repeat(indentationCount * 2));
	System.out.println("|-- The Directory is Empty...");
	}
	System.out.println();
	return fileListNames;
	}

	public static void FileCreating1(String fileToAdd, Scanner sc) {
	operationsOnFiles.ifMainFolderNotPresentCreateIt("main");
	Path pathToFile = Paths.get("./main/" + fileToAdd);
	try {
	Files.createDirectories(pathToFile.getParent());
	Files.createFile(pathToFile);
	System.out.println(fileToAdd + " is successfully created:) ");

	System.out.println("Do you like to add some content to the file? (YES/N0)");
	String choice = sc.next().toLowerCase();

	sc.nextLine();
	if (choice.equals("YES")) {
	System.out.println("\n\nInput content and press enter\n");
	String content = sc.nextLine();
	Files.write(pathToFile, content.getBytes());
	System.out.println("\nContent written to file " + fileToAdd);
	System.out.println("Content can be read using Notepad or Notepad++");
	}
	} 
	catch (IOException e) 
	{
	System.out.println("Sorry, File not created with name" + fileToAdd + ":(" );
	System.out.println(e.getClass().getName());
	}
	}

	public static List<String> fileLocationShouldDisplay(String fileName, String path) {
	List<String> fileListNames = new ArrayList<>();
	operationsOnFiles.fileSearch(path, fileName, fileListNames);

	if (fileListNames.isEmpty()) {
	System.out.println("\n\nSorry:(, File not found as \"" + fileName  +"\" +\n\n");
	} else {
	System.out.println("\n\nFound file at below location(s):");

	List<String> files = IntStream.range(0, fileListNames.size())
	.mapToObj(index -> (index + 1) + ": " + fileListNames.get(index)).collect(Collectors.toList());

	files.forEach(System.out::println);
	}

	return fileListNames;
	}

	public static void fileSearch(String path, String fileName, List<String> fileListNames) {
	File dir = new File(path);
	File[] files = dir.listFiles();
	List<File> filesList = Arrays.asList(files);

	if (files != null && files.length > 0)
	{
	for (File file : filesList) 
	{

	if (file.getName().startsWith(fileName)) 
	{
	fileListNames.add(file.getAbsolutePath());
	}

	if (file.isDirectory()) 
	{
	fileSearch(file.getAbsolutePath(), fileName, fileListNames);
	}
	}
	}
	}

	public static void fileDeletion(String path) {

	File nowFile = new File(path);
	File[] files = nowFile.listFiles();

	if (files != null && files.length > 0) {
	for (File file : files) {

	String fileName = file.getName() + " at " + file.getParent();
	if (file.isDirectory()) {
	fileDeletion(file.getAbsolutePath());
	}

	if (file.delete()) {
	System.out.println(fileName + " deleted successfully");
	} 
	else
	{
	System.out.println("Failed to delete " + fileName);
	}
	}
	}

	String nowFileName = nowFile.getName() + " at " + nowFile.getParent();
	if (nowFile.delete()) {
	System.out.println(nowFileName + " is successfully deleted");
	} 
	else 
	{
	System.out.println("File " + nowFileName + "is failed to delete");
	}
	}
	}

