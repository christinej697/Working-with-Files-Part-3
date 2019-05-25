package hw3;

import java.util.Scanner;
import java.io.PrintWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.FileNotFoundException;
import java.io.File;

public class FilesPart3 {
	
public static void main(String[] args) {
	
		String[] comp1 = new String[5];
		int i = 0;
		String[] comp2 = new String[5];
		int j = 0;
		try {
			PrintWriter out = new PrintWriter(new FileWriter("diff.txt"));
			
			try{
				Scanner sc1 = new Scanner(new File("file1.txt"));
				while (sc1.hasNextLine()) {
					String line = sc1.nextLine();
					comp1[i] = line;
					i+=1;
				}
				sc1.close();
			}catch(FileNotFoundException exc) {
				System.out.println("File not found");
			}
			
			try{
				Scanner sc2 = new Scanner(new File("file2.txt"));
				while (sc2.hasNextLine()) {
					String line = sc2.nextLine();
					comp2[j] = line;
					j+=1;
				}
				sc2.close();
			}catch(FileNotFoundException exc) {
				System.out.println("File not found");
			}
			
			for(int k = 0; comp1.length < k; k++) {
				if(comp1[k].contentEquals(comp2[k]) != true) {
					out.println("Lines " + k + " are different");
				}
			}
			out.close();
		}catch(IOException e){
			System.out.println("There was a problem opening the file for output");
		}
	}

}
