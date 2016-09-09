package Zadaci_08_09_2016;
/* * (Generic binary search) Implement the following method using binary search.
 * public static <E extends Comparable<E>>
 * int binarySearch(E[] list, E key)
 * 
 */

public class BinarySearch {

	public static void main(String[] args) {

//create list
		Integer[] list = { 4, 8, 12, 16, 20, 24, 32, 36, 40, 44};

		// Test the method
		System.out.println(binarySearch(list, 16));
		System.out.println(binarySearch(list, 20));
		System.out.println(binarySearch(list, 48));

	}

	//generic method for binary search
	public static <E extends Comparable<E>> int binarySearch(E[] list, E key) {

		int low = 0;
		int high = list.length - 1;

		while (high >= low) {
			//get middle index based on high and low
			int mid = (high - low) / 2 + low;
			
			//if key matches value on middle index,return that index
			if (list[mid].compareTo(key) == 0)
			
				return mid;

			//if value on the mid index is higher than key,search lower half of the list
			if (list[mid].compareTo(key) < 0)
			
				low = mid + 1;
			
			//otherwise,search higher half
			else
				high = mid - 1;
		}
//if the value is not found, return -1
		return -1;

	}
}
