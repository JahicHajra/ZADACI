package Zadaci_26_08_2016;

public class Triangle extends GeometricObject{
	
	//data fields
	double side1;
	double side2;
	double side3;
	
	//no-arg constructor
	Triangle(){
		
		//side1,side2 and side3 with 1 as a default value
		side1 = 1.0;
		side2 = 2.0;
		side3 = 3.0;
		
	}
	
	//constructor that creates triangle with specified side1,side2,side3
	Triangle(double side1, double side2, double side3){
		
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}
//accessors of three datas
	public double getSide1() {
		return side1;
	}

	public double getSide2() {
		return side2;
	}

	public double getSide3() {
		return side3;
	}
	
	//getArea method;computing the area of the triangle
	public double getArea(){
		double h = getPerimeter() / 2;
		double area = Math.sqrt(h * (h - side1) * (h - side2) * (h - side3));
		return area;
		
	}
	
	//getPerimeter method;returns computed perimeter
	public double getPerimeter(){
		return side1 + side2 + side3;
	}
	
	@Override
	//print values of datas an object
	public String toString(){
	 return "Triangle:side1= " + side1 + " side2= " + side2 + "side3= " + side3;
	}

}
