package Zadaci_08_09_2016;
/* (Distinct elements in ArrayList) Write the following method that returns a new
 * ArrayList. The new list contains the non-duplicate elements from the original list.
 * public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list)
 */
 
import java.util.ArrayList;
public class RemoveDuplicates {

	public static void main(String[] args) {

		
		ArrayList<String> list = new ArrayList<String>();
		
		//String inputs
	    list.add("You're finished");
	    list.add("Completed");
	    list.add("Done");
	    list.add("You're finished");
	   
			
	    
	    print(removeDuplicates(list));		
	}

	// Method used for removing duplicates from an array 
	public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list) {
		ArrayList<E> temp= new ArrayList<E>();
		for (E e : list) {
			if (!temp.contains(e)) {	//if list doesn't contain element, add it
				temp.add(e);
		    }
		}
		return temp;
	}

	// Print array method 
	public static <E> void print(ArrayList<E> list) {
		for (E ex : list) {
			System.out.print(ex + " ");
		}
	}

	}
