package Zadaci_23_08_2016;

/*(Displaying the prime factors) Write a program that prompts the user to enter
a positive integer and displays all its smallest factors in decreasing order. For
example, if the integer is 120, the smallest factors are displayed as 5, 3, 2, 2,
2. Use the StackOfIntegers class to store the factors (e.g., 2, 2, 2, 3, 5) and
retrieve and display them in reverse order
 * 
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class PrimeFactors {

	public static void main(String[] args) {

		
		int user = takeInput("Enter a positive integer:");
		int temp = user;
		
		// creating object of StackOfIntegers class
		StackOfIntegers stack = new StackOfIntegers();
		int i = 2;
		
		// loop we use to find lowest factors of a number
		while (temp != 1) {
			if (temp % i == 0) {
				
				
				// every time we find new factor we push(add) it to the stack
				stack.push(i);
				temp = temp / i;
			} else {
				i++;
			}
		}
		// printing out the elements of the stack, by using "pop" method that
		// returns last element of the stack
		while (!stack.empty()) {
			System.out.print(stack.pop() + " ");
		}
	}

	// cheking input from the user
	private static int takeInput(String message) {

		Scanner input = new Scanner(System.in);
		
		System.out.println(message);
		
		boolean correct = false;
		
		int userInput = 0;
		
		while (!correct) {
			
			
			try {
				userInput = input.nextInt();
				if (userInput > 1) {
					correct = true;
				} else {
					System.out
							.println("Enter positive integer: ");
				}
			}
			
			catch (InputMismatchException ex) {
				System.out.println(" Invalid input. Enter a number");
				correct = false;
			
				
			} finally {
				input.nextLine();
			}

		}
		return userInput;
	
	}

	}