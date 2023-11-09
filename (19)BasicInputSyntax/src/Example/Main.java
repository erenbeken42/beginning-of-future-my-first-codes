package Example;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int s1;
		int s2;
		int t;
        String txt;
        
        
		
		System.out.println("Enter first integer: ");
		s1 = input.nextInt();
		System.out.println("Enter second integer: ");
		s2 = input.nextInt();
		t = s1 + s2;
		System.out.println("Total=" + t);
		System.out.println("------------------------------------------");

		
		Scanner inp = new Scanner(System.in);
		Example_Class example1 = new Example_Class();
		example1.Display();
		
		System.out.println("Enter Sentence=");
		txt=inp.nextLine();
		example1.Display2(txt);	

	}

}
