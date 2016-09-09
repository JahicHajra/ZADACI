package Zadaci_08_09_2016;
/* * (Maximum element in an array) Implement the following method that returns the
 * maximum element in an array.
 * public static <E extends Comparable<E>> E max(E[] list)
 * 
 */

public class MaximumElement {
	
	public static void main(String[] args){
		

	//create array
	Integer[] list = { 9, 36, 45, 18, 27 };
	System.out.println("Max = " + max(list));//method invocation

}
//method that returns the maximum element in an array.
public static <E extends Comparable<E>> E max(E[] list) {
	E max = list[0];
	for (int i = 1; i < list.length; i++) {
		E element = list[i];
		if (element.compareTo(max) > 0) {
			max = element;
		}
	}

	return max;
}

}
