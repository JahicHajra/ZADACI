package Zadaci_08_09_2016;
/** (Distinct elements in ArrayList) Write the following method that returns a new
 * ArrayList. The new list contains the non-duplicate elements from the original list.
 * public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list)
 */
 
import java.util.ArrayList;
public class RemoveDuplicates {

	public static void main(String[] args) {

		
//create arrayList
		ArrayList<String> s = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			
			// adding elements to the list-strings
			s.add(" You're finished!");
			s.add(" Completed.");
			s.add("Done. ");
			s.add(" You're finished.");

		}

		s = removeDuplicates(s);
		for (int i = 0; i< s.size();i++){
			System.out.println(s.get(i));
		}
	}

	// method that returns a new ArrayList with no duplicates
	public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list) {

		ArrayList<E> temp = new ArrayList<>(list.size());
		for (E e: list) {
			//checks the element for specific element
			if (!temp.contains(e)) {
				
				//add element to a new list
				temp.add(e);
			}
		}
		
return temp;
	}

}