package Zadaci_16_08_2016;
/*
 * Napisati metodu koja vraæa datum i trenutaèno vrijeme.
 */

public class Time_And_Date {

	public static void main(String[] args) {

		//method call
				timeAndDate(System.currentTimeMillis());
			}
			
			public static void timeAndDate (long millis){
				
				
			//converting to seconds minutes and hours
				long seconds= (millis/1000) %60;		
				long minutes = (millis/1000/60)% 60;		
				long hours = (millis/1000/60/60)%24;
					
				// print time
						System.out.println((hours+2)+":"+ minutes + ":"+ seconds);
				
				//call method
						date(millis);

			}
			
			public static void date(long millis){
				
				//total days from 1970
				long totalDays = (millis/1000/60/60/24);
					
			
				int year= 1970;
					
			//as long as year has 365 or 366 days, take the number of days in a year from the number of total days
				while (totalDays>numberOfDaysInAYear(year)){
			
					
					totalDays-=numberOfDaysInAYear(year);
			
						year++;
					}
				
				
					int month =1;
				
			//depending on how many days are in month, take the number of days in a month from the number of total days
					while (totalDays>days(month,year)){
						
				
						totalDays-=days(month,year);
					
						month++;
						
					}
					
					//print date
					System.out.println(totalDays+1  + "."+ month + "." + year);
					
				}
			
				//method for counting the number of days in a year

				public static int numberOfDaysInAYear(int year){
						
						int day = 0;
						// if it is a leap year then number of days is 366;otherwise number of days 365
						if ((year%4==0 && year%100!=0 )|| (year%400==0)){
							day =366;
						}
						else {
							day =365;
						}
						return day;
					}
					
				// method for counting number of days in a month
				public static int days(int month, int year){
					
					
						int day=0;
						
						//months with 31 days
						if (month==1 || month ==3 || month ==5 ||month ==7 ||month ==8 || month ==10 || month ==12){
							day= 31;
						}
						
						//months with 30 days
						else if (month ==4 || month ==6 || month ==9 || month ==11 ){
							day= 30;
						}
						// number of days in February depending on whether it is a leap year
						else if (month ==2){
							if( numberOfDaysInAYear(year)==366){
								day =29;
							}
							else {
								day =28;
							}
						}
						return day;
					}
				
}

