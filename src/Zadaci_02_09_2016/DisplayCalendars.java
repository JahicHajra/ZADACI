package Zadaci_02_09_2016;

import java.util.Calendar;

	/*
	 *  (Display calendars) 
	 *  Rewrite the PrintCalendar class in Listing 6.12 to display a calendar 
	 *  for a specified month using the Calendar and GregorianCalendar classes.
	 *  Your program receives the month and year from the command line. 
	 *  You also can run the program without the year. 
	 *  In this case, the year is the current year.
	 *  If you run the program without specifying a month and a year, the month is the current month.
	 */
	public class DisplayCalendars {

		public static void main(String[] args) {	
			
			// wrong input
			if (args.length > 2) {
		            System.out.println("Wrong input.");
		            System.exit(1);
		        }

		       int year;
		       int month;
		       
		       // if input is 1
		       if (args.length == 1) {
		        	int number = Integer.parseInt(args[0]);
		        	
		        	if(number < 1970){
		        		month = number;
		        		year = Calendar.getInstance().get(Calendar.YEAR);
		        	}
		        	else{
		        		year = number;
		        		month = Calendar.getInstance().get(Calendar.MONTH);
		        	}
		        	
		        }
		       //if input is 2
		       else if(args.length == 2){
		        	int number1 = Integer.parseInt(args[0]);
		        	int number2 = Integer.parseInt(args[1]);
		        	if(number1 < number2){
		        		month = number1;
		        		year = number2;
		        		
		        	}
		        	else{
		        		month = number2;
		        		year = number1;
		        		
		        	}
		        	
		        }
		        else 
		        {
		        	 month = Calendar.getInstance().get(Calendar.MONTH);
		             year = Calendar.getInstance().get(Calendar.YEAR);
		        }
		        
		       //check month input
		       if (getNameOfMonth(month+1)==null){
		    	   System.out.println("Invalid input. Enter a number form 0-11 for month");
		    	   System.exit(0);
		       } 
		       else{
		    	   printKalendar(month+1, year);
		       }
				
			}
			
			//print
			public static void printKalendar(int month, int year){
				
				System.out.println("\t"+getNameOfMonth(month)+", "+year);
				System.out.println("__________________________________");
				System.out.printf("%3s%5s%5s%5s%5s%5s%5s","Mon","Tue","Wed","Thur","Fri","Sat","Sun\n");
				
				System.out.println("__________________________________");
			
				//the first day in a month
				int starting_day = firstDay(month,year);
				
				//number of days in month
				int numberOfDays = numberOfDaysInMonth(year, month);
				
				if(starting_day > 0){
					starting_day = starting_day -1;
				}
				if(starting_day == 0){
					starting_day = 6;
				}
				for(int i=0; i<starting_day; i++){
					System.out.printf("%-5s"," ");
				}
				
				for(int i=1; i<=numberOfDays; i++){
					System.out.printf("%-5s",i);
					
					if((i+(starting_day))%7 == 0){
						System.out.println();
						
					}
				}
				System.out.println();
			}
			
			
			public static String getNameOfMonth(int month){

				//return name of month
				String monthName = null;
				switch (month) {
				case 1: monthName = "Januar"; break;
				case 2: monthName = "Februar"; break;
				case 3: monthName = "Mart"; break;
				case 4: monthName = "April"; break;
				case 5: monthName = "Maj"; break;
				case 6: monthName = "Juni"; break;
				case 7: monthName = "Juli"; break;
				case 8: monthName = "August"; break;
				case 9: monthName = "Septembar"; break;
				case 10: monthName = "Octobar"; break;
				case 11: monthName = "Novembar"; break;
				case 12: monthName = "Decembar";
				}

				return monthName;
				}

			public static int firstDay(int month, int year){
				
				//method for checking the first day in a month
				int a = (14-month)/12;
				int y = year - (int)a;
				int m = month + 12*(int)a -2;
				
				//first day in a week is Sunday
				int day = (1 + y + (y/4) - (y/100)+(y/400)+ ((31 *m)/12) )%7;
				return day;
			}
			
			
			public static int numberOfDaysInMonth(int year, int month){
				
				//switch month for number of days in month
				int days=0;
				switch (month){
					case 1:
						days= 31;
						break;
					case 2: 
						if (leap(year)){
							days= 29;
							break;
						}
						else{
							days= 28;
							break;
						}
					case 3:
						days= 31;
						break;
					case 4:
						days= 30;
						break;
					case 5:
						days= 31;
						break;
					case 6:
						days= 30;
						break;
					case 7:
						days=31;
						break;
					case 8:
						days= 31;
						break;
					case 9:
						days= 30;
						break;
					case 10:
						days= 31;
						break;
					case 11:
						days=30;
						break;
					case 12:
						days=31;
						break;
						}
					
				return days;
			}
			public static boolean leap(int year){
				//return leap year
				return year % 400 == 0 || (year % 4 == 0 && year % 100 != 0);
				}
}
