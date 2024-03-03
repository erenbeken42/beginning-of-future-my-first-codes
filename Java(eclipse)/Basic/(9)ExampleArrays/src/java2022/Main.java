package java2022;

public class Main {

	public static void main(String[] args) {
       	
		double[] myList = {1.2,1.6,1.7,3.4,5.3};
		double total=0;
		double max=myList[0];
		for(double number:myList) {
			if(number>max) {
				max=number;
			}
		   total=total+number;
		   System.out.println(number);
		}
		System.out.println(total);
		System.out.println(max);
	
	}  
}

