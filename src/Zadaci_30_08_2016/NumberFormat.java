package Zadaci_30_08_2016;

/*(NumberFormatException) Write the bin2Dec(String binaryString)
 * method to convert a binary string into a decimal number. Implement the
 * bin2Dec method to throw a NumberFormatException if the string is not a
 * binary string.
 
 */

public class NumberFormat {
	
	public static void main(String[] args) {

		//number in binary form
		System.out.println(bin2Dec("101010"));
		try{
		
			//try number that is not binary
		System.out.println(bin2Dec("aoeiu826"));
		}catch(NumberFormatException ex){
			System.out.println(ex);

        }
	}

	// method that converts binary string to decimal binaryString
	public static int bin2Dec(String binaryString) throws NumberFormatException {
		
		
		// if string consists of anything other than 0s and 1s method will throw
		// exception
		if (!isBinary(binaryString)) {
			throw new NumberFormatException(binaryString
					+ " is not a binary number");

		}

		int power = 0;
		int decimal = 0;
		for (int i = binaryString.length() - 1; i >= 0; i--) {

			if (binaryString.charAt(i) == '1') {
				decimal += Math.pow(2, power);
			}
			power++;
		}
		return decimal;
	}

	public static boolean isBinary(String binaryString) {

		//return false if the character is not 1 or 0
		for (char ch : binaryString.toCharArray()) {
			if (ch != '1' && ch != '0')
				return false;
		}
		return true;
	}

}
