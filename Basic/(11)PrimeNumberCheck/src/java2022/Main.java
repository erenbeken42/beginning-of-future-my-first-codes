package java2022;

public class Main {

	public static void main(String[] args) {
		int number=12;
		boolean isPrime=true;
		
		String message1="Prime";
		String message2="Not Prime";
		
		if(number==1) {
			System.out.println(message2);
			return;
		}
		
		if(number<1) {
			System.out.println("Geçersiz sayı");
			return;
		}
		
		for(int i=2;i<number;i++) {
			if(number % i == 0) {
				isPrime=false;
			}
		}
		
		if(isPrime==true) {
			System.out.println(message1);
		}else {
			System.out.println(message2);
		}
       		
       							

	
	}
}
