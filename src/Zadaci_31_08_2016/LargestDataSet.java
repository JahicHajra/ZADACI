package Zadaci_31_08_2016;

/**  (Create large dataset) 
 *  Create a data file with 1,000 lines. 
 *  Each line in the file consists of a faculty member’s first name, last name, rank, and salary. 
 *  The faculty member’s first name and last name for the ith line are FirstNamei and LastNamei. 
 *  The rank is randomly generated as assistant, associate, and full. 
 *  The salary is randomly generated as a number with two digits after the decimal point. 
 *  The salary for an assistant professor should be in the range from 50,000 to 80,000, 
 *  for associate professor from 60,000 to 110,000, and for full professor from 75,000 to 130,000. 
 *  Save the file in Salary.txt. 
 *  Here are some sample data: 
 *  FirstName1 LastName1 assistant 60055.95 FirstName2 LastName2 associate 81112.45 . . . 
 *  FirstName1000 LastName1000 full 92255.21 
 */
 

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
public class LargestDataSet {

	public static void main(String[] args)throws IOException {

File f= new File ("Salary.txt");
		
		//if file does not exist, program ends
		if (!f.exists()){
			System.out.println("File does not exist.");
		}
		else{
			PrintWriter write = new PrintWriter(f);
			
			
			for (int i=1; i<1001; i++){
				
				write.println("FirstName"+ i + ", LastName"+ i + rankAndSalary() );
			
			}
			write.close();
			System.out.println("Finish.");
		}
	}
	
	public static String  rankAndSalary(){
		
		String str="";
		
		//return salary of a specific professor
		switch( 1 + (int)(Math.random()*3)){
			
			case 1: str= ", assistant " + salary(1);
				break;
		
			case 2: str= ", associate "+ salary(2);
				break;
			
			case 3: str= ", full profesor "+ salary(3);
				break;
		}
		return str;
	
	}
//salary method	
	public static String salary(int i){
		
		
		double salary=0;
		
		//return the salary of a specific professor
		switch(i){
			//assistant professor should be in the range from 50.000 to 80.000,
			case 1: salary = 50000 + (Math.random()*30001);
				break;

			//associate professor from 60,000 to 110,000,
			case 2: salary =60000 + (Math.random()*50001);
			break;
		
			//full professor from 75,000 to 130,000
			case 3: salary=75000 +(Math.random()*55001);
			break;
		}
		
		//return salary with two decimal places
		return String.format("%.2f", salary);	
	}

}
