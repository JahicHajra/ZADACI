package Zadaci_27_08_2016;

/*(Sort ArrayList) Write the following method that sorts an ArrayList of
numbers:
public static void sort(ArrayList<Integer> list)
Write a test program that prompts the user to enter 5 numbers, stores them in an
array list, and displays them in increasing order.
 * 
 */
import java.util.ArrayList;
import java.util.Scanner;
public class SortArrayList {

	static Scanner input = new Scanner(System.in);
	
	
	public static void main(String[] args) {

		//create arrayList
		ArrayList<Integer>list = new ArrayList<>();
		
		System.out.println(" Enter five numbers");
		
		//numbers input
		for(int i = 0;i<5;i++){
			
			
			list.add(input.nextInt());
		}
		//method call
		sort(list);
		
		System.out.println(" Sorted list is");
		
		//print list
		System.out.println(list);
	}
	
	//sort method
	public static void sort(ArrayList<Integer>list){
		
		for(int i = 0; i < list.size()-1;i++){
			
			for(int j = i+1;j<list.size();j++){
				
				//if the number i is greater than j,set a and b value for i and j value
				if(list.get(i)>list.get(j)){
					int a = list.get(i);
					int b = list.get(j);
					
					//set new value for j,i is given value of j
					list.set(i,b);
					list.set(j, a);
				}
			}
		}
	}}
	
	