package main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class AssetLoader {
	
	public static ArrayList<String[]> VERB_DEF_LIST = new ArrayList<String[]>(); // .get(0)[0] = number / .get(0)[1] = verb / .get(0)[2] = definition
	
	
	
	public static void loadAssets() throws FileNotFoundException {
		
		//loads files
		InputStream vDF = AssetLoader.class.getResourceAsStream("/text/verb");
		
		//loads files into lists
		fileToList(vDF, VERB_DEF_LIST);
		
		
	}
	
	private static void fileToList(InputStream file, ArrayList<String[]> list) throws FileNotFoundException {
		String[] temp = null;
		Scanner scanner = new Scanner(file);
		scanner.nextLine();
		while(scanner.hasNextLine()) {
			temp = scanner.nextLine().split(",");
			list.add(temp);
		}
		
	}

}
