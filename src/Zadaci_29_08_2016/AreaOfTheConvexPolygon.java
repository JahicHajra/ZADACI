package Zadaci_29_08_2016;

/*(Area of a convex polygon) A polygon is convex if it contains any line segments
that connects two points of the polygon. Write a program that prompts the user to
enter the number of points in a convex polygon, then enter the points clockwise,
and display the area of the polygon
 * 
 * 
 */
import java.util.InputMismatchException;
import java.util.ArrayList;
import java.util.Scanner;
public class AreaOfTheConvexPolygon {

	public static void main(String[] args) {

		
		Scanner input = new Scanner (System.in);
		ArrayList<Double> coordinates = new ArrayList<>();
		
		boolean isTrue = true;
		
		
		do{
			//try block
			try{
		
				// enter the number of the points
				System.out.println("Enter the number of the points");
				int numPoints = input.nextInt();
		
				System.out.println("Enter the coordinates of the points:");
				// coordinates input(numPoints*2)
				for (int i=0; i<numPoints*2; i++){
					coordinates.add(input.nextDouble());
				}
				isTrue=false;
				System.out.println("The total area is "+ areaOfPolygon(coordinates));
			}
			catch (InputMismatchException e) {
			    System.out.println("Invalid input. Enter a number;"); 
			    input.nextLine();
			
			}
		}while(isTrue);
			
		input.close();
	}
		
	
	public static double areaOfPolygon(ArrayList<Double> coordinates){
	
		double sum1=0;	
		double sum2=0;
	 
		//area of polygon
		// 1/2 * | [ (x1*y2 +x2*y3 + ..+xn*y1) - (y1*x2 + y2*x3+...+yn*x1)] |
		
		for (int i=0; i<coordinates.size()-3; i+=2){
			
			sum1+= coordinates.get(i)*coordinates.get(i+3); //i -0 element [x1] , i+3 -3 element [y2]
		    sum2+= coordinates.get(i+1)*coordinates.get(i+2); //i+1 -1 element [y1], i+2- 2 element [x2]
		}
	  
		// add last x1 multiplied by y1
				sum1+=(coordinates.get(coordinates.size()-2) *coordinates.get(1) );
		//add last yn multiplied by x1
				sum2+=(coordinates.get(coordinates.size()-1) *coordinates.get(0) );
	
	  // area: 1/2 * |sum1-sum2|
	  double area =(Math.abs(sum1-sum2))/2;
	  
	  
	  return area;
			
	}
}
	
