package Zadaci_26_08_2016;
/*(Shuffle ArrayList) Write the following method that shuffles the elements in
an ArrayList of integers.
public static void shuffle(ArrayList<Integer> list) 
 * 
 */

import java.util.ArrayList;
public class ShuffleArrayList {

	public static void main(String[] args) {

		//create arrayList 
		ArrayList<Integer>list = new ArrayList<>();
		
		//add numbers to arrayList
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(10);
		list.add(11);
		list.add(12);
		list.add(13);
		
		//method call
		shuffle(list);
	}
	
	public static void shuffle(ArrayList<Integer>list){
		
		//create new arraylist
		ArrayList<Integer>newList = new ArrayList<>();
		
		//if list is empty,print it
		if(list.isEmpty()){
			System.out.println(" List is empty");
		}
		
		//as long as list is not empty,generate random numbers in the list
		while(!list.isEmpty()){
			
			int j = (int)(Math.random()*list.size());
			
			//add the numbers to the new list
			newList.add(list.get(j));
			
			//remove the number from the old list
			list.remove(list.get(j));
		}
		
		//print new list
		for(int i = 0; i < newList.size();i++){
			System.out.print(newList.get(i) + " ");
		}
	}

}
