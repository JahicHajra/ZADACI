package Zadaci_30_08_2016;

/*
 * (OutOfMemoryError) Write a program that causes the JVM to throw an
 * OutOfMemoryError and catches and handles this error.
 
 */
import java.util.ArrayList;

public class OutOfMemory {
	
	public static void main(String[] args) {
		
		//try block
		try{
			
			
			String x = "1";
			
			//since it is always true,memory will be full
			while (true){
			    x = (x + x);
			}
		}
		// catch outOfMemoryException
		catch(OutOfMemoryError ex){
				
				System.out.println("Out of memory error");
				
				//end program
				System.exit(1);
			}
	}

}
	

