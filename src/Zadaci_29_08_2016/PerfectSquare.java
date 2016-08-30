package Zadaci_29_08_2016;

/*(Algebra: perfect square) Write a program that prompts the user to enter an integer
m and find the smallest integer n such that m * n is a perfect square. (Hint:
Store all smallest factors of m into an array list. n is the product of the factors that
appear an odd number of times in the array list. For example, consider m = 90,
store the factors 2, 3, 3, 5 in an array list. 2 and 5 appear an odd number of times
in the array list. So, n is 10.)
 * 
 * 
 */
import java.util.InputMismatchException;
import java.util.ArrayList;
import java.util.Scanner;
public class PerfectSquare {

	
	public static void main(String[]args){
		
Scanner input = new Scanner(System.in);
		
		boolean checkIn = true;
		
		
		do{
		
			try{
				//try number input
				System.out.println("Enter number: ");
				int m=input.nextInt();
				int n = n(m);
				checkIn=false;
				System.out.println("The smallest number n for m * n to be a perfect square is "+  n+"\n "+ m +" * " + n+ " = "+ (m*n) );
			}
			//catch exception and handle it
			catch (InputMismatchException e) {
				System.out.println("Input Mismatch Exception, unesite ponovo;"); 
				    input.nextLine();
				
				}
			}while(checkIn);
		
		input.close();
	}
	
	//n method
	public static int n (int m){
		
		ArrayList <Integer> factors = new ArrayList<>();
		
//add the least factor to the list
		for (int i = 2; i <= m; i++) {
					     while(m%i==0) {
					         factors.add(i);
					            m /= i;
					            }
					  }
		
			factors=newList(factors);	
			int n = product(factors);
			
			return n;
	}
	
	
	public static ArrayList <Integer> newList (ArrayList<Integer> list){
		
		
		ArrayList<Integer> newList = new ArrayList<>();
		
		for (int i=0; i< list.size(); i++){
			int counter=0;
			
			for (int j=0; j<list.size(); j++){
					//check the equal numbers 
				if (list.get(i).equals(list.get(j))){
					counter++;	//counter increment
				}
			}
			//
			if (counter %2 !=0){
				newList.add(list.get(i));
			}
		}
		return removeDuplicate(newList);		//return list without duplicates
	}
	
	
	public static ArrayList<Integer> removeDuplicate(ArrayList<Integer> list){
		
		//
		for (int i=0; i<list.size()-1; i++){
			
			for (int j=i+1; j<list.size(); j++){
				
				//remove duplicates if found
				if (list.get(i).equals(list.get(j))){
					
					list.remove(list.get(j));
					j--;
				}
			}
		}
		return list;
	}
	
	//returns the product of the arrayList
	public static int product(ArrayList<Integer> list){
		
		int product=1;
		for (int i=0; i<list.size(); i++){
			product *=list.get(i);
		}
		return product;
	}
}

