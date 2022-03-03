package capgemini_training2022;

public class StrongNumber {

	public static boolean isStrong(int number) {
		int sum=0,lastDigit=0;
		
		
		int tempNum=number;
		
		while(tempNum!=0) {
			lastDigit=tempNum%10;
			
			sum += factorial(lastDigit);
			tempNum/=10;
		}
		
		if(sum==number) {
			System.out.println(number+ " is a Strong Number");
			
		}
		else {
			System.out.println(number+ " is not a Strong Number");
		}
	}

	
