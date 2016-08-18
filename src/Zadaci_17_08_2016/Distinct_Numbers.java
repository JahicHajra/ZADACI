package Zadaci_17_08_2016;

/*
 * Napisati program koji uèitava 10 brojeva te ispisuje koilko je jedinstvenih brojeva unijeto te sve jedinstvene 
 * brojeve koji su unijeti, razmaknute jednim spaceom. Ukoliko se neki broj pojavljuje više puta, broj treba ispisati
 *  samo jednom.
 */

import java.util.ArrayList;
import java.util.Scanner;

public class Distinct_Numbers {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		//create an arrayList
		ArrayList<Integer> array = new ArrayList<>();
		
		//print numbers starting from 1 
		for(int i=0; i<10; i++){ 
		System.out.printf("%d. number: ", i+1);
	
				
				
		//input ten numbers
		int number = input.nextInt();
		
		//if array does not contain the number, add it to the list
		if(array.contains(number)==false)
			array.add(number);	
		}
		
		//print how many numbers in the array list are
	System.out.printf("There are  %d distinct numbers:\n",array.size());
	
	//print distinct numbers
	for(int i=0; i<array.size(); i++)
		System.out.println(array.get(i));
	
	input.close();
		}
	}


	
