package Zadaci_30_08_2016;
/* * (Remove text) Write a program that removes all the occurrences of a specified
 * string from a text file. For example, invoking
 * java Exercise12_11 John filename
 * removes the string John from the specified file. Your program should get the
 * arguments from the command line.
 */


import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class RemoveText {
	
	public static void main(String[] args) throws IOException {
		
		
		File file = new File("RemoveText.txt");
		
		if (!file.exists()){
			System.out.println("File does not exist");
		}
		else{
			
			//create another file
			File tempFile = File.createTempFile("file", ".txt", file.getParentFile());
		
			System.out.println("Enter a string you want to remove ");
			Scanner in = new Scanner(System.in);
		
		
			//user input for the word to be removed
			String delete = in.nextLine();	       
			in.close();
		
			//create scanner for reading the datas in file
			Scanner reader = new Scanner(file);
			
			
			//create PrintWiter for text input in another file
			PrintWriter writer = new PrintWriter(tempFile);
		
			int counter =0;							
			
			while(reader.hasNextLine()){
				
				//read the line
				String str = reader.nextLine();		
				String check = str.concat("");
				
				//replace the word
				str = str.replace(delete, "");		
				
				if(str.length() != check.length()){
					counter++;
				}
				
				//write the replaced word
				writer.println(str);				
			}
	
			reader.close();
			writer.close();
		
			//previous file deleted
			file.delete();							
		
			//rename new file 
			tempFile.renameTo(file);	
			
			//if there is no string in the file
			if(counter > 0){
				System.out.println("Izvrseno.\nProvjerite tekstualnu datoteku");
			}
			else{
				System.out.println("Unijeti string ne postoji u tekstualnoj datoteci");
			}
	
		}}}
	