package Zadaci_27_08_2016;
/*(Combine two lists) Write a method that returns the union of two array lists of
integers using the following header:
public static ArrayList<Integer> union(
 ArrayList<Integer> list1, ArrayList<Integer> list2)
 * For example, the union of two array lists {2, 3, 1, 5} and {3, 4, 6} is
{2, 3, 1, 5, 3, 4, 6}. Write a test program that prompts the user to enter two lists,
each with five integers, and displays their union. The numbers are separated by
exactly one space in the output.
 */


import java.util.Scanner;
import java.util.InputMismatchException;
import java.util.ArrayList;
public class CombineTwoLists {

	
	static Scanner input = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		
		//create two arrayLists
		ArrayList<Integer>list1 = new ArrayList<>();
		ArrayList<Integer>list2 = new ArrayList<>();
		
		
		System.out.println(" Enter the first list of 5 numbers");
		
		//enter five numbers,add them to the list1
		for(int i = 0; i < 5;i++){
			int j = checkIn();
			list1.add(j);
		}
		System.out.println(" List 1 is ");
		print(list1);//method call
		
		System.out.println(" Enter the second list of 5 numbers");
		//enter five numbers,add them to the list 2
		for(int i = 0; i<5;i++){
			int j = checkIn();
			list2.add(j);
		}
		System.out.println("List 2 is");
		print(list2);//method call
		
		//method call
		System.out.print(" Lists union :" + union(list1,list2));

	}
	
	public static ArrayList<Integer>union(ArrayList<Integer>list1, ArrayList<Integer>list2){
		
		//create new arrayList
		ArrayList<Integer>union = new ArrayList<>();
		
		
		//connect two lists into one
		for(int i = 0; i < list1.size();i++){
			
			union.add(list1.get(i));
		}
			for(int i = 0;i<list2.size();i++){
				
				union.add(list2.get(i));
				
			
				}
			return union;
			}
	//print method
	public static void print(ArrayList<Integer>list){
		
		//print the new(union)list
		for(int i = 0; i < list.size();i++){
			
			System.out.println(list.get(i)+"");
		}
	}
	
	public static int checkIn(){
		
		int number = 0;
		
		boolean correct = true;
		
		do{
			
			try{
				
				number = input.nextInt();
				
				correct = false;
			}
			catch(InputMismatchException ex){
				System.out.println(" Invalid input. Enter a number.");
				
				input.nextLine();
			}
		}
		while(correct);
		return number;
	}

}
