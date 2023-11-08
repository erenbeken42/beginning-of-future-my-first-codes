package java2022;

public class Main {

	public static void main(String[] args) {

		int sayi1=32;
		int sayi2=65;
		int sayi3=96;
		
		int enbuyuk= sayi1;
		
		if(enbuyuk <sayi2) {
			enbuyuk= sayi2;
		}
		
		if(enbuyuk< sayi3) {
			enbuyuk= sayi3;
		}
		
		System.out.println("en büyük sayı:" + enbuyuk);

	}
}

