package Zadaci_01_09_2016;
/*(Sort ArrayList) Write the following method that sorts an ArrayList of numbers.
  * public static void sort(ArrayList<Number> list)
 * 
 */
import java.util.ArrayList;
public class SortArrayList {

	public static void main(String[] args) {

		//create array list
		ArrayList<Integer>list = new ArrayList<>();
		
		//add numbers to the list
		list.add(1);
		list.add(4);
		list.add(2);
		list.add(5);
		list.add(3);
		
		//method invocation
		sort(list);
	}
	
	//sort method
	public static void sort(ArrayList<Integer>list){
		
		boolean sorted = false;
		int temp = 0;
		
		if(list.size()>1){
			
			//as long as the list is not sorted
			while(!sorted){
				
				sorted = true;
			
			
		
		for(int i = 0; i < list.size()-1;i++){
			
			//if the first element is greater than other, replace them
			if(list.get(i)>list.get(i+1)){
				
				//set sorted to false, for another iteration
				sorted = false;
				
				temp = list.get(i);
				
				list.set(i,list.get(i+1));
				list.set(i+1,temp);
			}
			
		}
	}

}
		
		//print sorted list
System.out.println(list);
}}
