package Zadaci_18_08_2016;

/*
 * (Count single digits) Write a program that generates 100 random integers between
0 and 9 and displays the count for each number. (Hint: Use an array of ten integers,
say counts, to store the counts for the number of 0s, 1s, . . . , 9s.)
 */

public class Count_Digits {

	public static void main(String[] args) {
		
		
		//declare an array of 100 integers
		int[]array = new int[100];
		
		
		//declare an array of ten integers for counting numbers
		int[]count = new int[10];
		
		
		//generate array-lenght(100) random numbers between 0-10
		for(int i = 0;i<array.length;i++){
			
			int number = (int)(Math.random()*10);
			
			
			//print random integers
			System.out.print(number + " ");
			
			
			array[i]=number;
			
			//count numbers
			count[number]++;
		}
		
		//print number of occurrences of each number
		for(int i = 0; i <count.length;i++){
			
			System.out.println(" Number " + i + " occurs " + count[i] + " times ");
		}

	}

}
