package Zadaci_22_08_2016;

public class RegularPolygon {

	
//private data fields
	private int n;
	private double side;
	private double x;
	private double y;
	
	//no-arg constructor
	public RegularPolygon(){
		
		n =3;
		side=1;
		x=0;
		y=0;
		
	}
	//constructor with arguments n and side
	public RegularPolygon(int n, double side){
		
		this.n= n;
		this.side = side;
		x=0;
		y=0;
	}
	//constructor with arguments n, side, x, y
	public RegularPolygon(int n, double side, double x, double y){
		
		this.n = n;
		this.side = side;
		this.x = x;
		this.y = y;
	}
//accessors and mutators for all four private data fields
	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}
	
	//method getPerimeter that returns perimeter of polygon
	public double getPerimeter(){
		return n*side;
	}
	//getArea method that returns area of the polygon
	public double getArea(){
		return ((n*Math.pow(side, 2)))/(4*Math.tan(Math.PI/n));
	}

}
