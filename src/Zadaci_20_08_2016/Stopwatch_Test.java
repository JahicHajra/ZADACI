package Zadaci_20_08_2016;


/*
 * /*(Stopwatch) Design a class named StopWatch. The class contains:
Private data fields startTime and endTime with getter methods.
A no-arg constructor that initializes startTime with the current time.
A method named start() that resets the startTime to the current time.
A method named stop() that sets the endTime to the current time.
A method named getElapsedTime() that returns the elapsed time for the
stopwatch in milliseconds.
Draw the UML diagram for the class and then implement the class. Write a test
program that measures the execution time of sorting 100,000 numbers using
selection sort.
 * 
 * 
 */
public class Stopwatch_Test {

	public static void main(String[] args) {

		
		//declare and create array with number of 100000
				int[]array = new int[100000];
				
				//generate random numbers from0-100
				for(int i = 0; i<array.length;i++){
					array[i]=(int)(Math.random()*100);
				}
				
				//create an object stopwatch
				Stopwatch stopwatch = new Stopwatch();
				
				
				//call method for starting the stopwatch
				stopwatch.start();
				
				//method call
				selectionSort(array);
				
				//call method for stoping stopwatch
				stopwatch.stop();
				
				System.out.println(" Time elapsed " + stopwatch.elapsedTime() + " miliseconds");
			}
			
			
			//selectionSort method
			public static int[]selectionSort(int[]array){
				
				
				//sort the array
				for(int i = 0; i< array.length;i++){
					
					for(int j = 0;j<array.length;j++){
						
						if(array[i]>array[j]){
							int temp = array[i];
							array[i] = array[j];
							array[j]= temp;
						}
						}
						
						
					}
				return array;
				}
	}