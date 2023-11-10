package StrategyGame;
import java.util.Random;
public class Main {

	public static void main(String[] args) {
		int sayac=0;
		int player1toplam=0;
		int player2toplam=0;
				
		Random r=new Random();
		
		Player1 player1 = new Player1();
		Player2 player2 = new Player2();
		

		while(sayac!=5) {
			
			player1.setPower(r.nextInt(10));
			player1.setType(r.nextInt(2));
			
			player2.setPower(r.nextInt(10));
			player2.setType(r.nextInt(2));
			System.out.println("---1.Player Stats---");
			System.out.println(player1.getPower()+" "+player1.getTypeName());
			System.out.println("---2.Player Stats---");
			System.out.println(player2.getPower()+" "+player2.getTypeName());
			
			if(player1.getType()==player2.getType()) {
				if(player1.getPower()>player2.getPower()) {
					player1toplam=player1toplam+(player1.getPower()-player2.getPower());
					System.out.println("1. Player Win = "+(player1.getPower()-player2.getPower())+" points");
				}
				else if( player2.getPower()>player1.getPower()){
					player2toplam=player2toplam+(player2.getPower()-player1.getPower());
					System.out.println("2. Player Win = "+(player2.getPower()-player1.getPower())+" points");
				}
				else {
					System.out.println("No One Wins");
				}
			}
			else if( player1.getType()>player2.getType()) {
				player1toplam=player1toplam+10;
				System.out.println("Player 1 Win = 10 points");
			}
			else {
				player2toplam=player2toplam+10;
				System.out.println("Player 2 Win = 10 points");
			}
			
			
			sayac++;
			
		}
		
		System.out.println("1.Player Total Points= "+ player1toplam + "  -  " + "2.Player Total Points= "+ player2toplam);
		if(player1toplam>player2toplam) {
		  System.out.println("1.Player Win The Game");
		  
		}
		else if (player2toplam>player1toplam) {
			System.out.println("2.Player Win The Game");
		}
		else {
		    System.out.println("No One Wins");
		}
		
	}

}
