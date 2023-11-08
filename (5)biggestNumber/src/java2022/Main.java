package java2022;

public class Main {

	public static void main(String[] args) {

		int number1=32;
		int number2=65;
		int number3=96;
		
		int biggestNumber= number1;
		
		if(biggestNumber <number2) {
			biggestNumber= number2;
		}
		
		if(biggestNumber< number3) {
			biggestNumber= number3;
		}
		
		System.out.println("biggestNumber:" + biggestNumber);

	}
}

