package Zadaci_08_08_2016;

/*Napisati program koji pita korisnika da unese mjesec i godinu te mu ispiše broj dana u datom mjesecu.
 *  Na primjer, ukoliko korisnik unese kao godinu 2012 a kao mjesec 2, program treba ispisati da je Februar 2012
 *   imao 29 dana. Ukoliko korisnik unese kao godinu 2015 a kao mjesec 3, program treba ispisati da je Mart 2015
 *    imao 31 dan. 
*/


import java.util.Scanner;


public class NumberOfDays_InMonth {

	public static void main(String[] args) {//main clas

		Scanner input = new Scanner(System.in);//scanner created
	
System.out.println("Enter a month(number) and a year"); 
int month = input.nextInt();
int year = input.nextInt();

String Month = null;
int numberOfDays =0;


switch(month){ // switch statement for months



case 1:
case 3:
case 5:
case 7:
case 8:
case 10:
case 12:
	
	numberOfDays = 31;
	break;
		
		
case 2 : 
	if((year % 4 ==0 && year % 100!=0)|| (year % 400==0)){//check if it is a leap year
		
		numberOfDays = 29;
		break;
	}
	
	numberOfDays = 28;
		break;
	
		
		
	case 4:
	case 6:
	case 9: 
	case 11: 
		
		numberOfDays = 30;
}

switch(month){//switch cases for month as a string

case 1:
	
	Month = "January";
	
	break;
	
case 2: 
	
	Month = "February";
	
	break;
	
case 3: 
	
	Month = "March";
	
	break;
	
case 4:
	
	Month = " April";
	
	break;

case 5:
	
	Month = " May";
	
	break;

case 6:
	
	Month = " Jun";
	
	break;
	
case 7:
	
	Month = " July";
	
	break;
	
case 8:
	
	Month = "August";
	
	break;
	
case 9:
	
	Month = " September";
	
	break;
	
case 10:
	
	Month = "October";
	
	break;
	
case 11:
	
	Month = "NOvember";
	
	break;
	
case 12:
	
	Month = "December";
	
	break;
	
	
}

//print how many days a month has
System.out.println(" Month " + Month + " in year " + year + " had " + numberOfDays + " days .");
	input.close();
	}

}