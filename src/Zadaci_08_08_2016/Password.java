package Zadaci_08_08_2016;

/*Neke web stranice forsiraju odreðena pravila za passworde. Napisati metodu koja provjerava da li je unijeti 
 * string validan password. Pravila da bi password bio validan su sljedeæa: 1. Password mora biti saèinjen od 
 * najmanje 8 karaktera. 2. Password smije da se sastoji samo od slova i brojeva. 3. Password mora sadržati najmanje
 *  2 broja. Napisati program koji pita korisnika da unese password te mu ispisuje "password je validan"
 *   ukoliko su sva pravila ispoštovana ili "password nije validan" ukoliko pravila nisu ispoštovana.
 */


import java.util.Scanner; //scanner import


public class Password {

	public static void main(String[] args) {//main method

		
		Scanner input = new Scanner(System.in); //scanner created
		
System.out.println("Enter a password");
	
		
	
String password = input.nextLine();
	
if(validPassword(password)){//method call
	
	System.out.println(" Password is valid " + password);
}
else{
	
	System.out.println(" Invalid password " + password);

	}
input.close();
	}
	
	
	
	
		
		
		public static boolean validPassword(String password) {
			   
			boolean validPassword = true;
	
			
		    if (password.length() <= 8) { //check if there is less than 8 characters in password
		        validPassword = false; 
		    	
		    } 
		    
		    else {
		        int counter = 0;
		       
		        for (int i = 0; i < password.length(); i++) {
		           
		        	//check if there are letters and digits in password
		        	if (Character.isDigit(password.charAt(i)) || Character.isLetter(password.charAt(i))) {
		              
		        		//if there are digits, count them
		        		if (Character.isDigit(password.charAt(i))) {
		                    counter++;
		                }
		            } 
		       //if there are not letters or numbers,the password is false
		        	else {
		                validPassword = false;
		                break;
		            }
		        }

		        //if there is less than 2 numbers,passwor is invalid
		        if (counter < 2) {
		            validPassword = false;
		        }

		    }

		    return validPassword;//return valid password

		}}
