package Zadaci_23_08_2016;


public class Time {
	
	//data fields hour, minute and second
	long hour;
	long minute;
	long second;
	
	//no arg constructor with timeMillis method
	Time(){
		
		setTime(System.currentTimeMillis());
		
	}
	
	// A constructor constructing a Time object with a specified elapsed time
	Time(long elapsedTime){
		setTime(elapsedTime);
	}
	
	//A constructor constructing a Time object with the specified hour, minute and second
	Time(long second, long minute, long hour){
		
		this.hour = hour;
		this.minute = minute;
		this.second = second;
	}
	
	//three getters methods for the data fields
	public long getHour() {
		return hour;
	}
	public long getMinute() {
		return minute;
	}
	public long getSecond() {
		return second;
	}

	//setTime method that set a new tine for the object
void setTime(long elapsedTime){
	
	second = elapsedTime/1000;
	
	minute = second/60;
	
	hour = minute/ 60;
	
	this.hour = hour % 24;
	this.minute = minute % 60;
	this.second = second % 60;
	

		
	}

}