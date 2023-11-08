package java2022;

public class Main {

	public static void main(String[] args) {
		int[] numbers= new int [] {1,2,5,7,9,0};
		int toFind=17;
				
		for(int i=0; i<numbers.length ;i++) {
					if(toFind==numbers[i]) {
						System.out.println("Arrays Include This Number");
					return;
					}
						}
		System.out.println("Arrays Not Include This Number");
		
		
		System.out.println("-----------------") ;
		
		
		for(int number:numbers){
			if(number==toFind) {
				System.out.println("Arrays Include This Number");
			break;
			}
			else {
				System.out.println("Arrays Not Include This Number");
				break;
			}
		
		
		}
		
       		
       							

	
	}
}
