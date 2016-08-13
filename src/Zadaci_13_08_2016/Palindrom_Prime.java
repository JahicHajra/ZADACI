package Zadaci_13_08_2016;

/*Palindrome prime je prosti broj koji je takoðer i palindrom. Na primjer, 131 je palindrome prime,
 *  kao i brojevi 313 i 757. Napisati program koji ispisuje prvih 100 palindrome prime brojeva, 
 *  10 brojeva po liniji. 
 * 
 */

public class Palindrom_Prime {

	public static void main(String[] args) {

		int counter = 0;
		int i = 2;
		
		
		//while counter is less than 100
		while(counter<100){
			if(isPrime(i)==true && isPalindrom(i)==true){//method call
				System.out.print(i + " ");//print number
				counter++;//counter increment
				
				if(counter % 10 ==0){//when counter reaches 10 numbers,print the numbers in the next line
					System.out.println();
				}
			}
			i++;//check the next number
		}
		
	}
	public static boolean isPrime(int n){//isPrime method
		
		
		//for loop that starts from 2, because 1 is not prime
		for(int i = 2;i<n;i++){  
			if(n%i==0){//if divisor is divisible with number,return false
				
				return false;
			}
		}
		return true;//return true if the number is not divisible with any number but 1 and itself
	}
		
		
	
	public static boolean isPalindrom(int number){//isPalindrom method
		
		if(reverseNumber(number)==number){ //if it is the same original and reverse,return true
			return true;
			
		}
		return false;//else return false
		
	}
	
	public static int reverseNumber(int num){//reverseNumber method
		
		int n =0;
		
		//for loop that checks the number and then reverse it
		for(int i =num;i !=0;i/=10){
			
			n=n * 10 + i % 10;
		}
		return n;//return reverse number
	}

}
