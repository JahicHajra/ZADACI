package Zadaci_08_08_2016;

/*Pozitivni cijeli broj je savršen broj ukoliko je jednak zbiru svih svojih pozitivnih djelilaca, iskljuèujuæi sebe.
 *  Na primjer, 6 je prvi savršeni broj jer 6 = 3 + 2 + 1. Sljedeæi savršeni broj je 28 jer 28 = 14 + 7 + 4 + 2 + 1. 
 *  Samo 4 savršena broja postoje u rasponu od 0 do 10.000. Napišite program koji ispisuje sva 4
 */

public class Perfect_Number {

	public static void main(String[] args) { //main method

		int perfectNumber =0;
		int sum = 0;
	
		
		boolean correct = true;
		
		
		while(correct){
			correct = false;
			java.util.Scanner input = new java.util.Scanner(System.in);//create
			
			try{//try block
				
			
		for(int i = 1; i<=10000;i++){ //loop to check numbers to 10000
			
			for(int j = 1; j<i;j++){ //check if the number can be divided by j
				
				if(i%j==0){ 
					
				sum+=j; //add j to sum
				}
			}
			if(sum==i){ //if sum is equal to number,print it
				System.out.print( i + " ");
				perfectNumber++; //count perfect nubers
			}
			sum = 0;//start again
			}
			System.out.println("\n There are " + perfectNumber + " perfect numbers"); //print how many perfect numbers
			}	
			catch(Exception ex){ //catch block
				System.out.println(" ");
				correct = true;
			}
			finally{
				input.nextLine();
			}
			input.close();
		}

	}}
