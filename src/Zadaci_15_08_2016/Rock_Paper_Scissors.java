package Zadaci_15_08_2016;


/*Napisati program koji igra sa protivnikom rock-paper-scissors. (papir-bunar-makaze ili tako nekako po naški)
 *  Program nasumièno generiše brojeve 0, 1 i 2 koji predstavljaju papir, bunar i makaze. Program pita korisnika
 *   da unese 0, 1 ili 2 te mu ispisuje poruku da li je korisnik pobijedio, da li je raèunar pobijedio ili je bilo 
 *   neriješeno.
 * 
 */

import java.util.Scanner;
public class Rock_Paper_Scissors {

	public static void main(String[] args) {

		
		Scanner in = new Scanner(System.in);
		
		
		System.out.println( " Enter 0 for rock, 1 for paper, 2 for scissors.");
		//user input
		int userInput = in.nextInt();
		
		//switch random number for computer's input
		switch((int)(Math.random()*3)){
			case 0:
				rock(userInput);
				break;
		
			case 1:
				paper(userInput);
				break;
			
			case 2:
				scissors(userInput);
				break;
		}
}

	
public static void rock (int player){
	
	//we switch statements if the computer is rock
		switch(player){
			case 0:
				System.out.println("Computer is rock. You are rock. Draw");
				break;
			case 1:
				System.out.println(" Comp is rock. You are paper. You win");
					break;
			case 2:
				System.out.println("Comp is rock. Yuu are scissors. You lose.");
					break;
			
			
		}
	}
	
public static void paper (int player){

	
	//we switch statements if the computer is paper
	switch(player){
		case 0: 
			System.out.println("Computer is paper. You are rock. You lose.");
				break;
		case 1:
			System.out.println("Computer is paper. You are paper. Draw");
				break;
		case 2:
			System.out.println("Computer is paper. You are scissors. You win");
				break;
			
	}		
}

public static void scissors (int player){

	
	//we switch statements if computer is scissors
	switch(player){
		case 0:
			
		System.out.println("Computer is scissors. You are rock. You win.");
			break;
			
		case 1:
			
			System.out.println(" Computer is scissors. You are paper. You lose.");
 				break;
		case 2:
			
			System.out.println("Computer is scissors. You are scissors. Draw");
				break;
	}}
}