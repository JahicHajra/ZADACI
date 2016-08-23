

package Zadaci_22_08_2016;


/*(Geometry: intersecting point) Two points on line 1 are given as (x1, y1) and (x2,
y2) and on line 2 as (x3, y3) and (x4, y4), as shown in Figure 3.8a–b.
The intersecting point of the two lines can be found by solving the following
linear equation:
(y1 - y2)x - (x1 - x2)y = (y1 - y2)x1 - (x1 - x2)y1
(y3 - y4)x - (x3 - x4)y = (y3 - y4)x3 - (x3 - x4)y3
This linear equation can be solved using Cramer’s rule (see Programming Exercise
3.3). If the equation has no solutions, the two lines are parallel 
 * 
 * 
 */
import java.util.InputMismatchException;
import java.util.Scanner;
public class GeometryIntersectingPoint {

	
	public static void main(String[] args){
		
		
		Scanner input = new Scanner(System.in);
		boolean correct = true;
		
		while(correct){
			
			correct = false;
		
		System.out.println(" Enter the first end point [x1,y1]") ;
		
		try{
		
			
			//user input
		double x1 = input.nextDouble();
		double y1 = input.nextDouble();
		
		System.out.println(" Enter the first end point [x2,y2]");
		
		double x2 = input.nextDouble();
		double y2 = input.nextDouble();
		
		System.out.println(" Enter the first end point [x3,y2]");
		
		double x3 = input.nextDouble();
		double y3 = input.nextDouble();
		
		System.out.println(" Enter the first end point[x4,y4]");
		
		double x4 = input.nextDouble();
		double y4 = input.nextDouble();
		
		
		double a = y1-y2;
		double b = -(x1-x2);
		double c = (y1-y2)* x1-(x1-x2)*y1;
		double d = (y3 - y4);
		double e = -(x3-x4);
		double f = (y3-y4)*x3 - (x3-x4)*y3;
		
		//create intersection object 
		LinearEquations lin = new LinearEquations(a, b, c, d, e, f);
		
		
		//if equation has no solution two lines are parallel
		if(lin.isSolvable()==false){
			
			System.out.println(" Two lines are parallel");
		}
		
		else{
			System.out.println(" Intersection point is :\nX " + lin.getX() + "\nY: " + lin.getY());
		}
	}
		
		catch(InputMismatchException ex){
			
			System.out.println(" Invalid input. Enter a number");
			correct = true;
		}
		
		finally{
			
			input.nextLine();
		}

}
}}