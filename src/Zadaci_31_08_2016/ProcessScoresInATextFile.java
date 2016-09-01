package Zadaci_31_08_2016;
/** (Process scores in a text file on the Web) Suppose that the text file on the
 * Web http://cs.armstrong.edu/liang/data/Scores.txt contains an unspecified number
 * of scores. Write a program that reads the scores from the file and displays their
 * total and average. Scores are separated by blanks
 * 
 */
import java.util.Scanner;
public class ProcessScoresInATextFile {

	public static void main(String[] args) {

		try{
			
		//create url
		java.net.URL url = new java.net.URL("http://cs.armstrong.edu/liang/data/Scores.txt ");
		
		int count = 0;
		
		Scanner input = new Scanner(url.openStream());//create scanner object
		int sum = 0;
		
		while(input.hasNext()){ //while there is more to read
			
			sum+=input.nextDouble(); // add scores to the sum
			
			count++;//count the scores
		
		}
		input.close();
		
		//compute average by dividing sum with count
		double average = sum/count;
		
		//print score and average
		System.out.println( " Total score is " + sum);
		System.out.printf(" Average is " + average );
		
		
	}
		//catch MalformedURLException 
		catch(java.net.MalformedURLException ex){
			
			System.out.println(" Invalid URL");
		}
		//catch IOExeption
		catch(java.io.IOException ex){
			
			System.out.println(" No such file.");
		}

}}
