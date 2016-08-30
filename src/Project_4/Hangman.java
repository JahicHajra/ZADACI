package Project_4;
import java.util.Scanner;
import java.util.Arrays;

public class Hangman {
	
	 public static void main(String[] args) {
	        String[] words = {"writer", "appointment", "tenderize", "school", "entertain",
	        		"schedule", "associate", "perfection"};
	        // generate random word from the array
	        int randomWordNumber = (int) (Math.random() * words.length);
	        
	        // Create an array for entered letters
	        char[] enteredLetters = new char[words[randomWordNumber].length()];
	        
	        //set the counter for guesses
	        int triesCount = 0;
	        boolean wordIsGuessed = false;
	        
	        
	        /*do enter letters as long as the word is guessed:
	         * switch entered letters as entering the word
	         * return 0 for entering the letter that is not in the word;triesCount++
	         * return 1 for entering the letter for the first time and increment the counter
	         * return 2 for entering the letter for the second time
	         * return 3 for guessing the word
	         * print the word and number of misses
	         */
	        
	        do {
	      
	        switch (enterLetter(words[randomWordNumber], enteredLetters)) {
	            case 0:
	                triesCount++;
	                break;
	            case 1:
	                triesCount++;
	                break;
	            case 2:
	                break;
	            case 3:
	                wordIsGuessed = true;
	                break;
	        }
	        } while (! wordIsGuessed);
	        System.out.println("\nThe word is " + words[randomWordNumber] +
	            " You missed " + (triesCount -findEmptyPosition(enteredLetters)) +
	            " time(s)");
	    }

	 
	 //enterLetter method
	    public static int enterLetter(String word, char[] enteredLetters)    {
	    	
	    	
	        System.out.print("Enter a letter in word ");
	        // If-clause is true if no asterisks were printed so
	        // word is successfully guessed
	        if (! printWord(word, enteredLetters))
	            return 3;
	        System.out.print(" > ");
	       
	        Scanner input = new Scanner(System.in);
	        
	        int emptyPosition = findEmptyPosition(enteredLetters);
	        
	        char userInput = input.nextLine().charAt(0);
	        
	        //check if the letter is already in the word
	        if (inEnteredLetters(userInput, enteredLetters)) {
	            System.out.println(userInput + " is already in the word");
	            return 2;
	        }
	        //check if the entered letter is in the word, if it is,place it in the empty position
	        else if (word.contains(String.valueOf(userInput))) {
	            enteredLetters[emptyPosition] = userInput;
	            return 1;
	        }
	        
	
	        else {
	            System.out.println(userInput + " is not in the word");
	            return 0;
	            }
	    }

	    /* Print word with asterisks for hidden letters, returns true if
	    asterisks were printed, otherwise return false */
	    public static boolean printWord(String word, char[] enteredLetters) {
	    	
	    	
	        // Iterate through all letters in word
	        boolean asteriskPrinted = false;
	        
	        for (int i = 0; i < word.length(); i++) {
	            char letter = word.charAt(i);
	            // Check if letter already have been entered by user before
	            if (inEnteredLetters(letter, enteredLetters))
	                System.out.print(letter); // If yes - print it
	            else {
	                System.out.print('*');
	                asteriskPrinted = true;
	            }
	        }
	        return asteriskPrinted;
	    }

	    /* Check if letter is in enteredLetters array */
	    public static boolean inEnteredLetters(char letter, char[] enteredLetters) {
	        return new String(enteredLetters).contains(String.valueOf(letter));
	    }

	    /* Find first empty position in array of entered letters (one with code \u0000) */
	    public static int findEmptyPosition(char[] enteredLetters) {
	        int i = 0;
	        while (enteredLetters[i] != '\u0000') i++;
	        return i;
	    }
	}


