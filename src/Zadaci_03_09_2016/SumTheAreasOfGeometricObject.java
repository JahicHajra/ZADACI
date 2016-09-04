package Zadaci_03_09_2016;
/*
 * (Sum the areas of geometric objects)
 * Write a method that sums the areas of all the geometric objects in an array. 
 * The method signature is:
 * public static double sumArea(GeometricObject[] a)
 * Write a test program that creates an array of four objects (two circles and two rectangles) 
 * and computes their total area using the sumArea method.
 */



public class SumTheAreasOfGeometricObject {

	public static void main(String[] args) {

		//create array
		GeometricObject[] object = new GeometricObject[4];
		
		//4 elements of geometric objects added
		object[0]= new Circle(2);
		object[1]= new Circle(1);
		object[2]=new Rectangle(3,2);
		object[3]=new Rectangle();
		
		//print
		System.out.println(" Total is " + sumArea(object));
	}
	
	public static double sumArea(GeometricObject[]a){
		
		
		double sumArea = 0;
		//loop that goes through the array
		for(int i = 0; i <a.length;i++){
			
			sumArea+=a[i].getArea();
		}
				return sumArea;
	}

}
