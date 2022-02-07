package com.umme.phase1.app.onFiles;

public class optionsForMenu {
	
		public static void welcomeScreenPrinting(String appName, String developerName) {
			String companyDetails = String.format("\n"
					+ "<---------- Welcome to %s.com.---------->\n" + "This application was developed by %s"
					+ "\n", appName, developerName + ":)");
			System.out.println("__________________________________________________________________________________________________");
			String appFunction = "This Application is used for - \n\n"
					+ "1]Retrieve all file names in the \"main\" folder\n"
					+ "2]Search file/ add files/or delete files in \"main\" folder.\n\n"
					+ "Please provide valid file name to perform search & delete operation.";
			System.out.println(companyDetails);
			System.out.println("__________________________________________________________________________________________________");
			System.out.println(appFunction);
			System.out.println("__________________________________________________________________________________________________");
		}

		public static void displayMenu() {
			String menu = "\nSelect any option number from below and press Enter\n\n"
					+ "1] Retrieve all files inside \"main\" folder\n" + "2] Display menu for File operations\n"
					+ "3] Exit program";
			System.out.println(menu);
			System.out.println("__________________________________________________________________________________________________");
			
		}

		public static void displayingFileMenueOptions() {
			String fileMenu = "\n\nSelect any option number from below and press Enter\n\n"
					+ "1] Add a file to \"main\" folder\n" + "2] Delete a file from \"main\" folder\n"
					+ "3] Search for a file from \"main\" folder\n" + "4] Show Previous Menu\n" + "5] Exit program\n";

			System.out.println(fileMenu);
			System.out.println("__________________________________________________________________________________________________");
		}

	}


