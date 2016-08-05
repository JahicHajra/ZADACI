package Zadaci_04_08_2016;
/*Napisati metodu koja printa 100 nasumiènih uppercase karaktera i 100 nasumiènih brojeva, 10 po liniji.

*/

import java.util.Random; //import statement

public class Random_Numbers_Uppercase_Letters {

	public static void main(String[] args) {//main method
		
		

		int counter=0;//declare counter
		int numberPerLines=10;//declare variable number per lines
		
		
	try{//try block
		
for(int i = 0; i < 100;i++){
	int numbers = (int)(Math.random()*100);//generate numbers from to 0-100
	
	System.out.print(numbers + " ");//print numbers
		

counter++;//count numbers
if(counter % numberPerLines==0)//when counter finds 10 numbers
	System.out.println();//print numbers in the next line

}
System.out.println();//make an empty line

Random r = new Random();//create random object
for(int i = 0; i < 100;i++){//set loop 
	char c = (char)(r.nextInt(26) + 'A');	//randomize letters
	System.out.print(c + " "); //print generate letters
	counter++;//count letters 

if(counter % numberPerLines==0)//when counter finds 10 letters
	System.out.println();//print letters in the next line
	
}//end for loop
	}//end try block
catch(Exception ex){ //catch block
	System.out.println("");
}//end catch block
}//end method
}//end class
