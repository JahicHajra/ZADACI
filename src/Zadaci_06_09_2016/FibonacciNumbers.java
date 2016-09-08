package Zadaci_06_09_2016;
/*(Fibonacci numbers) Rewrite the fib method in Listing 18.2 using iterations.
Hint: To compute fib(n) without recursion, you need to obtain fib(n - 2)
and fib(n - 1) first. Let f0 and f1 denote the two previous Fibonacci
 *numbers. The current Fibonacci number would then be f0 + f1 
 */
import java.util.Scanner;
public class FibonacciNumbers {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.println(" Enter an index for Fibonacci number");
		
		int index = input.nextInt();
		
		System.out.println(" Fibonacci number at index " + index + " is " + fib(index));//method invocation
		
	}
	
	//method for finding the number with index user entered
	public static long fib(long index){
		
		//base case
		if(index == 1 || index==0) 
			return index;
			
		
		else
		return fib(index-2)+ fib(index-1);
	
}}
