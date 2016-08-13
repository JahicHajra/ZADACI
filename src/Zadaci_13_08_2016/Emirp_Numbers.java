package Zadaci_13_08_2016;

/* Emirp brojevi (prime unazad) je nepalindromski prosti broj koji je prosti broj i kada ispišemo naopako. 
 * Na primjer, broj 17 i broj 71 su prosti brojevi tako da su brojevi i 17 i 71 emirp brojevi. 
 * Napisati program koji ispisuje prvih 100 emirp brojeva, 10 brojeva po liniji. 
 * 
 */

public class Emirp_Numbers {

	public static void main(String[] args) {

		int counter =0; 
		
		int i=2;		
						
		
		//as long as the counter reaches 100
		while (counter <100){
			
			//method call;print emirp and count it
			if(isEmirp(i)==true){
				System.out.print(i + " ");
				counter++;
				
				//when counter reaches 10,print in the next line
				if (counter%10==0){
					System.out.println();
				}
			}
			
			i++;//check next number
		}
		
		
	}
		
	public static boolean isEmirp(int n){//isEmirp method
		
		
		int rev = reverse(n);
		
		// return false if n is equal to number in reverse
		if (rev==n){
			return false;
		}
       
		//return true if it is reverse number and prime
        if (isPrime(rev) && isPrime(n)){
        	return true;
        }
        
        return false;
        
	}
	
	public static int reverse(int n){//reverse method
	
	
		int rev = 0;
		
		int number =0;
    
		//reverse the number and returns it
		while (n != 0) {
			number = n % 10;				
			rev = rev * 10 + number;
			n = n / 10;				
			}
	
		return rev;  
	}

		
	// isPrime method
	public static boolean isPrime(int n){	
	
		/*for loop that starts from 2 because 1 is not prime;if the number is divisible with any other number but
		 * 1 or itself, return false
		 */
			
		for(int i = 2; i <n; i++){
				if(n % i == 0) {
					return false;
				}
			}
			return true;//return true
		}
				
}