package Project_2;

	/* ...Write a program that prompts the user to enter a credit card number as a long integer
	  
	  Display whether the number is valid or invalid...
	 
	 */

	import java.util.InputMismatchException;
	import java.util.Scanner;
	
		
		
public class Credit_Card {		
		
	static Scanner input = new Scanner(System.in);//create scanner as static
		
	public static void main(String[] args) {//main method
			
			//prompt user to enter the number of credi card
			System.out.println(" Enter your credit card as a long integer");
			
			boolean correct = true;
			
			while(correct){
				
				correct = false;
			
				try{
					
				
			//number input
			long number = input.nextLong();
			
			//method call
			if(isValid(number)){
				
				System.out.println(" Number is valid " + number );
			}
			else
				
				System.out.println(" Invalid number " + number);
			}
			catch(InputMismatchException ex){
				
				System.out.println(" Invalid input. Enter an integer.");
				
				correct = true;
			}
				finally{
					input.nextLine();
				}
			}}
		
		public static boolean isValid(long number){//isValid method
				
		//return false if number is less than 13 and greater than 16		
		if((getSize(number)<13 || (getSize(number)>16))) {
				
				
					return false;
					
		}
		
		//create an array for the numbers of credit card
					int[]array = getDigit(number);
					
					
					//if sum of even place numbers and sum of odd place are divisible by 10,credit card nuber is valid
					if((sumOfDoubleEvenPlace(array) + sumOfDoubleOddPlace(array)) %10==0){
						
						return true;
					}
					
					else{
		
				return false;
				
			
		
					}
		}
		
		
		public static int sumOfDoubleEvenPlace(int[]n){
			
			
		int sum = 0;
		
		int num = 0;
		
		//each number of even place is multiplied by two
		for(int i = 0;i<n.length;i+=2){
			
			num = n[i]*2;
			
			
			//add up the first and second digit if it is two-digit number
			if(num>=10){
				
				sum+=((num/10)+(num%10));
			}
			else{
				sum+=num;
		}}
		
		return sum;
		
		}
	//getDigit method
		public static int[]getDigit(long number){
			
			
			int[]getDigit = new int[16];//create an array for credit card number
			
			
			for(int i = 15;i>=0;i--){
				
				int digit = (int)(number%10);
				
				getDigit[i] = digit;
				
				number /=10;
			
			}
			
			return getDigit;
		}
		//sumOfDoubleOddPlace method
		public static int sumOfDoubleOddPlace(int[]n){
			
			int sum =0;
		
			//add up odd place numbers,starting from the second digit on the left
			for(int i = 1;i<n.length;i+=2){
				
				sum+=n[i];
			}
			
			return sum;
			
			
		}
				
		//getSize method 
		public static int getSize(long number){
			
			
			int count = 0;
			
			while(number>0){
				
				number/=10;
				
				count++;//count the numbers of the credit card
			}
			
			return count;
			
			
		}
		
		public static int getPrefix(int[]n){
			
		String s = n[0]+""+n[1]+"";//get the first two numbers of the credit card
				
				
				int getPrefix = Integer.parseInt(s);
				
				return getPrefix;
			
		}}
