package Zadaci_01_09_2016;

/*(Baby name popularity ranking) The popularity ranking of baby names from
years 2001 to 2010 is downloaded from www.ssa.gov/oact/babynames and stored
in files named babynameranking2001.txt, babynameranking2002.txt, . . . ,
babynameranking2010.txt. Each file contains one thousand lines. Each line
contains a ranking, a boy’s name, number for the boy’s name, a girl’s name,
and number for the girl’s name. ...
 * So, the boy’s name Jacob and girl’s name Isabella are ranked #1 and the boy’s
name Ethan and girl’s name Sophia are ranked #2. 21,875 boys are named
Jacob and 22,731 girls are named Isabella. Write a program that prompts the
user to enter the year, gender, and followed by a name, and displays the ranking
of the name for the yea
 */
import java.util.Scanner;
import java.io.File;
import java.io.IOException;


public class BabyNamePopularityRanking {

	public static void main(String[] args)throws IOException {
		

		Scanner input = new Scanner(System.in);
		
		//year input
		System.out.println( " Enter a year.");
		int year = input.nextInt();
		
		
		//name file
		String fileName = "babyranking " + year + ".txt";
		
		//create file
		File f = new File(fileName);
		
		//gender input
		System.out.println(" Enter a gender.");
		char gender = input.next().charAt(0);
		
		
		//name input
		System.out.println( " Enter a name. ");
		String name = input.nextLine();
		
		//scanner object which reads from the file
		Scanner in = new Scanner(f);
		
		
		boolean exists = false;
		
		
		while(in.hasNextLine()){//while there is more to read
			
			String[]line = in.nextLine().split("\\s+");			
			
			
			//if it is a male name
			if(Character.toUpperCase(gender)=='M' && line[1].equals(name)){
				
				System.out.println(name + " is ranked #" + line[0] + " in year " + year);
				
				exists = true;
				
				break;
				
			}
			
			//if it is a female name
			else if(Character.toUpperCase(gender)=='F' && line[3].equals(name)){
				
				//print name and year
				System.out.println(name + " is ranked #" + line[0] + " in year " + year);
				
				exists = true;
				
				break;
			}
			
		}
		
		//if the name is not ranked
		if(!exists){
			
			System.out.println(name + " is not ranked in year " + year);
		}
	}

}
