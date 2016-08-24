package Zadaci_23_08_2016;

public class MyInteger {

	
	//data field named value
int value;
	
	// constructor creating a MyInteger object for the specified int value.
	public MyInteger(int value){
		this.value = value;
	}

	//getter method
	public int getValue() {
		return value;
	}
	
	//boolean isEven method that returns true if the value is even
public boolean isEven(){
	
	if(this.value % 2 ==0)
		
		return true;
	
	else
		
		return false;
}

//boolean isOdd method that returns true if the value is odd
public boolean isOdd(){
	
	if(this.value %2 !=0)
		return true;
		
		else
			
			return false;
		
	}

//boolean isPrime method that returns true if the value is prime
public boolean isPrime(){
	
	for(int i = 2; i<this.value;i++){
		if(this.value % i !=0)
			
			return true;
	}	
		
			return false;
	}

//static boolean isEven,isOdd,isPrime methods that return true if the value is even,odd or prime
public static boolean isEven(int num){
	
	if(num % 2 ==0)
		
		return true;
		
	else
		
		return false;
	}

public static boolean isOdd(int num){
	
	if(num % 2 !=0)
		
		return true;
				
	else
			
			return false;
		
	}
	

	public static boolean isPrime(int num){
		
		for(int i = 0; i < num;i++){
			if(num % i !=0)
				return true;
			
		}
		
				return false;
			
	}
	
	//static boolean isEven,isOdd, isPrime methods that return true if the value is even,odd or prime
	public static boolean isEven(MyInteger num){
		
		return isEven(num.value);
	
	
		
}
	
	public static boolean isOdd(MyInteger num){
		
		return isOdd(num.value);
	}
	
	public static boolean isPrime(MyInteger num){
		
		return isPrime(num.value);
	}
	
	
	/* The methods equals(int) and equals(MyInteger) that return true if
the value in this object is equal to the specified value.
	 */
	public boolean equals(int num){
		
		if(this.value==num)
			return true;
			
			return false;
		}
	
	
	/* A static method parseInt(char[]) that converts an array of numeric
characters to an int value.
	 */
	public static int parseInt(char[]num){
		
		String number = "";
		
		for(int i = 0;i< num.length;i++){
			number+=num[i];
		}
		return Integer.valueOf(number);
		
	}
	// A static method parseInt(String) that converts a string into an int value
	public static int parseInt(String num){
		
		return Integer.valueOf(num);
	}

}

