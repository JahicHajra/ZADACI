package Zadaci_17_08_2016;

/*
 * Napisati metodu sa sljede�im headerom: public static String format(int number, int width) koja vra�a string broja
 *  sa prefiksom od jedne ili vi�e nula. Veli�ina stringa je width argument. Na primjer, ukoliko pozovemo metodu format
 *  (34, 4) metoda vra�a 0034, ukoliko pozovemo format(34, 5) metoda vra�a 00034. Ukoliko je uneseni broj ve�i nego width
 *   argument, metoda vra�a samo string broja. Npr. ukoliko pozovemo format(34, 1) metoda vra�a 34.
 */

public class String_Format {

	public static void main(String[] args) {
		
		
		System.out.println(format(34,5));//method call
	}

	
	public static String format(int number, int width){
	
	
	String s = "";//declare string
	
	String n = number + "";//assign number with prefix to n
	
	
	
	for(int i =0; i < (width - n.length());i++){
		
		s+="0";//add 0 to string
	}
	return s+number;//return number with prefix
	
	
	}
}