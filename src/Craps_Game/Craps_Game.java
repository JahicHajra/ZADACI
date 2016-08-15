package Craps_Game;
/*
 * (Game: craps) Craps is a popular dice game played in casinos. Write a program
to play a variation of the game, as follows:
Roll two dice. Each die has six faces representing values 1, 2, …, and 6, respectively.
Check the sum of the two dice. If the sum is 2, 3, or 12 (called craps), you
lose; if the sum is 7 or 11 (called natural), you win; if the sum is another value
(i.e., 4, 5, 6, 8, 9, or 10), a point is established. Continue to roll the dice until either
a 7 or the same point value is rolled. If 7 is rolled, you lose.
 */

public class Craps_Game {

	public static void main(String[] args) {
		int score= rollDice();//method call
		int newScore=0;
		      
		   //if the sum of two numbers is 2,3 or 12, user loses game 
		 if(score ==2 || score==3 || score==12){
			 
			 System.out.println(" Sorry. You lose.");
		 }
		 //if sum of two numbers is 7 or 11, user wins the game
		 else if(score==7 || score==11){
			 System.out.println(" Congratulation. You win.");
			 
		 }
		 
		 //for all other numbers, user rolls again
		 else{ 
			 
			 System.out.println(" Your score is " + score);
			
			 
			 do{
				 System.out.println(" Roll the dice until 7 or " + score + " is rolled");
				 newScore = rollDice();
				 
			 }
			  //as long as the score is not 7 or as same as point number
			 while(newScore!=7 || newScore==score);
			 
			 //if the new sum is 7, user loses game
			 if(newScore ==7)
				 
				 System.out.println(" Sorry. You lose.");
				 
			 
				 //if the sum is the same as point number,user gains the game
				 else if(newScore==score)
					 System.out.println(" Congratulations. You win.");
					 
					
		 }
			
		 }
	
		 
		 
	public static int rollDice(){//rollDice method
		
		
		//generate two random numbers from 1 - 6
		int dice1 = (int)(Math.random()*6) +1;
		int dice2 = (int)(Math.random()*6) +1;
		
		
		//sum of two numbers
		int result = dice1+dice2;
		//print the numbers
		System.out.println(" You rolled " + dice1 + "+" + dice2 + "=" + result);
		
		
		return result;
	}
		    	 }