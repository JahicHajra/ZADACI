package Zadaci_27_08_2016;

/*
 * (Remove duplicates) Write a method that removes the duplicate elements from
an array list of integers using the following header:
public static void removeDuplicate(ArrayList<Integer> list)
Write a test program that prompts the user to enter 10 integers to a list and displays
the distinct integers separated by exactly one space. Here is a sample run:
 * 
 */
import java.util.Scanner;
import java.util.ArrayList;
import java.util.InputMismatchException;


public class RemoveDuplicates {
	
	
	static Scanner input = new Scanner(System.in);

	
	public static void main(String[] args) {

		//create arrayList
		ArrayList<Integer>list = new ArrayList<>();
		
		System.out.println(" Enter ten numbers");
		
		//five numbers input
		for(int i = 0; i < 10; i++){
			list.add(input.nextInt());
		}
		
		removeDuplicates(list);//method call
		
		System.out.println(" The list after removing duplicates is" + list);
	
	}
	
	//removeDuplicates method
	public static void removeDuplicates(ArrayList<Integer>list){
		
		//create new arrayList
		ArrayList<Integer>temp = new ArrayList<>();
		
		//check the numbers of the list
		for(int i = 0;i<list.size();i++){
			
			//if the number from the list is not in the templist,add it
			if(!temp.contains(list.get(i))){
				temp.add(list.get(i));
			}
}
		list.clear();//removing all elements
		list.addAll(temp);//insert all elements
	}

}
