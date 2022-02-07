package com.umme.phase1.app.onFiles;

public class mainLock {

		
	public static void main(String[] args) {
			operationsOnFiles.ifMainFolderNotPresentCreateIt("main");
			
			optionsForMenu.welcomeScreenPrinting("LockedMe", "UMME HANI R");
			
			operationsOnHandlingTheFile.welcomeScreenHandling1();
		}
	}