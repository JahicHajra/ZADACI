package Zadaci_08_08_2016;
/*Napisati program koji ispisuje tri nasumièna cijela broja te pita korisnika da unese njihov zbir.
 *  Ukoliko korisnik pogriješi, program ispisuje pitanje ponovo sve sa porukom da pokuša ponovo. 
 *   Ukoliko korisnik unese taèan odgovor, program mu èestita i završava sa radom.
 */
import java.util.Scanner;
public class Three_Random_Numbers {

	public static void main(String[] args) {//main method

		
		Scanner input = new Scanner(System.in);//create scanner
		
	//generize random numbers	
int number1 = (int)(Math.random()* 10);
int number2 = (int)(Math.random()*10);
int number3 = (int)(Math.random() * 10);

int correctAnswer = (number1 + number2 + number3);//define correct answer

System.out.println(" How much is " + number1 + " + " + number2 + " + " + number3);

boolean correct = true;

while(correct){
correct = false;

try{
	

      int answer = input.nextInt(); //answer input


while(answer !=correctAnswer){//as long as the answer is not correct
	System.out.println(" The answer is incorrect. Try again");

answer = input.nextInt();

}

System.out.println("Congratulations! The answer is correct");
}
catch(Exception ex){//catch exception and handle it
	System.out.println(" Invalid input. Try again");
	correct = true;
}
finally{
	input.nextLine();
}

}
input.close();
}}