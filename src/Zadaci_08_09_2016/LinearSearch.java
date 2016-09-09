package Zadaci_08_09_2016;
/** (Generic linear search) Implement the following generic method for linear search.
 * public static <E extends Comparable<E>> int linearSearch(E[] list, E key)
 * 
 */

public class LinearSearch {



		public static void main(String[] args) {
			
			//create an array
			Integer[] list = new Integer[20];
			for (int i = 0; i < list.length; i++) {
				list[i] = i;
			}
		
			
			System.out.println(linearSearch(list, 4));
			System.out.println(linearSearch(list, 12));
			System.out.println(linearSearch(list, 26));
		}

		// generic method for linear search
		public static <E extends Comparable<E>> int linearSearch(E[] list, E key) {

			for (int i = 0; i < list.length; i++) {
				
				// if the key compared to list with specified index is zero
				if (list[i].compareTo(key) == 0) {
					// return number from the list
					return i;
				}
			}
			// else
			return -1;
		}
	}
