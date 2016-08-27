package Zadaci_26_08_2016;

/*(Maximum element in ArrayList) Write the following method that returns the
maximum value in an ArrayList of integers. The method returns null if the
list is null or the list size is 0.
public static Integer max(ArrayList<Integer> list)Write a test program that prompts the user to enter a sequence of numbers ending
with 0, and invokes this method to return the largest number in the input.
 * 
 */

import java.util.ArrayList;

public class MaximumElementInArrayList {

	
	public static void main( String[] args){
		
		//create arrayList
		ArrayList<Integer>list = new ArrayList<>();
		
		//add elements to the arraylist
		list.add(2);
		list.add(9);
		
		//if the list is equal to zero,print the statement
		if(max(list)==0){
			System.out.println(" The list is null");
		}
		
		//else,call the method max
		else{
			System.out.println(" The largest number in the list is " + max(list));
		}
	}
	
	public static Integer max(ArrayList<Integer>list){
		
		//if the list is empty, print the statement
		if(list.isEmpty()){
			return 0;
		}
		
		//find the largest element in the list
		int maxInt =list.get(0);
		
		for(int i = 0; i < list.size();i++){
			if(maxInt<list.get(i)){
				maxInt = list.get(i);
			}
		}
		return maxInt;
		
	}
}
