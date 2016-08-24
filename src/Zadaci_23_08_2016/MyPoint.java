package Zadaci_23_08_2016;

public class MyPoint {

	
	//data fields
private double x,y;
	
	//no-arg constructor
	MyPoint(){
		this.x =0;
		this.y=0;
	}
	
	// A constructor constructing a point with specified coordinates.
	MyPoint(double x, double y){
		this.x=x;
		this.y=y;
	}
	
	//get methods for data fields
	public double getX(){
		return x;
	}
	public double getY(){
		return y;
	}
	
	//distance method that returns the distance from this point to a specified point of the MyPoint type.
	public double distance(double x2, double y2) {
        
		return Math.sqrt((Math.pow((this.x - x2), 2) + Math.pow((this.y - y2), 2)));
	}
	
	/*distance method that returns the distance from this point to
	another point with specified x- and y-coordinates.
	 */
	public double distance(MyPoint a) {
		double x1 = a.getX() ;
		double y1 = a.getY() ;

		double distanc =distance(x1,y1)  ;

		return distanc ;
	}}