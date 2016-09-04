package Zadaci_03_09_2016;

	public class Octagon extends GeometricObject implements Comparable<Octagon>,Cloneable{
		//data fields
		private double side;
		
		//no args constructor
		Octagon(){
			
		}
		
		Octagon(double side){
			this.side=side;
		}
		//accessor and mutator for data field
		public double getSide() {
			return side;
		}
		
		public void setSide(double side) {
			this.side = side;
		}
		//compute area
		public double getArea(){
			
			return (2 + 4/22)* this.side * this.side ;
		}
		//compute perimeter
		public double getPerimeter(){
			return 8* this.side;
		}
		@Override
		public String toString() {
			return "Octagon [side=" + side + "]";
		}	
		
		//compareTo method 
		public int compareTo(Octagon obj) {
			
			//returns 1,-1 or 0 depending on which area is bigger
			if (this.getArea() > obj.getArea())
				return 1;
			else if (this.getArea() < obj.getArea())
				return -1;
			else
				return 0;
		}
		//object cloning
		@Override 
	    public Octagon clone() {
	        return new Octagon(this.side);
	    } 
		
	}
