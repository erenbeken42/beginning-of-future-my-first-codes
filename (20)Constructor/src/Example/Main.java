package Example;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		
		Scanner inp = new Scanner(System.in);
		Human human1 = new Human(inp.nextLine(),inp.nextLine(),inp.nextInt(),inp.nextDouble(),inp.nextDouble());
		
		System.out.println(human1.getName());
		System.out.println(human1.getHeight());
		
	}

}
