package Zadaci_05_08_2016;
/*Napisati program koji pita korisnika da unese 2 stringa te ispisuje najveæi zajednièki prefix za ta dva stringa, 
 * ukoliko isti postoji. Na primjer, ukoliko korisnik unese sljedeæa dva stringa "Dobrodošli u Dubai" i
 *  "Dobrodošli u Vankuver" program treba da ispiše: Najveæi zajednièki prefix za dva stringa je "Dobrodošli u". 
 */

public class String_Prefix {

	public static void main(String[] args) {//main class

java.util.Scanner input = new java.util.Scanner(System.in);//input scanner

System.out.println(" Enter first string");

String s= input.nextLine();//first string input
String[]array=s.split("\\s");//string array,separate the strings into substrings

System.out.println("Enter the second string");
String s2 = input.nextLine();//second string input
String[]array2=s2.split("\\s");//the second string array

String prefix= "";//prefix determiner,starts from the beginning

for(int i=0;i < array.length;i++){ // loop that goes through array length
	if(array[i].equals(array2[i])){//finds if they are equal
	
	prefix = prefix + " " + array[i]; //common prefix
	}
	else{ //if they are not equal
		break;//break out of the loop
	}
}

if(prefix==""){//if there is only one word in a string
	System.out.println(" No prefixes");//print no prefix
}

//if there is prefix,print it
else{
	System.out.println(" Common prefix is: " + prefix );
}
input.close();
	}

}
