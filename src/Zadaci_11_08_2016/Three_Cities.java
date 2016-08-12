package Zadaci_11_08_2016;

/*
 * Napisati program koji pita korisnika da unese imena tri grada te ih ispiše u abecednom redu. 
 * Na primjer, ukoliko korisnik unese Chicago, Los Angeles i Atlanta kao gradove, program vraæa Atlanta,
 *  Chicago, Los Angeles.
 */


import java.util.Scanner;


public class Three_Cities {

	public static void main(String[] args) {

		Scanner input=new Scanner(System.in);
		
		
System.out.println("Enter three cities");


boolean correct = true;

while(correct){
	
	correct = false;

	
	try{
		
	
String city1= input.nextLine();//

String city2= input.nextLine();


String city3= input.nextLine();

//Using String temp to define the alpahabetical order

String temp;

if(city1.compareTo(city2)>0){ //comparing city1 and city2  with compareTo method
	temp = city1;
	city1 = city2;
	city2 = temp;
}
		
	if(city2.compareTo(city3)>0){//comparing city2 to city3
		
		temp = city2;
		city2 = city3;
		city3 = temp;
	}
	
	if(city1.compareTo(city2)>0){ //comparing city1 and city2
		
		temp = city1;
		city1 = city2;
		city2 = temp;
		
	}
//print cities in alphabetical order
System.out.println(" Cities in alphabetical order are: " + city1 + " " + city2 + " " +  city3);

}
	
	catch(Exception ex){
		System.out.println(" ");
		correct = true;
	}
	
	finally{
		input.nextLine();
	}

}

	input.close();
	
	}}