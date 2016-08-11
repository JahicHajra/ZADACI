package Zadaci_10_08_2016;

/*Twin prime brojevi su par prostih brojeva koji se razlikuju za 2. 
 * Na primjer, brojevi 3 i 5 su twin primes, brojevi 5 i 7 i 11 i 13 su takoðer twin primes.
 *  Napisati program koji ispisuje sve twin prime brojeve manje od 10000, 10 parova po liniji. 

 * 
 */

public class Twin_Primes {

	public static void main(String[] args) { //main method
		
		java.util.Scanner input = new java.util.Scanner(System.in);
		
		int counter = 0;
		
		boolean correct = true;
		
		while(correct){
			correct = false;
		
			
			try{

		for(int i = 2; i < 10000;i++){//loop that goes from 2 to 10000
			
			if(isPrime(i) && isPrime(i+2)){//check if the number is prime(method call) and count it
				counter++;
				
				System.out.printf("(%d,%d)", i ,i + 2 );//print them as twins
				
				if(counter % 10 ==0){//when counter reaches 10, print them in the next line
					System.out.println();
				}
			}
		}
		}
		
		catch(Exception ex){//catch exception
			System.out.println(" ");
			correct = true;
		}
		
		finally{
			input.nextLine();
		}
	}//end while loop
		input.close();
		
	}//end method
	
	public static boolean isPrime(int number){//method check if the number is prime
		
		for(int divisor = 2; divisor<=number/2;divisor++){ 
			
			if(number % 2!=0){ // if the number is not divisible by 2, it is prime number(return true)
				
				return true;
			}
			
		}
	return false;//else,return false
	}

}
