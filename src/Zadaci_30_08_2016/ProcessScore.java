package Zadaci_30_08_2016;

/*(Process scores in a text file) Suppose that a text file contains an unspecified
 * number of scores separated by blanks. Write a program that prompts the user
 * to enter the file, reads the scores from the file, and displays their total and
 * average
 * 
 */
import java.io.IOException;
import java.util.Scanner;

public class ProcessScore {

	
	public static void main(String[] args) throws IOException {
	
		
		java.util.Scanner in = new java.util.Scanner(System.in);
		System.out.println("Enter file name");
		
		//create file
		java.io.File file = new java.io.File(in.next()+".txt");
		
		//if file does not exist
		if(!file.exists()){
			System.out.println("File does not exist");
		}
		else{
		
	
		java.io.PrintWriter name = new java.io.PrintWriter(file);
		
		
		Scanner input= new Scanner(System.in);
		System.out.println("Enter the number of scores:");


		name.write(input.nextLine());
		
		
		name.close();
		in.close();
		input.close();
	
		//read file
		Scanner input1 = new Scanner(file);
		double sum =0;
		int counter =0;
			
		//calculate the sum of the numbers entered
            while (input1.hasNextDouble()) {
            	double scores=input1.nextDouble();
            	sum+=scores;	
                counter++;
            }
      
    //print sum and average
		System.out.println("Sum is "+ sum);
		System.out.println("Average is "+ (sum/counter));
		
		}
	}
}
