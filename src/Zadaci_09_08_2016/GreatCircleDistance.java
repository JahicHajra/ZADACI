package Zadaci_09_08_2016;

/*
 * Great circle distance predstavlja udaljenost izmeðu dvije taèke na površine sfere. 
 * Neka nam (x1, y1) i (x2, y2) predstavljaju geografsku širinu i dužinu dvije taèke. 
 * Great circle distance izmeðu ove dvije taèke može biti izraèunata koristeæi se sljedeæom formulom: 
 * d = radius * arccos (sin(x1) X sin(x2) + cos(x1) * cos(x2) * cos(y1 - y2)).
 *  Napisati program koij pita korisnika da unese geografsku širinu i dužinu u stepenima dvije taèke na 
 *  površini zemlje te mu ispisuje great circle distance. Prosjeèni radius zemlje je 6.371.01 km.
 *   Stepene koje korisnik unese trebamo promijeniti u radianse koristeæi se Math.toRadians metodom jer 
 *   Java trigonometrijske metode koriste radianse. Širina i dužina u ovoj formuli se odnose na zapad i sjever.
 *    Koristimo negativne vrijednosti da oznaèimo istok i jug. 

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