package Zadaci_23_08_2016;
/*(Displaying the prime numbers) Write a program that displays all the prime
numbers less than 120 in decreasing order. Use the StackOfIntegers class
to store the prime numbers (e.g., 2, 3, 5, ...) and retrieve and display them in
reverse order
 * 
 * 
 */
public class PrimeNumbers {

	public static void main(String[] args) {

		
		StackOfIntegers stack = new StackOfIntegers();
		// loop that check prime numbers
		for (int i = 0; i <= 120; i++) {
			
			// if the number's not 0 or 1 we push(add) it to stack
			if (isPrime(i) && (i != 1 && i != 0))
				stack.push(i);

		}
		System.out.println("Prime numbers up to 120 in decreasing order are: ");
		// printing out elements of the stack "last in first out"
		while (!stack.empty())
			System.out.print(stack.pop() + " ");

	}

	//isPrime method
	public static boolean isPrime(int n) {

		//checking if the number is prime
		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0)
				return false;
		}
		return true;

	}


	}