package Zadaci_31_08_2016;
/*(Count words) Write a program that counts the number of words in President
Abraham Lincoln’s Gettysburg address from http://cs.armstrong.edu/liang/data/
Lincoln.txt
 * 
 */

import java.util.Scanner;

public class CountWords {

	public static void main(String[] args) {

		
		try{
			
			//create URL object
			java.net.URL url = new java.net.URL("http://cs.armstrong.edu/liang/data/Lincoln.txt");
			
			int wordCount = 0;
			Scanner input = new Scanner(url.openStream()); // create scanner object
			
			while(input.hasNext()){ //more to read?
				
				
				String line = input.nextLine(); //read a line
				wordCount+=line.split(" ").length; //count words
			}
			//print word count
			System.out.println(" The file size is " + wordCount + " words");
			
		}
		//catch MalformedURLException
		catch(java.net.MalformedURLException ex){
			System.out.println(" Invalid URL");
		}
		
		catch(java.io.IOException ex){
			System.out.println(" No such file");
		}
	
    }

}
