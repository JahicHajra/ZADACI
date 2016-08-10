package Zadaci_09_08_2016;

/*
 * Great circle distance predstavlja udaljenost izme�u dvije ta�ke na povr�ine sfere. 
 * Neka nam (x1, y1) i (x2, y2) predstavljaju geografsku �irinu i du�inu dvije ta�ke. 
 * Great circle distance izme�u ove dvije ta�ke mo�e biti izra�unata koriste�i se sljede�om formulom: 
 * d = radius * arccos (sin(x1) X sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2)).
 *  Napisati program koij pita korisnika da unese geografsku �irinu i du�inu u stepenima dvije ta�ke na 
 *  povr�ini zemlje te mu ispisuje great circle distance. Prosje�ni radius zemlje je 6.371.01 km.
 *   Stepene koje korisnik unese trebamo promijeniti u radianse koriste�i se Math.toRadians metodom jer 
 *   Java trigonometrijske metode koriste radianse. �irina i du�ina u ovoj formuli se odnose na zapad i sjever.
 *    Koristimo negativne vrijednosti da ozna�imo istok i jug. 

 */
import java.util.Scanner;//scanner import
public class GreatCircleDistance {

	public static void main(String[] args) {//main method

		
		Scanner in = new Scanner(System.in);//create scanner
		
		
		boolean possible = true;
		while(possible){
			possible = false;
			
			try{
		
		System.out.println(" Enter the latitude ");
		
		double x1 = Math.toRadians(in.nextDouble());//latitude input using Math.toRadians method
		double y1 = Math.toRadians(in.nextDouble());
		
		System.out.println(" Enter the longitude");
		
		double x2 = Math.toRadians(in.nextDouble());
		double y2 = Math.toRadians(in.nextDouble());
		
		double radius = 6371.01;//average radius of the earth
		
		double GreatCircleDistance = radius * Math.acos(Math.sin(x1) * Math.sin(x2) + Math.cos(x1)* Math.cos(x2) *
				Math.cos(y1)-Math.cos(y2));//calculate circle distance 
		
		System.out.println(" The great circle distance is " + GreatCircleDistance + " km ");//print it
		
	}
catch(Exception ex){
	System.out.println("Invalid input. Enter a number.");
	possible = true;
}
			finally{
				in.nextLine();
			}
}
		in.close();
}
}