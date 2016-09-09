package Zadaci_08_09_2016;
/* * (Maximum element in a two-dimensional array) Write a generic method that
 * returns the maximum element in a two-dimensional array.
 * public static <E extends Comparable<E>> E max(E[][] list)
 * 
 */

public class LargestElementInMatrix {

	public static void main(String[] args) {

		//create tow-dimensional array
		Integer[][] list = { { 7, 2, 19 }, { 4, 8, 13 }, { 7, 9, 10 } };

		System.out.println("Max = " + max(list));
	}

	// generic method that returns the maximum element in a two-dimensional array
	public static <E extends Comparable<E>> E max(E[][] list) {

		E max = list[0][0];
		for (E[] elements : list) {
			for (E element : elements) {
				if (element.compareTo(max) > 0) {
					max = element;
				}
			}
		}

		return max;
}
	}
