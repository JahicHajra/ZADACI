package Zadaci_01_09_2016;
/*  (Occurrences of each letter) 
 *  Write a program that prompts the user to enter a file name and displays the occurrences of each letter 
 *  in the file. 
 *  Letters are case-insensitive.
 * 
 */
import java.util.Scanner;
import java.io.File;
import java.io.IOException;
public class OccurrenceOfEachLetter {

	public static void main(String[] args)throws IOException {

		
		Scanner input = new Scanner(System.in);
		
		System.out.println(" Enter a file name");
	
		//create file
	File f = new File(input.nextLine() + ".txt");
	
	int[] countLetter = new int[26]; 
	
	Scanner in = new Scanner(f);	

	while (in.hasNextLine()) {	//while there is more to read
		
		String s = (input.next()).toUpperCase();	
		countLetters(countLetter, s);		//method invocation	
	}
input.close();

//method invocation
print(countLetter);
	
	
	}
		
public static void countLetters(int[]count, String s){
	
	//count characters
	for(int i = 0; i < s.length();i++){
		
		if(Character.isLetter(s.charAt(i))){
			
			count[(int)(s.charAt(i)-65)]++;
		}
		
	}
	}
	public static void print (int [] array){
		for (int i = 0; i < array.length; i++) {
			
			//print characters
			System.out.println("Broj slova " + (char)(65 + i) + " je: " + array[i]);
		}
}
}
