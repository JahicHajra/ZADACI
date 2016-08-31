package Zadaci_30_08_2016;

/** (Count characters, words, and lines in a file) Write a program that will count
 * the number of characters, words, and lines in a file. Words are separated by
 * whitespace characters. The file name should be passed as a command-line
 * argument.
 */
 

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class CountCharactersWordsAndLines {

	public static void main(String[] args) throws IOException  {
		
		//create file
		File file = new File("File.txt");
		file.createNewFile();
		
		//check if the file exists
		if(!file.exists()){
			System.out.println("Fajl ne postoji.");
		}
		else{
		
		//scanner for reading the text from file
		Scanner in  = new Scanner(file);
		
		int line = 0; 			
		int character = 0;		
		int word =0;			
		
		
		//as long as there are characters in lines
		while (in.hasNextLine()){
			in.nextLine();
			line++;		//count them
		}
		in.close(); 
		
		//open scanner to read the character
		in = new Scanner(file);		 
		
		while(in.hasNext()){
			word++;	//count words
			
			character+=in.next().length();	
		}
		in.close();
		
		
		//print
		System.out.println("The file has: ");
		System.out.println("Characters: "+character);
		System.out.println("Lines: "+line);
		System.out.println("Words: "+ word);
	}
	
  }

}
