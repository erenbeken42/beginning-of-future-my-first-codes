
import java.util.Random;
public class Main {

	public static void main(String[] args) {
		Avatar avatar1[] = new Avatar[5];
		Avatar avatar2[] = new Avatar[5];
		Random r=new Random();
		int point1=0;
		int point2=0;
		

	for(int i=0; i<avatar1.length; i++) {
		avatar1[i] = new Avatar();
		avatar2[i] = new Avatar();
		avatar1[i].setPower(r.nextInt(10));
		avatar2[i].setPower(r.nextInt(10));
		avatar1[i].setType(r.nextInt(2));
		avatar2[i].setType(r.nextInt(2));
	}
	for(int i=0; i<avatar1.length; i++) {
		System.out.println("Type and power of player 1 in round "+(i+1)+"");
		System.out.println(avatar1[i].getType()+" "+avatar1[i].getPower());
		System.out.println("Type and power of player 2 in round "+(i+1)+"");
		System.out.println(avatar2[i].getType()+" "+avatar2[i].getPower());
	}
	
	
	
	
	for(int i=0; i<avatar1.length; i++) {
		if(avatar1[i].getType()==avatar2[i].getType()) {
			if(avatar1[i].getPower()>avatar2[i].getPower()) {
				point1=point1+avatar1[i].getPower()-avatar2[i].getPower();
			System.out.println("the winner of the round-"+(i+1)+" player 1"+ "points received this round: + "+(avatar1[i].getPower()-avatar2[i].getPower()));
			}
			else if(avatar1[i].getPower()<avatar2[i].getPower()) {
				point2=point2+avatar2[i].getPower()-avatar1[i].getPower();
				System.out.println("winner of round-"+(i+1)+" player 2"+" points received this round: + "+(avatar2[i].getPower()-avatar1[i].getPower()));}
			
			
			
			else {
				System.out.println("Nobody won in round"+(i+1));
			}
		
		}
	else if(avatar1[i].getType()>avatar2[i].getType()) {
		point1=point1+10;
			System.out.println("winner of the round"+(i+1)+ "is the 2nd player +10 earned this round");
		}
	else {
		point2=point2+10;
		System.out.println("winner of the round"+(i+1)+ "is the 2nd player +10 earned this round");
	}
	}
	if(point1>point2) {
		System.out.println("player 1 won with"+point1+"points");
	}
	else if(point2>point1) {
		System.out.println("player 1 won with"+point2+"points");
	}
	else {
		System.out.println("points equal, no one won"+point1);
	}
	}

}
