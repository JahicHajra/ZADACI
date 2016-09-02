package Zadaci_01_09_2016;
/*(Process large dataset) 
 * A university posts its employees’ salaries at 
 * http:// cs.armstrong.edu/liang/data/Salary.txt. 
 * Each line in the file consists of a faculty member’s first name, last name, rank, and salary 
 * (see Programming Exercise 12.24). 
 * Write a program to display the total salary for assistant professors, associate professors, full professors, and all faculty, respectively, 
 * and display the average salary for assistant professors, associate professors, full professors, and all faculty, respectively. 
 * 
 * 
 */


import java.util.ArrayList;
import java.util.Scanner;
import java.net.URL;
import java.net.MalformedURLException;
public class Process_Large_Dataset {

	public static void main(String[] args) {

		try {
           
			//create url object
			URL url = new URL("http://cs.armstrong.edu/liang/data/Salary.txt"); 
            Scanner in = new Scanner(url.openStream());//create scanner to read url
            
            //array lists for specified professors
            ArrayList <Double> assistant = new ArrayList <>();		
            ArrayList <Double> associateProf = new ArrayList<>();	
            ArrayList <Double> fullProf = new ArrayList <>();
            
            while (in.hasNext()){//while there is more to read
            	in.next();	
                in.next();
                //input professor rank from the file
                 String rank = in.next();	
                
                 if (rank.contains("assistant")) {//if rank is assistant
                     assistant.add(in.nextDouble());	//add salary
                 } 
                 else if (rank.contains("associate")) {	//if rank contains associate
                     associateProf.add(in.nextDouble());	//add salary
                 } 
                 else {
                     fullProf.add(in.nextDouble());	//
                 }
            }
            in.close();
            
            //compute total and average salary for assistant
            double assistantSalary =0;
            int assistantCount=0;
            for (double e: assistant){
            	assistantSalary +=e;
            	assistantCount++;
            }
            System.out.println("Total salary for assistent is "+ assistantSalary);
            System.out.println("Average salary for assistant is "+ ((double)assistantSalary/assistantCount));
            
            //compute total and average salary for associate
            double associateSalary=0;
            int associateCount=0;
            for(double e: associateProf){
            	associateSalary+=e;
            	associateCount++;
            }
            System.out.println("Total salary for associate is "+ associateSalary );
            System.out.println("Average salary for associate is "+ ((double)associateSalary/associateCount));
            
            //compute total and average salary for full professor
            double fullProfessorSalary=0;
            int fullProfessorCount=0;
            for(double e: fullProf){
            	fullProfessorSalary+=e;
            	fullProfessorCount++;
            }
            System.out.println(" Total salary for full professor is "+ fullProfessorSalary );
            System.out.println("Average salary for full professor is "+ 
            ((double)fullProfessorSalary/fullProfessorCount));
            
            //compute total salaries for all professors
            System.out.println("Total salaries for all professors is : "+ 
            fullProfessorSalary+ associateSalary + assistantSalary);
            
            //compute total average for all professors
            System.out.println("Average for all professors is :" 
            + ((double)(fullProfessorSalary+associateSalary+assistantSalary)/(fullProfessorCount
            		+ associateCount+assistantCount)));
        } 
	 catch(MalformedURLException ex){	//catch MalformedURlexception 
			System.out.println(ex.getMessage());
		}
	catch(java.io.IOException ex){		//catch IOException
			System.out.println(ex.getMessage());	}

	}

}
