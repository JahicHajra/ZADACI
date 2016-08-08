package Calendar;
/* program koji trebamo napisati treba da pita korisnika da unese mjesec i godinu te da mu ispiše, 
 * kao na slici ispod, kalendar za taj mjesec i tu godinu. Kada program ispiše dati mjesec korisniku na konzoli,
 *  program onda pita korisnika da li želi unijeti neki reminder za odreðeni dan ili želi vidjeti kalendar za 
 *  neki drugi mjesec. Ukoliko korisnik želi neki podsjetnik/reminder/note za odreðeni dan, program treba da saèuva
 *   korisnikov unos i da ga prikaže pri sljedeæem pokretanju programa. 
 */

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

	public class Calendar{
	
	
		//create static array for months
		static String[] months = {"", "January", "February", "March", "April", "May", "Jun", "July", "August", 
			"September", "Oktober", "November", "December"};
	
		
		static int month;
     
		
		static int year;
   

		
		static Scanner input = new Scanner(System.in); //create Scanner
	
		public static void main(String[] args) throws FileNotFoundException { //main method
       
		
		
		
		
		boolean end = true;
		
		//print options for user
		do {
			
			System.out.println("Your options are: ");
			System.out.println("\n1.Print calendar");
			System.out.println("\n2. Show reminder");
			System.out.println("\n3. Add reminder");
			System.out.println("\n4. Exit");

			
			
			//add options and call methods
			try {
				int a = input.nextInt();
				switch (a) {
				case 1:
					printCalendar();
					break;
				case 2:
					reminder(input);
					break;
				case 3:
					printOut(input);
					break;
				case 4:
					end = false;
					break;
				}
			} catch (Exception e) {
				System.err.println(" Wrong input. Try again");
				input.nextLine();
			}
		} while (end);

	}
	
	public static void printCalendar(){//printCalendar method(1st option)
		
	
		String[] daysInWeek = {"Mon", "Tue", "Wed", "Thu", "Fri", "Sat", "Sun"};// create array of days in week
		
		
		int[] numberOfDays  = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};//create array of number of days in month
		
	
				
		//enter a year
		System.out.println("Enter a year ");
		while (true) {
			try { // try block
				year = input.nextInt();
				break;
			} catch (Exception e) { // catch exception and handle it
				System.out.println("Wrong input. Try again");
				input.nextLine();
			}
		}
		
		//enter a month
		System.out.println("Enter a month");
		while (true) {
			try {
				month = input.nextInt();
				if (month < 1 || month > 12) { // loop that check months in a year
					System.out.println("Wrong input. Enter a number for month");
					continue;
				}
				break;
			} catch (InputMismatchException e) {
				System.err.println("Wrong input. Try again");
				input.nextLine();
			}
		}

		//check if it is leap year calling a method leap
		if (Leap(year) && month == 2) {
			numberOfDays[2] = 29;
		}

		//print the look of the calendar
		System.out.println("              " + months[month] + " " + year);
		System.out.println("-----------------------------------------");
		for (String e : daysInWeek) { //loop includes all days in week, print them
			System.out.print(e + "   ");
		}

		//print the empty space until first day in a month
		int d = day(month, year);
		System.out.println();
		for (int i = 0; i < d; i++) {
			System.out.print("      ");
		}

		//print days of the month
		for (int i = 1; i <= numberOfDays[month]; i++) {
			System.out.printf("%2d    ", i);
			if (((i + d) % 7 == 0) || (i == numberOfDays[month])) {
				System.out.println();
			}
		}
	}
	
	//method that examones whether a year is a leap one
	public static boolean Leap(int year){
		if((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)){
			return true;
		}
		return false;
	}
	
	
	public static int day(int M, int y){ //day method, counts how days are ordered in a week and a month
		
		int a = y -(14 - M) / 12;
		int b = a + a/4 - a/100 + a/ 400;
		int c = M + 12 * ((14 - M) / 12) - 2;
		return (b +(31 * c) / 12)% 7;
	}
	
	//print datas in file
	public static void reminder(Scanner input) throws FileNotFoundException{
		
	//create file object
		File f = new File("Reminders.txt");
		
		
		try (PrintWriter pw = new PrintWriter(new FileOutputStream(f, true))) {
			System.out.println(months[month] + " " + year);
			
			System.out.println("Enter a day:");
			int day = input.nextInt();
			
			System.out.println("Enter a reminder");
			input.nextLine();
			
			String str = input.nextLine();
			pw.println(day + "." + month + "." + year + "; " + str);
			pw.close();
		} catch (IOException e) {
		}
		
		
	}
	
	//print the datas
	public static void printOut(Scanner input) throws FileNotFoundException{
		
		
		File f = new File("Reminders.txt");
		
	
		
		ArrayList<String> list = new ArrayList<>();
		
		//enter day for reminders
		int day = 0;
		System.out.println("Enter reminders for (month " + months[month] + " " + year + ". year) :");
		try {
			day = input.nextInt();

			// Read file
			String remindDay= day + "." + month + "." + year;
			Scanner in = new Scanner(f);
			while (in.hasNextLine()) {
				String str = in.nextLine();
				String date = str.substring(0, str.indexOf(";"));
				if (date.equals(remindDay)) {
					list.add(str);
				
				}
			}
			in.close();

			
			//print reminders
			System.out.println("\nReminders:");
			if (list.size() == 0) {
				System.out.println("There is no reminder" + remindDay);
			} else {
				for (String s : list) {
					System.out.println(s);
				}
			}
		} catch (Exception e) {
			System.out.println("Wrong input. Try again.");
			input.nextLine();
		}
		
	}
}
