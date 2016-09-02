package Zadaci_01_09_2016;
/* (Shuffle ArrayList) Write the following method that shuffles an ArrayList of numbers:
 * public static void shuffle(ArrayList<Number> list)
 * 
 */
import java.util.ArrayList;
public class Shuffle_ArrayList {

	public static void main(String[] args) {

		//create array list
		ArrayList<Integer>list = new ArrayList<>();
		
		//add numbers to the list
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
		//method invocation
		shuffle(list);
	}
	
	//shuffle method
	public static void shuffle(ArrayList<Integer>list){
		
		//loop that goes through thelist
		for(int i = 0; i < list.size();i++){
			
			int number = list.get(i);
			
			list.remove(list.get(i));
			
			//create random indec
			int random = (int)(Math.random()*list.size()-1);
			
			//add it to the list
			list.add(random,number);
		}
		//print list
		System.out.println(list);
		
		
	}

}
