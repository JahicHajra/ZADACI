package Zadaci_20_08_2016;

public class Stopwatch {

	
	private long startTime;
	private long endTime;
	
	
	Stopwatch(){
		
	}
	
	long start(){
		
		return this.startTime = System.currentTimeMillis();
	}
	
	long stop(){
		
		return this.endTime = System.currentTimeMillis();
	}
	
	public long elapsedTime(){
		
		return this.endTime-this.startTime;
	}
}
